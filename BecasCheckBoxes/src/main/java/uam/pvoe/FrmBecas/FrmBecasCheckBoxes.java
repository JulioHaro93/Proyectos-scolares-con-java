/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.pvoe.FrmBecas;

import Models.Alumno;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author ALUMNA16
 */
public class FrmBecasCheckBoxes extends javax.swing.JFrame {
    private Alumno al = new Alumno();
    ArrayList<JCheckBox> opciones;
    /**
     * Creates new form FrmBecasCheckBoxes
     */
    public FrmBecasCheckBoxes() {
        initComponents();
        opciones = new ArrayList<>();
        agruparDivision();
        al.setDivision(leerDivision());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgbrDivision = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblDivison = new javax.swing.JLabel();
        rbCBI = new javax.swing.JRadioButton();
        rbCSH = new javax.swing.JRadioButton();
        rbCYAD = new javax.swing.JRadioButton();
        lblOpcionesBeca = new javax.swing.JLabel();
        cbUAM = new javax.swing.JCheckBox();
        cbPronabe = new javax.swing.JCheckBox();
        cbCDMX = new javax.swing.JCheckBox();
        cb4T = new javax.swing.JCheckBox();
        lblEncuesta = new javax.swing.JLabel();
        lblEleccionEncuesta = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Sistema de Becas UAM");

        lblNombre.setText("Ingrese Su nombre Completo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblMatricula.setText("Ingrese Su matricula");

        lblDivison.setText("Elija la Division a la cual pertenece");

        rbCBI.setText("CBI");

        rbCSH.setText("CSH");

        rbCYAD.setText("CYAD");

        lblOpcionesBeca.setText("Escoga las opciones de becas a las que busca aspirar");

        cbUAM.setText("UAM");

        cbPronabe.setText("Prohambres");

        cbCDMX.setText("CDMX");

        cb4T.setText("4T");

        lblEncuesta.setText("Responda la siguiente encuesta (opcional)");

        lblEleccionEncuesta.setText("Quiero Responder La Encuesta!");
        lblEleccionEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEleccionEncuestaActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCBI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCSH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCYAD))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTitulo)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addComponent(lblMatricula)
                        .addComponent(txtMatricula))
                    .addComponent(lblDivison)
                    .addComponent(lblOpcionesBeca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbUAM)
                        .addGap(33, 33, 33)
                        .addComponent(cbPronabe)
                        .addGap(33, 33, 33)
                        .addComponent(cbCDMX)
                        .addGap(31, 31, 31)
                        .addComponent(cb4T))
                    .addComponent(lblEncuesta)
                    .addComponent(lblEleccionEncuesta))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDivison)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCBI)
                    .addComponent(rbCSH)
                    .addComponent(rbCYAD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOpcionesBeca)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUAM)
                    .addComponent(cbPronabe)
                    .addComponent(cbCDMX)
                    .addComponent(cb4T))
                .addGap(36, 36, 36)
                .addComponent(lblEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEleccionEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        leerCheckBoxes();
        leerOpcionUnica();
        agruparDivision();
        al.setDivision(leerDivision());
        leerDivision();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblEleccionEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEleccionEncuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEleccionEncuestaActionPerformed
    private String leerDivision(){
        Enumeration<AbstractButton> btnGrpDivision= rgbrDivision.getElements();
        String seleccionado = "";
        while(btnGrpDivision.hasMoreElements()){
            
            JRadioButton rbAux =(JRadioButton) btnGrpDivision.nextElement();
            if(rbAux.isSelected()){
                //System.out.println(rbAux.getText());
                seleccionado = rbAux.getText();
                
                break;
            }
        
        }
        return seleccionado;
        
        
    }
    
    private void agruparDivision(){
        rgbrDivision.add(rbCBI);
        rgbrDivision.add(rbCSH);
        rgbrDivision.add(rbCYAD);
        
    }
    private void agruparCheckBoxes(){
        
        opciones.add(cbUAM);
        opciones.add(cbPronabe);
        opciones.add(cbCDMX);
        opciones.add(cb4T);
        
    }
    
    private void leerCheckBoxes(){
    
        for(int i =0; i<opciones.size(); i++){
            JCheckBox aux = opciones.get(i);
            if(aux.isSelected()){
                System.out.println(aux.getText());
            }
        }
    }
    
    private void leerOpcionUnica(){
        if(lblEleccionEncuesta.isSelected())
        {
            System.out.println("Elegiste Si a responder la encuesta");
        } else{
            System.out.println("Elegiste NO a responder la encuesta");
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
            java.util.logging.Logger.getLogger(FrmBecasCheckBoxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBecasCheckBoxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBecasCheckBoxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBecasCheckBoxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBecasCheckBoxes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cb4T;
    private javax.swing.JCheckBox cbCDMX;
    private javax.swing.JCheckBox cbPronabe;
    private javax.swing.JCheckBox cbUAM;
    private javax.swing.JLabel lblDivison;
    private javax.swing.JCheckBox lblEleccionEncuesta;
    private javax.swing.JLabel lblEncuesta;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOpcionesBeca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCBI;
    private javax.swing.JRadioButton rbCSH;
    private javax.swing.JRadioButton rbCYAD;
    private javax.swing.ButtonGroup rgbrDivision;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
