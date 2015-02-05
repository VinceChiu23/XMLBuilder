package my.XMLBUILDER;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Modified on 1.30.14 to include GUI
 * Created by Vincent Chiu on 6/25/14.
 * Helper class to generate TestNG XML for TestNG
 */

public class XMLBuilder {

    // Build the XML given the className and the filePath
    public static String build(String fileToRead, String className){

        String result = "";
        
        System.out.println("Lets build some XMLs");
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileToRead));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
                if (currentLine.trim().startsWith("@Test")) {
                    do {
                        currentLine = br.readLine().trim();
                    } while (!(currentLine.startsWith("public") || currentLine.startsWith("protected") || currentLine.startsWith("private") || currentLine.startsWith("internal")));
 //               if (currentLine.trim().startsWith("public void")) {
                    String methodLine ="";
                    int count = 0;
                    do {
                        methodLine = methodLine.concat(currentLine).trim();
//                        System.out.println(currentLine);
                        for (int i=0; i <currentLine.length(); i++) {
                            char ch = currentLine.charAt(i);
                            if (ch == '(') {
                                count++;
                            }
                            if (ch == ')') {
                                count--;
                            }
                        }
                        currentLine = br.readLine();
                    }
                    while (count != 0);
//                    System.out.println("This is the MethodLine =" + methodLine);
                    result = result + "\n"+ generateXMLFromString(methodLine, className);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        System.out.println("\n\nDone");

        return result;

    }

    /**
     * Generate the XML based on the method
     * @param method - String representation of the method in (public static void methodName(arg))
     * @param className - Class name of the java file. 
     * @return 
     */
    private static String generateXMLFromString(String method, String className) {
        int firstParenthesis = method.indexOf("(");
        int lastParenthesis = method.lastIndexOf(")");
        String[] methodSection = method.substring(0,firstParenthesis).split(" ");
        String methodName = methodSection[methodSection.length-1];
//        System.out.println("methodName = " + methodName);
        String xml = "<test name=\"" + methodName + "\" preserve-order=\"true\">\n";
        String allParams = method.substring(firstParenthesis + 1, lastParenthesis).trim();
//        System.out.println("This is the temp string = " + allParams);
        String[] stringValue = allParams.split(",");
        String temp = "";
        for (String i: stringValue) {
            String optValue = "\"\"";
            i = temp + i;
            i = i.trim();
            int count = 0;
            for (int s=0; s <i.length(); s++) {
                char ch = i.charAt(s);
                if (ch == '(') {
                    count++;
                }
                if (ch == ')') {
                    count--;
                }
            }
            if (count != 0) {
                temp = i +",";
            }
            else {
                if (i.startsWith("@Optional")) {
                    optValue = i.substring(i.indexOf('\"'), i.lastIndexOf('\"')+1);
                }
//                System.out.println("ParamName = " + i.substring(i.lastIndexOf(" ")+1));
//                System.out.println("Optional value = " + optValue);
                if (i.substring(0, i.indexOf(" ")).equalsIgnoreCase("ITestContext"))
                    break;
                else {
                String paramName = i.substring(i.lastIndexOf(" ")+1);
                xml = xml + "\t<parameter name=\"" + paramName + "\" ";
                xml = xml + "value=" + optValue + " />\n";
                count = 0;
                temp = "";
                }
            }
        }
        xml = xml + "\t<classes>\n";
        xml = xml + "\t\t<class name =\"" + className + "\">\n";
        xml = xml + "\t\t\t<methods>\n";
        xml = xml + "\t\t\t\t<include name=\"" + methodName + "\" />\n";
        xml = xml + "\t\t\t</methods>\n";
        xml = xml + "\t\t</class>\n";
        xml = xml + "\t</classes>\n";
        xml = xml + "</test>\n";
        System.out.println(xml);


        return xml;
    }

    // Auto generate the class name based on the file path
    public static String findClassName(String fileName) {
        if (fileName.contains("qatf")) {
        int lastIndex = fileName.lastIndexOf("qatf");
        fileName = fileName.substring(lastIndex);
        fileName = fileName.replaceAll("\\\\", ".");
        fileName = fileName.substring(0, fileName.lastIndexOf(".java"));
        return fileName;
        }
        else {
            return null;
        }
    }
}
