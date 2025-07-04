/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modules.Book;
import modules.DevolutionRegister;
import modules.LibraryManagement;
import modules.LoanRegister;
import modules.Register;

/**
 *
 * @author Rosbel
 */
public class LoanManagementScreen extends javax.swing.JDialog {

    DefaultListModel<Register> modelDev;
    
    DefaultListModel<Register> modelPres;

    LibraryManagement libraryManagement = null;
    /**
     * Creates new form LoanManagementScreen
     */
    public LoanManagementScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    
     public LoanManagementScreen(LibraryManagement libraryManagement) {
        initComponents();
         this.libraryManagement = libraryManagement;
         modelDev = new DefaultListModel<>();
         modelPres = new DefaultListModel<>();
         initListModel();
    }
    
        private void initListModel() {
            modelDev.clear();
            modelPres.clear();
            for (Register r: libraryManagement.getRegistros()){
                if (r instanceof DevolutionRegister)
                    modelDev.addElement( r);
            for (Register y: libraryManagement.getRegistros())
                if ( r instanceof LoanRegister)
                    modelPres.addElement(r);
            listPrestamos.setModel(modelPres);
            listDevolutions.setModel(modelDev);
           }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        listDevlutionRegisters = new javax.swing.JScrollPane();
        listPrestamos = new javax.swing.JList<>();
        addButtonPres = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDevolutions = new javax.swing.JList<>();
        addButtonDev = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        listDevlutionRegisters.setViewportView(listPrestamos);

        addButtonPres.setText("Añadir Préstamo");
        addButtonPres.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                addButtonPresAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addButtonPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPresActionPerformed(evt);
            }
        });

        jButton5.setText("Mostrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Editar Préstamo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        refreshButton1.setText("Refrescar");
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listDevlutionRegisters, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addButtonPres, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(refreshButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(listDevlutionRegisters, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButtonPres)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(refreshButton1))
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Registro de Préstamo", jPanel1);

        jScrollPane1.setViewportView(listDevolutions);

        addButtonDev.setText("Añadir Devolución");
        addButtonDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonDevActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar Registro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        refreshButton.setText("Refrescar");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButtonDev, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButtonDev)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(refreshButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro de Devolución", jPanel2);

        jLabel1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Registros");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazGrafica/imagen/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonDevActionPerformed
        // TODO add your handling code here:
        CreateDevolutionScreen formAddBook = new CreateDevolutionScreen(libraryManagement);
        formAddBook.setVisible(true);
    }//GEN-LAST:event_addButtonDevActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Register register = listDevolutions.getSelectedValue();
        if (register != null){
            JOptionPane.showMessageDialog(null,
                    "Registro: " + "ID = " + register.getIdRegister() + 
                            ", Título = " + register.getBook().getTitle() + 
                            ", Autor = " + register.getBook().getAuthor() + 
                            ", Dia = " + ((DevolutionRegister)register).getDevolutionDate());
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Register r = listDevolutions.getSelectedValue();
        EditDevolutionRegisterScreen form = new EditDevolutionRegisterScreen(libraryManagement, r);
        form.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        initListModel();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPresActionPerformed
        // TODO add your handling code here:
        CreateLoanRegisterScreen form = new CreateLoanRegisterScreen(libraryManagement);
        form.setVisible(true);
    }//GEN-LAST:event_addButtonPresActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LoanRegister register = (LoanRegister) listPrestamos.getSelectedValue();
        if (register != null){
            JOptionPane.showMessageDialog(null,
                    "Registro: " + "ID = " + register.getIdRegister() + 
                            ", Título = " + register.getBook().getTitle() + 
                            ", Autor = " + register.getBook().getAuthor() + 
                            ", Fecha Esperada = " + register.getDevolutionHopedDate() +
                            ", Fecha Registrada = " + register.getLoanDate());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        // TODO add your handling code here:
        initListModel();
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void addButtonPresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_addButtonPresAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonPresAncestorAdded

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
            java.util.logging.Logger.getLogger(LoanManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanManagementScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoanManagementScreen dialog = new LoanManagementScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButtonDev;
    private javax.swing.JButton addButtonPres;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane listDevlutionRegisters;
    private javax.swing.JList<Register> listDevolutions;
    private javax.swing.JList<Register> listPrestamos;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton1;
    // End of variables declaration//GEN-END:variables
}
