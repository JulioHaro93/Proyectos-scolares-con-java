/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.pvoe.botones.formas;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author ALUMNO23
 */
public class BotonesEscuela extends javax.swing.JFrame {

    /**
     * Creates new form BotonesEscuela
     */
    public BotonesEscuela() {
        initComponents();
        agruparGeneros();
        leerGeneroSeleccionado();
        agruparLugarProcedencia();
        leerProcedenciaSeleccionado();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        rbgrGenero = new javax.swing.ButtonGroup();
        rbgrProcedencia = new javax.swing.ButtonGroup();
        rbgrBeca = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        txtGenero = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        txtProcedencia = new javax.swing.JLabel();
        rbCDMX = new javax.swing.JRadioButton();
        txtEdoMex = new javax.swing.JRadioButton();
        lblTipoBeca = new javax.swing.JLabel();
        rbSEP = new javax.swing.JRadioButton();
        rbBecaCDMX = new javax.swing.JRadioButton();
        rbVulnerabilidad = new javax.swing.JRadioButton();
        rbAprovechamiento = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Ingrese los datos del alumno");

        lblNombre.setText("Nombre del alumno");

        jLabel1.setText("Primer apellido");

        jLabel2.setText("Segundo apellido");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masculino");

        txtGenero.setText("seleccione el genero del alumno");

        rbFemenino.setText("Femenino");

        txtProcedencia.setText("Seleccione el lugar de procedencia");

        rbCDMX.setText("CDMX");

        txtEdoMex.setText("EdoMex");

        lblTipoBeca.setText("Seleccione el tipo de Beca para la que aspira");

        rbSEP.setText("Beca SEP");

        rbBecaCDMX.setText("Beca CDMX");

        rbVulnerabilidad.setText("Beca de Vulnerabilidad");

        rbAprovechamiento.setText("Aprovechamiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre)
                                .addComponent(txtNombre)
                                .addComponent(jLabel1)
                                .addComponent(txtPrimerApellido)
                                .addComponent(jLabel2)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addGap(31, 31, 31)
                                .addComponent(rbFemenino))
                            .addComponent(txtGenero)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtProcedencia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbCDMX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdoMex))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipoBeca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSEP)
                        .addGap(27, 27, 27)
                        .addComponent(rbBecaCDMX)
                        .addGap(18, 18, 18)
                        .addComponent(rbVulnerabilidad))
                    .addComponent(rbAprovechamiento))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(35, 35, 35)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addGap(18, 18, 18)
                .addComponent(txtProcedencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCDMX)
                    .addComponent(txtEdoMex))
                .addGap(18, 18, 18)
                .addComponent(lblTipoBeca)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSEP)
                    .addComponent(rbBecaCDMX)
                    .addComponent(rbVulnerabilidad))
                .addGap(18, 18, 18)
                .addComponent(rbAprovechamiento)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String leerGeneroSeleccionado(){
        Enumeration<AbstractButton> btnGrpGenero= rbgrGenero.getElements();
        String seleccionado = "";
        while(btnGrpGenero.hasMoreElements()){
            
            JRadioButton rbAux =(JRadioButton) btnGrpGenero.nextElement();
            if(rbAux.isSelected()){
                //System.out.println(rbAux.getText());
                seleccionado = rbAux.getText();
                break;
            }
        
        }
        return seleccionado;
        
    
    }
    
    private void agruparGeneros(){
        rbgrGenero.add(rbMasculino);
        rbgrGenero.add(rbFemenino);
        
    }
    
    private String leerProcedenciaSeleccionado(){
        Enumeration<AbstractButton> btnGrpProcedencia= rbgrProcedencia.getElements();
        String seleccionado = "";
        while(btnGrpProcedencia.hasMoreElements()){
            
            JRadioButton rbAux =(JRadioButton) btnGrpProcedencia.nextElement();
            if(rbAux.isSelected()){
                //System.out.println(rbAux.getText());
                seleccionado = rbAux.getText();
                break;
            }
        
        }
        return seleccionado;
        
    
    }
    
    private void agruparLugarProcedencia(){
        rbgrGenero.add(rbMasculino);
        rbgrGenero.add(rbFemenino);
        
    }
    private String leerBecaSeleccionado(){
        Enumeration<AbstractButton> btnGrpBeca= rbgrBeca.getElements();
        String seleccionado = "";
        while(btnGrpBeca.hasMoreElements()){
            
            JRadioButton rbAux =(JRadioButton) btnGrpBeca.nextElement();
            if(rbAux.isSelected()){
                //System.out.println(rbAux.getText());
                seleccionado = rbAux.getText();
                break;
            }
        
        }
        return seleccionado;
        
    
    }
    
    private void agruparBecas(){
        rbgrBeca.add(rbSEP);
        rbgrBeca.add(rbBecaCDMX);
        
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(BotonesEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotonesEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotonesEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotonesEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BotonesEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoBeca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbAprovechamiento;
    private javax.swing.JRadioButton rbBecaCDMX;
    private javax.swing.JRadioButton rbCDMX;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbSEP;
    private javax.swing.JRadioButton rbVulnerabilidad;
    private javax.swing.ButtonGroup rbgrBeca;
    private javax.swing.ButtonGroup rbgrGenero;
    private javax.swing.ButtonGroup rbgrProcedencia;
    private javax.swing.JRadioButton txtEdoMex;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JLabel txtProcedencia;
    // End of variables declaration//GEN-END:variables
}
