/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;


import java.awt.Color;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public Inicio() {
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

        bg2 = new javax.swing.JPanel();
        header2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        hideBtn = new javax.swing.JPanel();
        hideTxt = new javax.swing.JLabel();
        Ingreso = new javax.swing.JLabel();
        Cliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Administrador = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg2.setBackground(new java.awt.Color(255, 255, 255));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header2.setBackground(new java.awt.Color(255, 255, 255));
        header2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header2MouseDragged(evt);
            }
        });
        header2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg2.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setInheritsPopupMenu(false);
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

        bg2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 40));

        hideBtn.setBackground(new java.awt.Color(255, 255, 255));

        hideTxt.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        hideTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideTxt.setText("—");
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
                .addComponent(hideTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        hideBtnLayout.setVerticalGroup(
            hideBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hideBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hideTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg2.add(hideBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, 40, 40));

        Ingreso.setBackground(new java.awt.Color(204, 204, 0));
        Ingreso.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Ingreso.setForeground(new java.awt.Color(0, 102, 51));
        Ingreso.setText("INGRESAR COMO : ");
        bg2.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 360, 60));

        Cliente.setBackground(new java.awt.Color(204, 204, 0));
        Cliente.setForeground(new java.awt.Color(255, 255, 255));
        Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClienteMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Cliente.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg2.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 290, 110));

        Administrador.setBackground(new java.awt.Color(204, 204, 0));
        Administrador.setForeground(new java.awt.Color(255, 255, 255));
        Administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministradorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdministradorMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Administrador");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Administrador.png"))); // NOI18N
        jLabel5.setText("jLabel3");

        javax.swing.GroupLayout AdministradorLayout = new javax.swing.GroupLayout(Administrador);
        Administrador.setLayout(AdministradorLayout);
        AdministradorLayout.setHorizontalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        AdministradorLayout.setVerticalGroup(
            AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg2.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 290, 110));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/foto_menu.png"))); // NOI18N
        Fondo.setText("jLabel1");
        Fondo.setPreferredSize(new java.awt.Dimension(980, 530));
        bg2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 980, 530));

        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void header2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header2MouseDragged

    private void header2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header2MousePressed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        //0 si  1 no
        if(0==Mensaje.Preguntar("Estas a punto de salir ¿Estas Seguro?", "¿Desea Salir?")){
            System.exit(0);
        }
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void hideTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_hideTxtMouseClicked

    private void hideTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseEntered
        hideBtn.setBackground(Color.blue);
        hideTxt.setForeground(Color.white);
    }//GEN-LAST:event_hideTxtMouseEntered

    private void hideTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideTxtMouseExited
        hideBtn.setBackground(Color.white);
        hideTxt.setForeground(Color.black);
    }//GEN-LAST:event_hideTxtMouseExited

    private void ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteMouseClicked
        MostrarVehiculo mc = new MostrarVehiculo();
        mc.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ClienteMouseClicked

    private void ClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteMouseEntered
        Cliente.setBackground(new Color(204,220,0));
    }//GEN-LAST:event_ClienteMouseEntered

    private void ClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteMouseExited
        Cliente.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_ClienteMouseExited

    private void AdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministradorMouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_AdministradorMouseClicked

    private void AdministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministradorMouseEntered
        Administrador.setBackground(new Color(204,220,0));
    }//GEN-LAST:event_AdministradorMouseEntered

    private void AdministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministradorMouseExited
        Administrador.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_AdministradorMouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Administrador;
    private javax.swing.JPanel Cliente;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Ingreso;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel hideBtn;
    private javax.swing.JLabel hideTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
