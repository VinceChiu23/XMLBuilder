# XMLBuilder
A simple tool for generating testng.xml for TestNG framework.

Requirement:

 - Java 6

Usage:

1. Select your source code file by clicking the "Source File" button or entering the full path in the source file entry field.
2. Enter the classname that corresponds to the methods in your class/source file in the ClassName entry field.
3. Click on "Generate" button.

Features:

- The tool automatically geneartes a testng.xml file based on the source file and classname given in step 1 and 2. 
- It generates a new test for each @Test method in the source file. 
- All required and optional parameters of the method are included in the test. Optional parameters include any associated default value.





