/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto;

/**
 *
 * @author USUARIO
 */
public class JTAuto extends javax.swing.JPanel {

    /**
     * Creates new form JTAuto
     */
    public JTAuto() {
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

        NAsientos = new javax.swing.ButtonGroup();
        N8 = new javax.swing.JLabel();
        Categoria = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        N5 = new javax.swing.JRadioButton();
        N6 = new javax.swing.JRadioButton();
        N7 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        N8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        N8.setText("Categoria");
        add(N8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        Categoria.setForeground(new java.awt.Color(204, 204, 204));
        Categoria.setText("Ingrese los numeros de asientos");
        Categoria.setBorder(null);
        add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 260, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 260, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setText("N Asientos");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 260, 10));

        NAsientos.add(jRadioButton1);
        jRadioButton1.setText("8");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        NAsientos.add(N5);
        N5.setText("5");
        add(N5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        NAsientos.add(N6);
        N6.setText("6");
        add(N6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        NAsientos.add(N7);
        N7.setText("7");
        add(N7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Categoria;
    private javax.swing.JRadioButton N5;
    private javax.swing.JRadioButton N6;
    private javax.swing.JRadioButton N7;
    private javax.swing.JLabel N8;
    private javax.swing.ButtonGroup NAsientos;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}