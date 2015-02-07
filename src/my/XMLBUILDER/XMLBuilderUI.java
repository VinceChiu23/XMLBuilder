/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.XMLBUILDER;

import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;

/**
 *
 * @author Administrator
 */
public class XMLBuilderUI extends javax.swing.JFrame {
    
    private boolean searchDown = true;
    private int searchPos = 0;
    private String lastSearchText;
    private ArrayList<Integer> indexHit;

    /**
     * Creates new form XMLBuilderUI
     */
    public XMLBuilderUI() {
        initComponents();
        resultArea.add(resultsPopupMenu);
        resultArea.setComponentPopupMenu(resultsPopupMenu);
        srcTextField.add(copyPasteSelectAll);
        srcTextField.setComponentPopupMenu(copyPasteSelectAll);
        classNameTextField.add(classNamePopup);
        classNameTextField.setComponentPopupMenu(classNamePopup);
        searchDialog.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        resultsPopupMenu = new javax.swing.JPopupMenu();
        copy = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        rsltSelectAll = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        resultSearchBut = new javax.swing.JMenuItem();
        copyPasteSelectAll = new javax.swing.JPopupMenu();
        copySrc = new javax.swing.JMenuItem();
        pasteSrc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        selectAllSrc = new javax.swing.JMenuItem();
        classNamePopup = new javax.swing.JPopupMenu();
        copyClassName = new javax.swing.JMenuItem();
        pasteClassName = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        selectAllClassName = new javax.swing.JMenuItem();
        searchDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        findNextButton = new javax.swing.JButton();
        searchUpRadio = new javax.swing.JRadioButton();
        searchDownRadio = new javax.swing.JRadioButton();
        warningMsg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        srcButton = new javax.swing.JButton();
        srcTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        classNameTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\"));
            jFileChooser1.setFileFilter(new MyCustomFilter());

            copy.setText("Copy");
            copy.setToolTipText("");
            copy.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    copyActionPerformed(evt);
                }
            });
            resultsPopupMenu.add(copy);
            resultsPopupMenu.add(jSeparator2);

            rsltSelectAll.setText("Select All");
            rsltSelectAll.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rsltSelectAllActionPerformed(evt);
                }
            });
            resultsPopupMenu.add(rsltSelectAll);
            resultsPopupMenu.add(jSeparator4);

            resultSearchBut.setText("Find");
            resultSearchBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    resultSearchButActionPerformed(evt);
                }
            });
            resultsPopupMenu.add(resultSearchBut);

            copySrc.setText("Copy");
            copySrc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    copySrcActionPerformed(evt);
                }
            });
            copyPasteSelectAll.add(copySrc);

            pasteSrc.setText("Paste");
            pasteSrc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pasteSrcActionPerformed(evt);
                }
            });
            copyPasteSelectAll.add(pasteSrc);
            copyPasteSelectAll.add(jSeparator1);

            selectAllSrc.setText("SelectAll");
            selectAllSrc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    selectAllSrcActionPerformed(evt);
                }
            });
            copyPasteSelectAll.add(selectAllSrc);

            copyClassName.setText("Copy");
            copyClassName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    copyClassNameActionPerformed(evt);
                }
            });
            classNamePopup.add(copyClassName);

            pasteClassName.setText("Paste");
            pasteClassName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pasteClassNameActionPerformed(evt);
                }
            });
            classNamePopup.add(pasteClassName);
            classNamePopup.add(jSeparator3);

            selectAllClassName.setText("Select All");
            selectAllClassName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    selectAllClassNameActionPerformed(evt);
                }
            });
            classNamePopup.add(selectAllClassName);

            searchDialog.setTitle("Find");

            searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    searchTextFieldKeyPressed(evt);
                }
            });

            findNextButton.setText("Find Next");
            findNextButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    findNextButtonActionPerformed(evt);
                }
            });

            searchUpRadio.setText("Up");
            searchUpRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchUpRadioActionPerformed(evt);
                }
            });

            searchDownRadio.setSelected(true);
            searchDownRadio.setText("Down");
            searchDownRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchDownRadioActionPerformed(evt);
                }
            });

            warningMsg.setForeground(new java.awt.Color(255, 0, 51));

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(warningMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchTextField)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(searchUpRadio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchDownRadio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(findNextButton)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(warningMsg)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchDownRadio)
                            .addComponent(searchUpRadio))
                        .addComponent(findNextButton))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout searchDialogLayout = new javax.swing.GroupLayout(searchDialog.getContentPane());
            searchDialog.getContentPane().setLayout(searchDialogLayout);
            searchDialogLayout.setHorizontalGroup(
                searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            searchDialogLayout.setVerticalGroup(
                searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(searchDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("XML Builder");

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "v1.1", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM));

            srcButton.setText("Source File:");
            srcButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    srcButtonActionPerformed(evt);
                }
            });

            srcTextField.setText("C:\\...\\tests\\BasePlatform.java");
            srcTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    srcTextFieldKeyPressed(evt);
                }
            });

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("ClassName:");

            classNameTextField.setText("qatf.projects.mcqueen.tests.BasePlatform.java");

            generateButton.setText("Generate");
            generateButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    generateButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(srcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(srcTextField)
                                .addComponent(classNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(generateButton)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(srcButton)
                        .addComponent(srcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(classNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(generateButton)
                    .addGap(14, 14, 14))
            );

            resultArea.setEditable(false);
            resultArea.setColumns(20);
            resultArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
            resultArea.setRows(5);
            resultArea.setTabSize(3);
            resultArea.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    resultAreaKeyPressed(evt);
                }
            });
            jScrollPane1.setViewportView(resultArea);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void srcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcButtonActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = jFileChooser1.getSelectedFile();
        String filePath = file.getAbsolutePath();
        srcTextField.setText(filePath);
        generateClassName();
//        XMLBuilder.fileToRead = file.getAbsolutePath();
//        try {
//          // What to do with the file, e.g. display it in a TextArea
//          //textarea.read( new FileReader( file.getAbsolutePath() ), null );
//        } catch (IOException ex) {
//          System.out.println("problem accessing file"+file.getAbsolutePath());
//        }
    } else {
        System.out.println("File access cancelled by user.");
    }
    }//GEN-LAST:event_srcButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        generateXML();
        resultArea.setCaretPosition(0);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here
        resultArea.requestFocusInWindow();
        resultArea.copy();
    }//GEN-LAST:event_copyActionPerformed

    private void srcTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            generateClassName();
            generateXML();
        }
    }//GEN-LAST:event_srcTextFieldKeyPressed

    private void copySrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copySrcActionPerformed
        // TODO add your handling code here:
        srcTextField.requestFocusInWindow();
        srcTextField.copy();
    }//GEN-LAST:event_copySrcActionPerformed

    private void pasteSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteSrcActionPerformed
        // TODO add your handling code here:
        srcTextField.requestFocusInWindow();
        srcTextField.paste();
    }//GEN-LAST:event_pasteSrcActionPerformed

    private void selectAllSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllSrcActionPerformed
        // TODO add your handling code here:
        srcTextField.requestFocusInWindow();
        srcTextField.selectAll();
    }//GEN-LAST:event_selectAllSrcActionPerformed

    private void rsltSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltSelectAllActionPerformed
        // TODO add your handling code here:
        resultArea.requestFocusInWindow();
        resultArea.selectAll();
    }//GEN-LAST:event_rsltSelectAllActionPerformed

    private void copyClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyClassNameActionPerformed
        // TODO add your handling code here:
        classNameTextField.requestFocusInWindow();
        classNameTextField.copy();
    }//GEN-LAST:event_copyClassNameActionPerformed

    private void pasteClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteClassNameActionPerformed
        // TODO add your handling code here:
        classNameTextField.requestFocusInWindow();
        classNameTextField.paste();
    }//GEN-LAST:event_pasteClassNameActionPerformed

    private void selectAllClassNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllClassNameActionPerformed
        // TODO add your handling code here:
        classNameTextField.requestFocusInWindow();
        classNameTextField.selectAll();
    }//GEN-LAST:event_selectAllClassNameActionPerformed

    private void resultAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultAreaKeyPressed
        // TODO add your handling code here:
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_F) {
            System.out.println("Ctrl F is pressed - start search box");
            searchDialog.pack();
            searchDialog.setVisible(true);
        }
    }//GEN-LAST:event_resultAreaKeyPressed

    private void searchUpRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUpRadioActionPerformed
        // TODO add your handling code here:
        searchUpRadio.setSelected(true);
        searchDownRadio.setSelected(false);
        searchDown=false;
        System.out.println("Setting serach to up");
    }//GEN-LAST:event_searchUpRadioActionPerformed

    private void searchDownRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDownRadioActionPerformed
        // TODO add your handling code here:
        searchDownRadio.setSelected(true);
        searchUpRadio.setSelected(false);
        searchDown=true;
    }//GEN-LAST:event_searchDownRadioActionPerformed

    private void findNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNextButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Start searching...");
        searchText(searchTextField.getText(), resultArea.getCaretPosition(), searchDown);
        
    }//GEN-LAST:event_findNextButtonActionPerformed

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchText(searchTextField.getText(), resultArea.getCaretPosition(), searchDown);
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void resultSearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultSearchButActionPerformed
        // TODO add your handling code here:
        resultArea.requestFocusInWindow();
        searchDialog.pack();
        searchDialog.setVisible(true);
    }//GEN-LAST:event_resultSearchButActionPerformed

    public void searchText(String text, int searchPos, boolean isDown) {
//        searchDialog.pack();
        warningMsg.setText(null);
        // If there's nothing in the search box
        if (text.length() == 0) {
            warningMsg.setText("Search box cannot be empty");
            searchDialog.pack();
            return;
        }
        // Fail if there's nothing in result
        if (resultArea.getText().isEmpty()) {
            return;
        }
        // First Run - Build Index
        if (!text.equals(lastSearchText)) {
            lastSearchText = text;
            indexHit = new ArrayList<Integer>();
            int startingPos = searchPos;
            text = text.toLowerCase();
            String result = resultArea.getText().toLowerCase();
            // check to see if it contains text:
            if (!result.contains(text)) {
                System.out.println("Not Found");
                warningMsg.setText("Entry not found");
                searchDialog.pack();
                return;
            }
            int index = 0;
            while (index != -1) {
                int hit = result.indexOf(text, index);
                if (hit == -1) {
                    break;
                }
                indexHit.add(hit);
//                System.out.println("Adding index = " + index);
                index = hit + 1;
            }
        }
        // Now that we have the index, highlight the one we want.
        resultArea.requestFocusInWindow();
        boolean nextItem = false;
        if (isDown) {
            // highlight the next biggest one.
            for (int i = 0; i < indexHit.size(); i++) {
                if (indexHit.get(i) >= searchPos) {
                    try {
//                        System.out.println("This area is lit up = " + indexHit.get(i));
                        Rectangle viewRect = resultArea.modelToView(indexHit.get(i));
                        resultArea.scrollRectToVisible(viewRect);
                        resultArea.setCaretPosition(indexHit.get(i));
                        resultArea.moveCaretPosition(indexHit.get(i) + text.length());
                        //nextItem = true;
                        return;
                    } catch (BadLocationException ex) {
                        Logger.getLogger(XMLBuilderUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (i == indexHit.size() - 1) {
                    searchPos = 0;
                    i = -1;
                }
            }
        } // going up
        else {
            searchPos = resultArea.getSelectionStart() - 1;
            for (int i = indexHit.size() - 1; i >= 0; i--) {
                if (indexHit.get(i) < searchPos) {
                    try {
//                        System.out.println("This area is lit up = " + indexHit.get(i));
                        Rectangle viewRect = resultArea.modelToView(indexHit.get(i));
                        resultArea.scrollRectToVisible(viewRect);
                        resultArea.setCaretPosition(indexHit.get(i));
                        resultArea.moveCaretPosition(indexHit.get(i) + text.length());
                        //nextItem = true;
                        return;
                    } catch (BadLocationException ex) {
                        Logger.getLogger(XMLBuilderUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (i == 0) {
                    searchPos = resultArea.getText().length();
                    i = indexHit.size();
                }
            }
        }
    }
    
    private void generateXML() {
        String result = XMLBuilder.build(srcTextField.getText(), classNameTextField.getText());
        resultArea.setText(result);
    }
    
    private void generateClassName() {
        String filePath = srcTextField.getText();
            String className = XMLBuilder.findClassName(filePath);
        if (className != null) {
            classNameTextField.setText(className);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XMLBuilderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XMLBuilderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XMLBuilderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XMLBuilderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XMLBuilderUI().setVisible(true);
            }
        });
    }
    
         private class MyCustomFilter extends javax.swing.filechooser.FileFilter {
             
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".java");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Java Files (*.java)";
        }
    }
         
         
         


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu classNamePopup;
    private javax.swing.JTextField classNameTextField;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem copyClassName;
    private javax.swing.JPopupMenu copyPasteSelectAll;
    private javax.swing.JMenuItem copySrc;
    private javax.swing.JButton findNextButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem pasteClassName;
    private javax.swing.JMenuItem pasteSrc;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JMenuItem resultSearchBut;
    private javax.swing.JPopupMenu resultsPopupMenu;
    private javax.swing.JMenuItem rsltSelectAll;
    private javax.swing.JDialog searchDialog;
    private javax.swing.JRadioButton searchDownRadio;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JRadioButton searchUpRadio;
    private javax.swing.JMenuItem selectAllClassName;
    private javax.swing.JMenuItem selectAllSrc;
    private javax.swing.JButton srcButton;
    private javax.swing.JTextField srcTextField;
    private javax.swing.JLabel warningMsg;
    // End of variables declaration//GEN-END:variables
}

