/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kids_learner;

import java.awt.Color;


import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home2
     */
    public Home() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        alphaButton = new javax.swing.JPanel();
        alphabetButton = new javax.swing.JLabel();
        numberPanel = new javax.swing.JPanel();
        numberButton = new javax.swing.JLabel();
        mathPanel = new javax.swing.JPanel();
        mathButton = new javax.swing.JLabel();
        practicePanel = new javax.swing.JPanel();
        Practice = new javax.swing.JLabel();
        progressPanel = new javax.swing.JPanel();
        progressButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(199, 76, 147));

        jLabel1.setBackground(new java.awt.Color(153, 103, 132));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 209));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kids Learning Software");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 90));

        jPanel3.setBackground(new java.awt.Color(141, 54, 151));

        alphaButton.setBackground(new java.awt.Color(255, 255, 255));
        alphaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alphaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alphaButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alphaButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                alphaButtonMouseReleased(evt);
            }
        });

        alphabetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alphabetButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alphabetButton.setText("Alphabet");
        alphabetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alphabetButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alphabetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alphabetButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout alphaButtonLayout = new javax.swing.GroupLayout(alphaButton);
        alphaButton.setLayout(alphaButtonLayout);
        alphaButtonLayout.setHorizontalGroup(
            alphaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alphabetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        alphaButtonLayout.setVerticalGroup(
            alphaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alphabetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        numberPanel.setBackground(new java.awt.Color(255, 255, 255));
        numberPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numberPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numberPanelMouseExited(evt);
            }
        });

        numberButton.setBackground(new java.awt.Color(255, 255, 255));
        numberButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numberButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberButton.setText("Number");
        numberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numberButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numberButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout numberPanelLayout = new javax.swing.GroupLayout(numberPanel);
        numberPanel.setLayout(numberPanelLayout);
        numberPanelLayout.setHorizontalGroup(
            numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numberButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        numberPanelLayout.setVerticalGroup(
            numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        mathPanel.setBackground(new java.awt.Color(255, 255, 255));

        mathButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mathButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mathButton.setText("Math");
        mathButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mathButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mathButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mathButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mathPanelLayout = new javax.swing.GroupLayout(mathPanel);
        mathPanel.setLayout(mathPanelLayout);
        mathPanelLayout.setHorizontalGroup(
            mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mathButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mathPanelLayout.setVerticalGroup(
            mathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mathButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        practicePanel.setBackground(new java.awt.Color(255, 255, 255));

        Practice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Practice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice.setText("Practice");
        Practice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PracticeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PracticeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout practicePanelLayout = new javax.swing.GroupLayout(practicePanel);
        practicePanel.setLayout(practicePanelLayout);
        practicePanelLayout.setHorizontalGroup(
            practicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        practicePanelLayout.setVerticalGroup(
            practicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        progressPanel.setBackground(new java.awt.Color(255, 255, 255));

        progressButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        progressButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressButton.setText("Progress");
        progressButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                progressButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                progressButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(practicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mathPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alphaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(alphaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mathPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(practicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 370));

        jPanel4.setBackground(new java.awt.Color(235, 172, 213));

        t.setColumns(20);
        t.setFont(new java.awt.Font("STLiti", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(102, 0, 102));
        t.setRows(5);
        jScrollPane2.setViewportView(t);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 590, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progressButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressButtonMouseClicked
        // TODO add your handling code here:
        t.setText("sdsncsncnscn  cdnksc  sd c cd c sd c       ");
    }//GEN-LAST:event_progressButtonMouseClicked

    private void mathButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathButtonMouseEntered
          mathPanel.setBackground(Color.pink);
        t.setText("You can learn some easy and \ninteresting math with proper realistic \nexamples.\n");
    }//GEN-LAST:event_mathButtonMouseEntered

    private void numberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberButtonMouseClicked
        // TODO add your handling code here:
        numberButton.setBackground(Color.orange);
      
    }//GEN-LAST:event_numberButtonMouseClicked

    private void alphaButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphaButtonMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_alphaButtonMouseReleased

    private void alphaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphaButtonMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_alphaButtonMousePressed

    private void alphaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphaButtonMouseExited
        // TODO add your handling code here:
        alphaButton.setBackground(Color.white);
    }//GEN-LAST:event_alphaButtonMouseExited

    private void alphaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphaButtonMouseEntered
        // TODO add your handling code here:
       // alphaButton.setBackground(Color.pink);
    }//GEN-LAST:event_alphaButtonMouseEntered

    private void alphabetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphabetButtonMouseExited
       alphaButton.setBackground(Color.white);        
    }//GEN-LAST:event_alphabetButtonMouseExited

    private void alphabetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphabetButtonMouseEntered
       
        //set text and bg color.........................
         alphaButton.setBackground(Color.pink);
        t.setText("You can learn the English alphabet\n"
                + " consisting of 26 letters, each having\n"
                + " an upper- and lower-case form also learn\n"
                + "vowels and consonants. ");
        

    }//GEN-LAST:event_alphabetButtonMouseEntered

    private void alphabetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alphabetButtonMouseClicked
        // TODO add your handling code here:
       Math m = new Math();
       m.setVisible(true);

    }//GEN-LAST:event_alphabetButtonMouseClicked

    private void numberButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberButtonMouseEntered
        // TODO add your handling code here:
       
        t.setText("kids can learn English numbers with\n"
                + " spelling"
                + " and visualize the number.");
        numberPanel.setBackground(Color.pink);
    }//GEN-LAST:event_numberButtonMouseEntered

    private void numberButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberButtonMouseExited
        // TODO add your handling code here:
         numberPanel.setBackground(Color.white);
    }//GEN-LAST:event_numberButtonMouseExited

    private void mathButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathButtonMouseClicked
        Math m = new Math();
        m.setVisible(true);
    }//GEN-LAST:event_mathButtonMouseClicked

    private void PracticeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracticeMouseEntered
        // TODO add your handling code here:
           practicePanel.setBackground(Color.pink);
        t.setText("You can practice what you learned before");
    }//GEN-LAST:event_PracticeMouseEntered

    private void progressButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressButtonMouseEntered
        // TODO add your handling code here: 
        progressPanel.setBackground(Color.pink);
        t.setText("Guardians can show their \nkids’ progress.");
    }//GEN-LAST:event_progressButtonMouseEntered

    private void numberPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberPanelMouseEntered
        // TODO add your handling code here:
       // numberPanel.setBackground(Color.red);
    }//GEN-LAST:event_numberPanelMouseEntered

    private void numberPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberPanelMouseExited
        // TODO add your handling code here:
       // numberPanel.setBackground(Color.white);
    }//GEN-LAST:event_numberPanelMouseExited

    private void mathButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathButtonMouseExited
        // TODO add your handling code here:
        mathPanel.setBackground(Color.white);
    }//GEN-LAST:event_mathButtonMouseExited

    private void PracticeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracticeMouseExited
        // TODO add your handling code here:
         practicePanel.setBackground(Color.white);
    }//GEN-LAST:event_PracticeMouseExited

    private void progressButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressButtonMouseExited
        // TODO add your handling code here:
        progressPanel.setBackground(Color.white);
    }//GEN-LAST:event_progressButtonMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Practice;
    private javax.swing.JPanel alphaButton;
    private javax.swing.JLabel alphabetButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mathButton;
    private javax.swing.JPanel mathPanel;
    private javax.swing.JLabel numberButton;
    private javax.swing.JPanel numberPanel;
    private javax.swing.JPanel practicePanel;
    private javax.swing.JLabel progressButton;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JTextArea t;
    // End of variables declaration//GEN-END:variables
}
