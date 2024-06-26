/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.azc.pvoe.formas;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.azc.pvoe.modelos.Administrador;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.modelos.Libro;
import uam.azc.pvoe.modelos.Proveedor;
import uam.azc.pvoe.modelos.Revista;
import uam.azc.pvoe.operaciones.ListaAdmin;
import uam.azc.pvoe.operaciones.ListaCliente;
import uam.azc.pvoe.operaciones.Intermediario;
import uam.azc.pvoe.operaciones.LeerUsuarioLog;
import uam.azc.pvoe.operaciones.ListaLibro;
import uam.azc.pvoe.operaciones.ListaProveedores;
import uam.azc.pvoe.operaciones.ListaReviistas;
import uam.azc.pvoe.operaciones.UsuarioLogeado;

/**
 *
 * @author Julio Cesar Haro Capetillo 220200415
 */

public class Principal extends javax.swing.JFrame {
    ListaAdmin administradores = new ListaAdmin();
    ListaCliente clientes = new ListaCliente();
    ListaProveedores proveedores = new ListaProveedores();
    private LinkedList<Administrador> admons = administradores.llenaAdmin();
    
    private LinkedList<Proveedor> prove = proveedores.llenaProveedor();
    public Administrador admin = new Administrador();
    public Cliente client = new Cliente();
    private LeerUsuarioLog usuario = new LeerUsuarioLog();
    private LinkedList<Cliente> clients = clientes.llenaCli();
    //private LinkedList<Cliente> clients = usuario.leerClientes("clientes.txt");
    private Libro libro = new Libro();
    private ListaLibro lib = new ListaLibro();
    private LinkedList<Libro> libros = lib.llenaLib();
    private Revista revista = new Revista();
    private ListaReviistas rev = new ListaReviistas();
    private LinkedList<Revista> revistas = rev.llenaRev();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        muestraProveedores();
        administradores.llenaAdmin();
        clientes.llenaCli();
        
        lblContrasenaInicioInvalida.setVisible(false);
        lblUsuarioNoEncontrado.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicio = new javax.swing.JLabel();
        lblIngreseUsuario = new javax.swing.JLabel();
        txtIngreseUsuario = new javax.swing.JTextField();
        txtIngreseContrasena = new javax.swing.JLabel();
        pswIngreseContrasena = new javax.swing.JPasswordField();
        txtRegistrar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();
        lblContrasenaInicioInvalida = new javax.swing.JLabel();
        lblUsuarioNoEncontrado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librería");

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInicio.setText("Inicio de Sesión Requerido (log in)");

        lblIngreseUsuario.setText("Ingrese el nombre de usuario o correo electrónico");

        txtIngreseUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngreseUsuarioActionPerformed(evt);
            }
        });

        txtIngreseContrasena.setText("Inrese su contraseña");

        pswIngreseContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswIngreseContrasenaActionPerformed(evt);
            }
        });

        txtRegistrar.setText("Si  usted no está registrado en el sistema de click aquí");

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLogIn.setText("Iniciar Sesión");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lblContrasenaInicioInvalida.setForeground(new java.awt.Color(255, 0, 51));
        lblContrasenaInicioInvalida.setText("*Contraseña inválida");

        lblUsuarioNoEncontrado.setForeground(new java.awt.Color(255, 51, 51));
        lblUsuarioNoEncontrado.setText("*Usuario no encontrado");

        jLabel1.setText("NOTA IMPORTANTE: Para iniciar sesión como administrador se puede mediante Admin1 como nombre y admin1 como contraseña");

        jLabel2.setText("Para iniciar sesión como cliente un ejemplo puede ser Cliente1 como nombre y cliente1 como contraseña");

        jLabel3.setText("solamente las opciones consultar catálogo y consultar editoriales están disponibles para los clientes");

        jLabel4.setText("Para registrar un cliente es necesario escribir un correo correcto como por ejemplo correo@correo.com por la validación");

        jLabel5.setText("Developed By: Julio Haro 2202000415");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInicio)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtIngreseContrasena)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblContrasenaInicioInvalida))
                                            .addComponent(lblIngreseUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtIngreseUsuario)
                                            .addComponent(pswIngreseContrasena))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUsuarioNoEncontrado))
                                    .addComponent(txtRegistrar)
                                    .addComponent(btnRegistrar)
                                    .addComponent(btnLogIn)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseUsuario)
                    .addComponent(lblUsuarioNoEncontrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngreseUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngreseContrasena)
                    .addComponent(lblContrasenaInicioInvalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswIngreseContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogIn)
                .addGap(24, 24, 24)
                .addComponent(txtRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngreseUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngreseUsuarioActionPerformed
       
    }//GEN-LAST:event_txtIngreseUsuarioActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
         // TODO add your handling code here:
         UsuarioLogeado log = new UsuarioLogeado();
         
         for(int i = 0; i< admons.size();i++){
             System.out.println("prueba boton"+admons.get(i));
         
         }
        String usuario = txtIngreseUsuario.getText();
        System.out.println(usuario);
        String pass = pswIngreseContrasena.getText();
        System.out.println(pass);
        boolean val = comparaUser(usuario, pass);
        if(val== false){
           lblUsuarioNoEncontrado.setVisible(true); 
           lblContrasenaInicioInvalida.setVisible(true);
        } else{
           lblUsuarioNoEncontrado.setVisible(false); 
           lblContrasenaInicioInvalida.setVisible(false);
           
           Intermediario inter = new Intermediario();
           inter.intermediarioAdministrador(admin);
           System.out.println("prueba boton"+admin);
           System.out.println("prueba boton"+client);
           inter.intermediarioCliente(client);
           System.out.println("$$$$$$$$$$"+inter.ad.get(0));
           System.out.println("dedseduselkjdhse"+inter.c.get(0));
           
           if(admin.getNombre()!=null){
               log.guardaAdministrador("administradorLog.txt", admin);
           }else if(client.getNombre()!=null){
               log.guardaCliente("clienteLog.txt", client);
           }else{
               System.out.println("Los valores son nulos");
           }
           log.archivoProveedores("proveedores.txt", prove);
           log.archivoLibros("libros.txt", libros);
           log.archivoRevistas("revistas.txt", revistas);
           BienvenidaFrm bienvenido;
             try {
                 bienvenido = new BienvenidaFrm();
                 bienvenido.setVisible(true);
             } catch (ParseException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
           
           this.dispose();
        }
        
        
    }//GEN-LAST:event_btnLogInActionPerformed

    private void pswIngreseContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswIngreseContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswIngreseContrasenaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        RegistrarCliente registrar = new RegistrarCliente();
        registrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
        
    }
    /**
     * Metodo que valida al usuario ya existente dentro de la lista ya sea administrador o cliente
     * @param nombre nombre de usuario
     * @param pass contraseña del usuario
     * @return un booleano que es verdadero siempre que se cumplan las sentencias.
     */
    public boolean comparaUser(String nombre, String pass){
        boolean confirmacion = false;

            for(int i =0; i<admons.size();i++){
                System.out.println(admons.get(i));
                if(admons.get(i).getNombre().compareTo(nombre)==0 
                        || admons.get(i).getEmail().compareTo(nombre)==0
                            && admons.get(i).getPsw().compareTo(pass)==0){
                    confirmacion=true;
                    admin = admons.get(i);
                    System.out.println(admin);
                    break;
                }
            }
                System.out.println("Confirmacion Administrador"+confirmacion);
            if(confirmacion== false){
                for(int i =0; i<clients.size();i++){
                    if(clients.get(i).getNombre().compareTo(nombre)==0
                            || clients.get(i).getEmail().compareTo(nombre)==0
                                && clients.get(i).getPsw().compareTo(pass)==0){
                                confirmacion=true;
                                client = clients.get(i);
                                System.out.println(client);
                                break;
                        
                    }
                    System.out.println("confirmacion cliente" + confirmacion);
                }
            }
        System.out.println(confirmacion);
        return confirmacion;
    }
    /**
     * Método que muestra a los proveedores en consola
     * @return una lista de proveedores
     */
    public LinkedList<Proveedor> muestraProveedores(){
        for(int i=0; i<prove.size();i++){
            System.out.println("MMMMMM"+prove.get(i).toString());
        }
        return prove;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblContrasenaInicioInvalida;
    private javax.swing.JLabel lblIngreseUsuario;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblUsuarioNoEncontrado;
    private javax.swing.JPasswordField pswIngreseContrasena;
    private javax.swing.JLabel txtIngreseContrasena;
    private javax.swing.JTextField txtIngreseUsuario;
    private javax.swing.JLabel txtRegistrar;
    // End of variables declaration//GEN-END:variables
}
