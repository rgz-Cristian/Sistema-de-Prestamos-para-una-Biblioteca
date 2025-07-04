/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import modules.LibraryManagement;
import modules.LibraryServices;
import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;

/**
 *
 * @author Rosbel
 */
public class PantallaFuncional extends javax.swing.JFrame {
        
        private ILibraryServices services;
        private LibraryManagement libraryManagement;
    

    /**
     * Creates new form paginaFuncional
     */
    public PantallaFuncional() {
        initComponents();
         services = new LibraryServices();
         libraryManagement = new LibraryManagement(services);
          this.setLocationRelativeTo(null);
    }
    
    public PantallaFuncional(LibraryManagement libraryManagement){
        initComponents();
        this.libraryManagement = libraryManagement;
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        botonBuscarTitulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        findTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonBuscarAutor = new javax.swing.JButton();
        botonBuscarID = new javax.swing.JButton();
        LoanManagementScreen = new javax.swing.JButton();
        BookManagementScreen = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salirButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema-de-Prestamos-para-una-Biblioteca");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 102));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setToolTipText("Gestión de Biblioteca");
        jDesktopPane1.setRequestFocusEnabled(false);

        botonBuscarTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscarTitulo.setText("Buscar por Titulo");
        botonBuscarTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarTituloActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Libro:");

        findTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazGrafica/imagen/logo.png"))); // NOI18N

        botonBuscarAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscarAutor.setText("Buscar por Autor");
        botonBuscarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAutorActionPerformed(evt);
            }
        });

        botonBuscarID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscarID.setText("Buscar por ID");
        botonBuscarID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarIDActionPerformed(evt);
            }
        });

        LoanManagementScreen.setBackground(new java.awt.Color(153, 153, 153));
        LoanManagementScreen.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        LoanManagementScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazGrafica/imagen/prestado.png"))); // NOI18N
        LoanManagementScreen.setText("Registros");
        LoanManagementScreen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        LoanManagementScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoanManagementScreen.setFocusable(false);
        LoanManagementScreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoanManagementScreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LoanManagementScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanManagementScreenActionPerformed(evt);
            }
        });

        BookManagementScreen.setBackground(new java.awt.Color(0, 0, 0));
        BookManagementScreen.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        BookManagementScreen.setForeground(new java.awt.Color(255, 204, 0));
        BookManagementScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazGrafica/imagen/Add.png"))); // NOI18N
        BookManagementScreen.setText("Gestión de Libros");
        BookManagementScreen.setBorder(null);
        BookManagementScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookManagementScreen.setFocusable(false);
        BookManagementScreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookManagementScreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BookManagementScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookManagementScreenActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(botonBuscarTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(findTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonBuscarAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonBuscarID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LoanManagementScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BookManagementScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(LoanManagementScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(BookManagementScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findTextField)
                        .addGap(18, 18, 18)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscarTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarAutor, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookManagementScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanManagementScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Nueva Biblioteca");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cargar Biblioteca");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        jMenu1.add(salirButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Añadir Libro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenu3.setText("Añadir Registro");

        jMenuItem5.setText("Registro Devolución");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem4.setText("Registro Préstamo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Acerca de");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Info");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookManagementScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookManagementScreenActionPerformed
        // TODO add your handling code here:
    BookManagementScreen addBookForm = new BookManagementScreen (libraryManagement);
        addBookForm.setVisible(true);
    }//GEN-LAST:event_BookManagementScreenActionPerformed

    private void botonBuscarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarTituloActionPerformed
        // TODO add your handling code here:
        String text;
            text = findTextField.getText();
        IBook book = libraryManagement.findByTitle(text);
        if (book != null){
            InfoBook form = new InfoBook(libraryManagement, book);
            form.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }//GEN-LAST:event_botonBuscarTituloActionPerformed

    private void LoanManagementScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanManagementScreenActionPerformed
        // TODO add your handling code here:
         LoanManagementScreen prestados = new LoanManagementScreen(libraryManagement);
        prestados.setVisible(true);
    }//GEN-LAST:event_LoanManagementScreenActionPerformed

    private void botonBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAutorActionPerformed
        // TODO add your handling code here:
        if (findTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene el campo");
        } else{
            IBook book = libraryManagement.findByAuthor(getTextField());
            if (book != null){
                InfoBook form = new InfoBook(libraryManagement, book);
                form.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
            } 
        }
    }//GEN-LAST:event_botonBuscarAutorActionPerformed

    private String getTextField(){
        return findTextField.getText();
    }
    
    private void botonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIDActionPerformed
        // TODO add your handling code here:4
        if (findTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene el campo");
        } else{
        IBook book = libraryManagement.findByID(getTextField());
        if (book != null){
            InfoBook form = new InfoBook(libraryManagement, book);
            form.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
        }
    }//GEN-LAST:event_botonBuscarIDActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        System.exit(-1);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
            int confirmDialog;
            confirmDialog = JOptionPane.showConfirmDialog(null, "Confirme Borrar todos los datos", "Desea reiniciar el sistema a por defecto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmDialog == JOptionPane.YES_OPTION){
                services = new LibraryServices();
                libraryManagement = new LibraryManagement(services);
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cuando nos den base de datos le ponemos esta función :)");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        CreateDevolutionScreen form = new CreateDevolutionScreen(libraryManagement);
        form.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CreateLoanRegisterScreen form = new CreateLoanRegisterScreen(libraryManagement);
        form.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Proyecto final de IGSW\r\n"
                + "Estudiantes: \r\n"
                + "- Ernesto Puerto: Planificación de la fase de pruebas \r\n"
                + "- Cristian Rdguez: Desarrollo del Backend \r\n"
                + "- Jorge Rosbel: Desarrollo del Frontend \r\n"
                + "- Pablo Gzalez: Construcción del UML"
               );
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AddBooksScreen form = new AddBooksScreen(libraryManagement);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaFuncional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PantallaFuncional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookManagementScreen;
    private javax.swing.JButton LoanManagementScreen;
    private javax.swing.JButton botonBuscarAutor;
    private javax.swing.JButton botonBuscarID;
    private javax.swing.JButton botonBuscarTitulo;
    private javax.swing.JTextField findTextField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem salirButton;
    // End of variables declaration//GEN-END:variables
}
