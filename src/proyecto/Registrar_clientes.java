/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class Registrar_clientes extends javax.swing.JFrame {
    private String codigo;
    private int xMouse;
    private int yMouse;

    /**
     * Creates new form Registrar_clientes
     */
    public Registrar_clientes() {
        initComponents();
        this.codigo="";
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
        hideBtn = new javax.swing.JPanel();
        hideTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        backBtn = new javax.swing.JPanel();
        backTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Dni = new javax.swing.JLabel();
        DVeri = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Enviarcodigo = new javax.swing.JPanel();
        nEnviarcodigo = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        nNombre = new javax.swing.JTextField();
        nDni = new javax.swing.JTextField();
        nEmail = new javax.swing.JTextField();
        nApellidos = new javax.swing.JTextField();
        nDigito = new javax.swing.JTextField();
        nCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(980, 570));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 570));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 570));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hideBtn.setBackground(new java.awt.Color(255, 255, 255));

        hideTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        hideTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideTxt.setText("━");
        hideTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hideTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        hideTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hideTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hideTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hideBtnLayout = new javax.swing.GroupLayout(hideBtn);
        hideBtn.setLayout(hideBtnLayout);
        hideBtnLayout.setHorizontalGroup(
            hideBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hideBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hideTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        hideBtnLayout.setVerticalGroup(
            hideBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hideBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hideTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(hideBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));

        backTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        backTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backTxt.setText("\t←");
        backTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        backTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backBtnLayout = new javax.swing.GroupLayout(backBtn);
        backBtn.setLayout(backBtnLayout);
        backBtnLayout.setHorizontalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backBtnLayout.setVerticalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        Nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Nombre.setText("Nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 113, 124, -1));

        Apellidos.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Apellidos.setText("Apellidos");
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 169, -1, 38));

        Dni.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Dni.setText("Dni");
        jPanel1.add(Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 56, 38, 38));

        DVeri.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        DVeri.setText("Digito Verificador");
        jPanel1.add(DVeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 225, -1, 38));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 81, -1, -1));

        Email.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Email.setText("E-mail");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 287, 68, 39));

        Enviarcodigo.setBackground(new java.awt.Color(51, 153, 0));
        Enviarcodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarcodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnviarcodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnviarcodigoMouseExited(evt);
            }
        });

        nEnviarcodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nEnviarcodigo.setForeground(new java.awt.Color(255, 255, 255));
        nEnviarcodigo.setText("Enviar codigo");

        javax.swing.GroupLayout EnviarcodigoLayout = new javax.swing.GroupLayout(Enviarcodigo);
        Enviarcodigo.setLayout(EnviarcodigoLayout);
        EnviarcodigoLayout.setHorizontalGroup(
            EnviarcodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnviarcodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nEnviarcodigo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EnviarcodigoLayout.setVerticalGroup(
            EnviarcodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnviarcodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nEnviarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(Enviarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 286, -1, -1));

        Codigo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Codigo.setText("Codigo");
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 350, 68, 38));

        nNombre.setForeground(new java.awt.Color(204, 204, 204));
        nNombre.setText("Andrew Jame");
        nNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nNombreActionPerformed(evt);
            }
        });
        jPanel1.add(nNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 109, 356, 38));

        nDni.setForeground(new java.awt.Color(204, 204, 204));
        nDni.setText("12345678");
        nDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nDniActionPerformed(evt);
            }
        });
        jPanel1.add(nDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 56, 356, 38));

        nEmail.setForeground(new java.awt.Color(204, 204, 204));
        nEmail.setText("salchipapa@gmai.com");
        jPanel1.add(nEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 286, 356, 38));

        nApellidos.setForeground(new java.awt.Color(204, 204, 204));
        nApellidos.setText(" Redmayne Dancingclow");
        nApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(nApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 169, 356, 38));

        nDigito.setForeground(new java.awt.Color(204, 204, 204));
        nDigito.setText("6");
        jPanel1.add(nDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 227, 356, 38));

        nCodigo.setText("1234");
        jPanel1.add(nCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 352, 356, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen()-60;
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void backTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTxtMouseExited
        backBtn.setBackground(Color.white);
        backTxt.setForeground(Color.black);
    }//GEN-LAST:event_backTxtMouseExited

    private void backTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTxtMouseEntered
        backBtn.setBackground(Color.red);
        backTxt.setForeground(Color.white);
    }//GEN-LAST:event_backTxtMouseEntered

    private void backTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTxtMouseClicked
        dispose();
        new MenuAdministrador().setVisible(true);
    }//GEN-LAST:event_backTxtMouseClicked

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void hideTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseExited
        hideBtn.setBackground(Color.white);
        hideTxt.setForeground(Color.black);
    }//GEN-LAST:event_hideTxtMouseExited

    private void hideTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseEntered
        hideBtn.setBackground(Color.blue);
        hideTxt.setForeground(Color.white);
    }//GEN-LAST:event_hideTxtMouseEntered

    private void hideTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_hideTxtMouseClicked

    private void EnviarcodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarcodigoMouseClicked
        String mcodigo="";
        try{
            mcodigo="";
            //Thread.sleep(1000);
            
            int j=5;
            int aleatorio;
            for(int i=0;i<4;i++){
                aleatorio=(int) (Math.random()*10);
                mcodigo+=Integer.toString(aleatorio);
            }
            System.out.println(nEmail.getText());
            sendmail m= new sendmail(nEmail.getText(),"Código de verificación ",mcodigo);

            Thread.sleep(1000);
                m.mail();
            nEnviarcodigo.setText("Enviar codigo ("+j+")");
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        this.codigo=mcodigo;
        
       
    }//GEN-LAST:event_EnviarcodigoMouseClicked

    private void EnviarcodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarcodigoMouseEntered
        Enviarcodigo.setBackground(new Color(67, 180, 10));
    }//GEN-LAST:event_EnviarcodigoMouseEntered

    private void EnviarcodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarcodigoMouseExited
        Enviarcodigo.setBackground(new Color(51,153,0));
    }//GEN-LAST:event_EnviarcodigoMouseExited

    private void nDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nDniActionPerformed

    private void nNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nNombreActionPerformed

    private void nApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nApellidosActionPerformed
                                   

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
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel DVeri;
    private javax.swing.JLabel Dni;
    private javax.swing.JLabel Email;
    private javax.swing.JPanel Enviarcodigo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel backTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hideBtn;
    private javax.swing.JLabel hideTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nApellidos;
    private javax.swing.JTextField nCodigo;
    private javax.swing.JTextField nDigito;
    private javax.swing.JTextField nDni;
    private javax.swing.JTextField nEmail;
    private javax.swing.JLabel nEnviarcodigo;
    private javax.swing.JTextField nNombre;
    // End of variables declaration//GEN-END:variables
}
