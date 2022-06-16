
package equipodebeisbol;

/**
 *
 * @author Jose Ignacio
 */
public class PanelJugador extends javax.swing.JPanel {

    public PanelJugador(Jugador jugador) {
        initComponents();
        
        txtnombre.setText(jugador.getNombre());
        txtid.setText(jugador.getIdentificacion());
        txtedad.setText(String.valueOf(jugador.getEdad()));
        txtpos.setText(String.valueOf(jugador.getPosicion()));
        txtpro.setText(String.valueOf(jugador.getPromedio()));
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtedad = new javax.swing.JTextField();
        txtpro = new javax.swing.JTextField();
        txtpos = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(540, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtedad.setEditable(false);
        txtedad.setBackground(new java.awt.Color(255, 255, 255));
        txtedad.setForeground(new java.awt.Color(0, 0, 0));
        txtedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedad.setText("EDAD");
        add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 80, 30));

        txtpro.setEditable(false);
        txtpro.setBackground(new java.awt.Color(255, 255, 255));
        txtpro.setForeground(new java.awt.Color(0, 0, 0));
        txtpro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpro.setText("PROMEDIO");
        add(txtpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, 30));

        txtpos.setEditable(false);
        txtpos.setBackground(new java.awt.Color(255, 255, 255));
        txtpos.setForeground(new java.awt.Color(0, 0, 0));
        txtpos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpos.setText("POSICION");
        add(txtpos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 130, 30));

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setForeground(new java.awt.Color(0, 0, 0));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setText("IDENTIFICACION");
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 110, 30));

        txtnombre.setEditable(false);
        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre.setText("NOMBRE");
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpos;
    private javax.swing.JTextField txtpro;
    // End of variables declaration//GEN-END:variables
}
