/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.azc.pvoe.formas;

import java.awt.Cursor;
import java.awt.Desktop;
import java.net.URI;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.operaciones.ListaCliente;
import uam.azc.pvoe.operaciones.UsuarioLogeado;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class RegistrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCliente
     */
    
    //LinkedList<Cliente> clientes = new LinkedList();
    ListaCliente listaClientes = new ListaCliente();
    LinkedList<Cliente> clientes = listaClientes.llenaCli();
    Cliente cliente = new Cliente();
    UsuarioLogeado clienteLogeado = new UsuarioLogeado();
    public RegistrarCliente() {
        initComponents();
        lblLinkCurp.setCursor(new Cursor(HAND_CURSOR));
        buttonGroupDiv();
        lblCorreoNoValido.setVisible(false);
        lblCorreoYaRegistrado.setVisible(false);
        lblAdvertenciaNombre.setVisible(false);
        lblCamposObli.setVisible(false);
        lblAdvertenciaCurp.setVisible(false);
        //btnRegistrar.setEnabled(false);
        lblAvisoTelefono.setVisible(false);
        lblAvisoTelefono.setVisible(false);
        creaUsuario();
        
    }
    /**
     * Este Método valida que el nombre y otros campos sean correctos
     * y que no contengan caracteres especiales
     */
    public void validacionCaracteres(java.awt.event.KeyEvent event){
        if(event.getKeyChar()>=33 && event.getKeyChar()<=47
               || event.getKeyChar()>=58 && event.getKeyChar()<=64
               || event.getKeyChar()>=91 && event.getKeyChar()<=96
               || event.getKeyChar()>123 && event.getKeyChar()<=208
                ||event.getKeyChar()>210 && event.getKeyChar()<=240
               || event.getKeyChar()>=242 && event.getKeyChar()<=255  ){
            event.consume();
            lblAdvertenciaNombre.setVisible(true);
        }else{
            
            lblAdvertenciaNombre.setVisible(false);
        }
    }
    /**
     * Este método valida que el correo tenga un formato adecuado
     * algo@algo.algo
     * @param correo String que recibe y lo valida como correcto
     * @return true en caso de que el correo tenga un formato adecuado
     */
    public boolean validaEmail(String correo){
        
        Pattern patron = Pattern.compile("^[_A-za-z0-9-\\+]+(\\.[_A-za-z0-9-]+)*@"
                +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();
    }
    /**
     * Método que valida la longitud del teléfono
     * 
     */
    public boolean validaTelefono(String telefono){
        boolean validaFon = false;
        if(telefono.length()==9){
            lblAvisoTelefono.setVisible(false);
            
        }else{
            lblAvisoTelefono.setVisible(true);
        }
        return validaFon;
    }
    /**
     * Este método valida que el email no exista
     * @param correo string que recibe como parámetro
     * @return true en caso de que el email ya esté registrado
     */
    public boolean validaEmailExistente(String correo){
        boolean confirmaEmail = false;
        Cliente cli = new Cliente();
        for(int i =0; i<clientes.size();i++){
            cli=clientes.get(i);
            if(cli.getEmail().compareTo(correo)==0){
                lblCorreoYaRegistrado.setVisible(true);
                confirmaEmail=true;
            }
        }
        return confirmaEmail;
    }
    /**
     * este método compara las dos contraseñas, en caso de que sean iguales
     * regresa verdadero
     * @param contrasenaUno contraseña del primer campo
     * @param contrasenaDos contraseña del segundo campo
     * @return true en caso de que sean iguales
     */
    public boolean validaContrasenas(String contrasenaUno, String contrasenaDos){
        boolean iguales = true;
        if(contrasenaUno.compareTo(contrasenaDos)==0){
            System.out.println("Las contrasenhas son iguales, puede continuar");
        }else{
            lblContrasenasDif.setVisible(true);
            iguales =false;
        }
        return iguales;
    }
    /**
     * Metodo que regula que la dirección no sea de más de 400 caracteres
     * 
     * @param direccion dirección que se va a registrar
     * @return true en caso de que el largo del String sea el correcto
     */
    public boolean validaLargoDireccion(String direccion){
        boolean validaLargo = false;
        if(direccion.length()<=400){
            lblLargoDireccion.setVisible(false);
            validaLargo=true;
        }else{
            lblLargoDireccion.setVisible(true);
        }
        return validaLargo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblRegistrarse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIngresarNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblAdvertenciaNombre = new javax.swing.JLabel();
        lblIngresarCurp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLinkCurp = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lblAdvertenciaCurp = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCorreoNoValido = new javax.swing.JLabel();
        lblCorreoYaRegistrado = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        pswContrasenaUno = new javax.swing.JPasswordField();
        lblContrasenaDos = new javax.swing.JLabel();
        pswContrasenaDos = new javax.swing.JPasswordField();
        lblContrasenasDif = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblAvisoTelefono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCienciaFiccion = new javax.swing.JCheckBox();
        cbRomance = new javax.swing.JCheckBox();
        cbFantasia = new javax.swing.JCheckBox();
        cbTerror = new javax.swing.JCheckBox();
        cbClassicos = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        btnRegresoPrincipal = new javax.swing.JButton();
        lblLargoDireccion = new javax.swing.JLabel();
        lblCamposObli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrarse");
        setPreferredSize(new java.awt.Dimension(800, 700));

        lblRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistrarse.setText("Registrarse en el sistema");

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Los campos Marcados con * son obligatorios");

        lblIngresarNombreUsuario.setText("* Ingrese su nombre de Usuario");

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyReleased(evt);
            }
        });

        lblAdvertenciaNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblAdvertenciaNombre.setText("*El nombre de usuario no puede llevar caracteres especiales");

        lblIngresarCurp.setText("* Ingrese su clave Curp, si no la conoce ingrese en la siguiente liga");

        lblLinkCurp.setForeground(new java.awt.Color(51, 51, 255));
        lblLinkCurp.setText("https://www.gob.mx/curp/");
        lblLinkCurp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkCurpMouseClicked(evt);
            }
        });

        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });
        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurpKeyReleased(evt);
            }
        });

        lblAdvertenciaCurp.setForeground(new java.awt.Color(255, 51, 51));
        lblAdvertenciaCurp.setText("* Por favor ingrese una curp válida");

        lblGenero.setText("* Seleccione su género");

        rbMasculino.setText("Masculino");

        rbFemenino.setText("Femenino");

        lblDireccion.setText("*Ingrese su dirección (Máximo 400 caracteres)");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblEmail.setText("* Ingrese su correo Electrónico");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblCorreoNoValido.setForeground(new java.awt.Color(255, 51, 51));
        lblCorreoNoValido.setText("*Por favor ingrese una direccion de coreo electrónico válida");

        lblCorreoYaRegistrado.setForeground(new java.awt.Color(255, 51, 51));
        lblCorreoYaRegistrado.setText("* Este correo ya ha sido registrado antes");

        lblContrasena.setText("*Ingrese su contraseña");

        pswContrasenaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswContrasenaUnoActionPerformed(evt);
            }
        });

        lblContrasenaDos.setText("* Repita su contraseña");

        pswContrasenaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswContrasenaDosKeyReleased(evt);
            }
        });

        lblContrasenasDif.setForeground(new java.awt.Color(255, 51, 51));
        lblContrasenasDif.setText("* Las contraseñas no coinciden");

        lblTelefono.setText("* Ingrese su teléfono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        lblAvisoTelefono.setForeground(new java.awt.Color(255, 51, 51));
        lblAvisoTelefono.setText("*El teléfono debe de ser de 10 dígitos y no se permiten letras");

        jLabel4.setText("* Agrege sus géneros favoritos (al menos dos)");

        cbCienciaFiccion.setText("Ciencia Ficcion");
        cbCienciaFiccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCienciaFiccionActionPerformed(evt);
            }
        });

        cbRomance.setText("Romance");

        cbFantasia.setText("Fantasia");

        cbTerror.setText("Terror y Misterio");

        cbClassicos.setText("Clasicos");

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnRegistrarKeyReleased(evt);
            }
        });

        btnRegresoPrincipal.setText("Volver a Inicio de Sesión");
        btnRegresoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoPrincipalActionPerformed(evt);
            }
        });

        lblLargoDireccion.setForeground(new java.awt.Color(255, 51, 51));
        lblLargoDireccion.setText("*dirección demasiado larga");

        lblCamposObli.setForeground(new java.awt.Color(255, 51, 51));
        lblCamposObli.setText("* Los campos son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFantasia)
                            .addComponent(lblEmail)
                            .addComponent(lblDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFemenino))
                            .addComponent(lblGenero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIngresarCurp)
                                .addGap(18, 18, 18)
                                .addComponent(lblLinkCurp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistrarse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIngresarNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lblAdvertenciaNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAdvertenciaCurp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLargoDireccion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCorreoYaRegistrado)
                                    .addComponent(lblCorreoNoValido)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pswContrasenaUno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pswContrasenaDos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContrasenaDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvisoTelefono)
                                    .addComponent(lblContrasenasDif)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbRomance)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbClassicos))
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCienciaFiccion)
                                .addGap(72, 72, 72)
                                .addComponent(cbTerror)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(41, 41, 41)
                        .addComponent(lblCamposObli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresoPrincipal)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrarse)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIngresarNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvertenciaNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresarCurp)
                    .addComponent(jLabel2)
                    .addComponent(lblLinkCurp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvertenciaCurp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLargoDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoYaRegistrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrasena)
                    .addComponent(lblCorreoNoValido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswContrasenaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrasenaDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswContrasenaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenasDif))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvisoTelefono))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCienciaFiccion)
                    .addComponent(cbTerror))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRomance)
                    .addComponent(cbClassicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnRegresoPrincipal)
                    .addComponent(lblCamposObli))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

    private void lblLinkCurpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkCurpMouseClicked
        // TODO add your handling code here:
        
        try{
            if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(new URI("https://www.gob.mx/curp/"));
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblLinkCurpMouseClicked

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        if(validaEmail(txtEmail.getText())==false){
            lblCorreoNoValido.setVisible(true);
        }
    }//GEN-LAST:event_txtEmailActionPerformed

    private void pswContrasenaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswContrasenaUnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pswContrasenaUnoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:TELEFONOOOOOO
        /*
        telefonooooooooo
        */
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void cbCienciaFiccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCienciaFiccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCienciaFiccionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        /*if(!validaEmailExistente(txtEmail.getText())){
            cliente.setEmail(txtEmail.getText());
        }else{
            lblCorreoYaRegistrado.setVisible(true);
        }
        
        if(validaContrasenas(pswContrasenaUno.getText(), pswContrasenaDos.getText())){
            cliente.setPsw(pswContrasenaUno.getText());
        }else{
            System.out.println("Las contrasenas no coinciden");
            lblContrasenasDif.setVisible(true);
        }
        
        String curpRegistrada = txtCurp.getText();
        if(curpRegistrada.length()!=18){
            lblAdvertenciaCurp.setVisible(true);
        }else{
            lblAdvertenciaCurp.setVisible(false);
            cliente.setCurp(curpRegistrada);
        }
        cliente.setNombre(txtNombreUsuario.getText());
        
        if(validaTelefono(txtTelefono.getText())){
            cliente.setTelefono(txtTelefono.getText());
        }else{
            lblAvisoTelefono.setVisible(true);
        }
        
        String genero = leerProcedenciaSeleccionado();
        cliente.setGenero(genero);
        
        if(validaLargoDireccion(txtDireccion.getText())){
            cliente.setDireccion(txtDireccion.getText());
        } else{
            lblLargoDireccion.setVisible(true);
        }
        
        LinkedList<String> listaElegida= agrupaBotonesCB();
        
        cliente.setFavoritos(listaElegida);
        cliente.setTelefono(txtTelefono.getText());
        cliente.setAdmin(false);
        cliente.setDeudor(false);
        System.out.println(cliente);
        btnRegistrar.setEnabled(true);
        /*if(cliente.getNombre()!=null
                && cliente.getCurp()!=null 
                && cliente.getPsw() !=null && cliente.getDireccion()!=null
                && cliente.getEmail()!=null && cliente.getGenero()!=null
                && !cliente.getFavoritos().isEmpty() && cliente.getTelefono() != null
                ){
 private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
        }
        
        if(txtCurp.getText().isEmpty()
                || txtNombreUsuario.getText().isEmpty()
                || txtDireccion.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                || cliente.getFavoritos().isEmpty()){
                btnRegistrar.setEnabled(false);
        }else{
            btnRegistrar.setEnabled(true);
        }
        */
        if(creaUsuario()){
            btnRegistrar.setEnabled(true);
            btnRegistrar.setEnabled(true);
            clienteLogeado.guardaCliente("clienteLog.txt", cliente);
            System.out.println("se registra a: "+ cliente);
            clienteLogeado.archivoClientes("clientes.txt", clientes);
            BienvenidaFrm bienVenida;
            try {
                bienVenida = new BienvenidaFrm();
                bienVenida.setVisible(true);
                clientes.add(cliente);
            
            this.dispose();
            } catch (ParseException ex) {
                Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }else {
            btnRegistrar.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoPrincipalActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresoPrincipalActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if(validaEmail(txtEmail.getText())){
            lblCorreoNoValido.setVisible(false);
        }else{
            lblCorreoNoValido.setVisible(true);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNombreUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyReleased
        // TODO add your handling code here:
        validacionCaracteres(evt);
    }//GEN-LAST:event_txtNombreUsuarioKeyReleased

    private void txtCurpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyReleased
        // TODO add your handling code here:
        validacionCaracteres(evt);
        String curpRegistrada = txtCurp.getText();
        if(curpRegistrada.length()!=18){
            lblAdvertenciaCurp.setVisible(true);
        }else{
            lblAdvertenciaCurp.setVisible(false);
            
        }
        
        
    }//GEN-LAST:event_txtCurpKeyReleased

    private void pswContrasenaDosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswContrasenaDosKeyReleased
        // TODO add your handling code here:
        if(validaContrasenas(pswContrasenaUno.getText(), pswContrasenaDos.getText())){
            lblContrasenasDif.setVisible(false);
        }else{
            System.out.println("Las contrasenas no coinciden");
            lblContrasenasDif.setVisible(true);
        }
    }//GEN-LAST:event_pswContrasenaDosKeyReleased

    private void btnRegistrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyReleased
        // TODO add your handling code here:
                // TODO add your handling code here:
        /*if(!validaEmailExistente(txtEmail.getText())){
            cliente.setEmail(txtEmail.getText());
        }else{
            lblCorreoYaRegistrado.setVisible(true);
        }
        
        if(validaContrasenas(pswContrasenaUno.getText(), pswContrasenaDos.getText())){
            cliente.setPsw(pswContrasenaUno.getText());
        }else{
            System.out.println("Las contrasenas no coinciden");
            lblContrasenasDif.setVisible(true);
        }
        
        String curpRegistrada = txtCurp.getText();
        if(curpRegistrada.length()!=18){
            lblAdvertenciaCurp.setVisible(true);
        }else{
            lblAdvertenciaCurp.setVisible(false);
            cliente.setCurp(curpRegistrada);
        }
        cliente.setNombre(txtNombreUsuario.getText());
        
        if(validaTelefono(txtTelefono.getText())){
            cliente.setTelefono(txtTelefono.getText());
        }else{
            lblAvisoTelefono.setVisible(true);
        }
        
        String genero = leerProcedenciaSeleccionado();
        cliente.setGenero(genero);
        
        if(validaLargoDireccion(txtDireccion.getText())){
            cliente.setDireccion(txtDireccion.getText());
        } else{
            lblLargoDireccion.setVisible(true);
        }
        
        LinkedList<String> listaElegida= agrupaBotonesCB();
        
        cliente.setFavoritos(listaElegida);
        cliente.setTelefono(txtTelefono.getText());
        cliente.setAdmin(false);
        cliente.setDeudor(false);
        System.out.println(cliente);
        btnRegistrar.setEnabled(true);
        /*if(cliente.getNombre()!=null
                && cliente.getCurp()!=null 
                && cliente.getPsw() !=null && cliente.getDireccion()!=null
                && cliente.getEmail()!=null && cliente.getGenero()!=null
                && !cliente.getFavoritos().isEmpty() && cliente.getTelefono() != null
                ){
 private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
        }
        */

    }//GEN-LAST:event_btnRegistrarKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
        
        if(txtTelefono.getText().length()!=10){
            lblAvisoTelefono.setVisible(true);
        } else{
            lblAvisoTelefono.setVisible(false);
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

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
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCliente().setVisible(true);
            }
        });
    }
    
    private void buttonGroupDiv(){
        buttonGroup1.add(rbMasculino);
        buttonGroup1.add(rbFemenino);
    }
    /**
     * lee el valor de un grupo de radio buttons
     * @return el valor del string
     */
    private String leerProcedenciaSeleccionado(){
        Enumeration<AbstractButton> botonElegido= buttonGroup1.getElements();
        String seleccionado = "";
        while(botonElegido.hasMoreElements()){
            
            JRadioButton rbAux =(JRadioButton)botonElegido.nextElement();
            if(rbAux.isSelected()){
                //System.out.println(rbAux.getText());
                seleccionado = rbAux.getText();
                break;
            }
        
        }
        return seleccionado;
        
    }
    
    /**
     * método que agrupa los botones seleccionados
     * @return 
     */
    
    public LinkedList<String> agrupaBotonesCB(){
        LinkedList<String> lista = new LinkedList();
        if(cbCienciaFiccion.isSelected()){
            lista.add(cbCienciaFiccion.getText());
        }
        if(cbClassicos.isSelected()){
            lista.add(cbClassicos.getText());
        }if(cbFantasia.isSelected()){
            lista.add(cbFantasia.getText());
        }if(cbRomance.isSelected()){
            lista.add(cbRomance.getText());
        }if(cbTerror.isSelected()){
            lista.add(cbTerror.getText());
        }
        
        if(lista.isEmpty()){
            lista.add(cbFantasia.getText());
            lista.add(cbRomance.getText());
        }
        return lista;
    }
    
    /**
     * Método que crea un objeto de tipo Cliente de tal manera que se puede agregar a la lista de
     * clientes y a su vez al registro txt
     * @return un valor booleano en caso de que se creen todos los campos.
     */
    public boolean creaUsuario(){
        
        boolean validaCliente =false;
        if(!validaEmailExistente(txtEmail.getText())){
            cliente.setEmail(txtEmail.getText());
        }else{
            lblCorreoYaRegistrado.setVisible(true);
        }
        
        if(validaContrasenas(pswContrasenaUno.getText(), pswContrasenaDos.getText())){
            cliente.setPsw(pswContrasenaUno.getText());
        }else{
            System.out.println("Las contrasenas no coinciden");
            lblContrasenasDif.setVisible(true);
        }
        
        String curpRegistrada = txtCurp.getText();
        if(curpRegistrada.length()!=18){
            lblAdvertenciaCurp.setVisible(true);
        }else{
            lblAdvertenciaCurp.setVisible(false);
            cliente.setCurp(curpRegistrada);
        }
        cliente.setNombre(txtNombreUsuario.getText());
        
        if(validaTelefono(txtTelefono.getText())){
            cliente.setTelefono(txtTelefono.getText());
        }else{
            lblAvisoTelefono.setVisible(true);
        }
        
        String genero = leerProcedenciaSeleccionado();
        cliente.setGenero(genero);
        
        if(validaLargoDireccion(txtDireccion.getText())){
            cliente.setDireccion(txtDireccion.getText());
        } else{
            lblLargoDireccion.setVisible(true);
        }
        
        LinkedList<String> listaElegida= agrupaBotonesCB();
        
        cliente.setFavoritos(listaElegida);
        cliente.setTelefono(txtTelefono.getText());
        cliente.setAdmin(false);
        cliente.setDeudor(false);
        Date fecha= new Date();
        String fechaHoy =fecha.toString();
        cliente.setFechaRegistro(fechaHoy);
        System.out.println(cliente);
        btnRegistrar.setEnabled(true);
        
        
        /*if(cliente.getNombre()!=null
                && cliente.getCurp()!=null 
                && cliente.getPsw() !=null && cliente.getDireccion()!=null
                && cliente.getEmail()!=null && cliente.getGenero()!=null
                && !cliente.getFavoritos().isEmpty() && cliente.getTelefono() != null
                ){
 private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
        }
        */
        if(txtCurp.getText().isEmpty()
                || txtNombreUsuario.getText().isEmpty()
                || txtDireccion.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                ){
                lblCamposObli.setVisible(true);
                btnRegistrar.setEnabled(true);
                
        }else{
            btnRegistrar.setEnabled(false);
            validaCliente = true;
            clientes.add(cliente);
        }
        
    return validaCliente;
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresoPrincipal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbCienciaFiccion;
    private javax.swing.JCheckBox cbClassicos;
    private javax.swing.JCheckBox cbFantasia;
    private javax.swing.JCheckBox cbRomance;
    private javax.swing.JCheckBox cbTerror;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAdvertenciaCurp;
    private javax.swing.JLabel lblAdvertenciaNombre;
    private javax.swing.JLabel lblAvisoTelefono;
    private javax.swing.JLabel lblCamposObli;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblContrasenaDos;
    private javax.swing.JLabel lblContrasenasDif;
    private javax.swing.JLabel lblCorreoNoValido;
    private javax.swing.JLabel lblCorreoYaRegistrado;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIngresarCurp;
    private javax.swing.JLabel lblIngresarNombreUsuario;
    private javax.swing.JLabel lblLargoDireccion;
    private javax.swing.JLabel lblLinkCurp;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPasswordField pswContrasenaDos;
    private javax.swing.JPasswordField pswContrasenaUno;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
