/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public class JCTrailer extends javax.swing.JPanel {

    /**
     * Creates new form JCTrailer
     */
    public JCTrailer() {
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

        Ejes = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ejes.setForeground(new java.awt.Color(204, 204, 204));
        Ejes.setText("Ingrese los ejes");
        Ejes.setBorder(null);
        add(Ejes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 260, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 260, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("Ejes");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ejes;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
