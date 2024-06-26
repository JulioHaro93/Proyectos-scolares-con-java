/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.OperacionBD;
import java.util.ArrayList;

/**
 * Clase Hospital, contiene todos los métodos con la lógica de negocio para las operaciones con
 * las bases de datos, 
 * @author Julio Cesar Haro Capetillo
 * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
 */
public class Hospital {
    
    private ArrayList<Empleado> empleados;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Paciente> pacientes;
    /**
     * metodo constructor por defecto
     */
    public Hospital(){}
    /**
     * Metodo constructor con parámetros
     * @param empleados ArrayList de empleados
     * @param medicamentos ArrayList de medicamentos
     * @param pacientes ArrayList de pacientes
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
    public Hospital(ArrayList<Empleado> empleados, ArrayList<Medicamento> medicamentos, ArrayList<Paciente> pacientes) {
        this.empleados = empleados;
        this.medicamentos = medicamentos;
        this.pacientes = pacientes;
    }
    /**
     * metodo getter de empleados
     * @return ArrayList de tipo Empleado
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    /**
     * metodo setter de Empelados
     * @param empleados recibe un ArrayList de empleados
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    /**
     * metodo getter de medicamentos
     * @return un ArrayList de tipo medicamentos
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    /**
     * metodo setter de medicamentos
     * @param medicamentos recibe un ArrayList de tipo Medicamento
     */
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    /**
     * metodo getter de pacientes
     * @return regresa un ArrayList de tipo Paciente
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    /**
     * metodo setter de Pacientes
     * @param pacientes recibe unn ArrayList de tipo Paciente
     */
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    /**
     * metodo que regresa los pacientes cuyo padecimiento inicia con vocal
     * @return un ArrayList de tipo Paciente
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
    public ArrayList<Paciente> padecimientoVocal(){
        OperacionBD op = new OperacionBD();
        int b =0;

        op.conectar();
        ArrayList<Paciente> paV = new ArrayList();
        pacientes = op.mostrarPacientes();
        //for(Paciente pa : pacientes){
        for(int i = 0; i<pacientes.size(); i++){
            Paciente pa = pacientes.get(i);
            if (pa.getPadecimiento().charAt(0) == 'a' || 
                    pa.getPadecimiento().charAt(0) == 'e' || pa.getPadecimiento().charAt(0) =='i' 
                    || pa.getPadecimiento().charAt(0) == 'o' || pa.getPadecimiento().charAt(0) == 'u' ||
                    pa.getPadecimiento().charAt(0) == 'A' || 
                    pa.getPadecimiento().charAt(0) == 'E' || pa.getPadecimiento().charAt(0) =='I' 
                    || pa.getPadecimiento().charAt(0) == 'O' || pa.getPadecimiento().charAt(0) == 'U') {
                paV.add(pa);
                System.out.println(pa.getNombre() + "\n");
            }
            i++;
        }
        return paV;
    }
    /**
     * metodo que calcula el numero de empleados homres y mujeres
     * @return un String con el valor para hombres y para mujeres
     */
    public String empleadoSex(){
        OperacionBD op = new OperacionBD();
        op.conectar();
        int hombres =0;
        int mujeres = 0;
        empleados = op.mostrarEmpleados();
        for(Empleado empSex : empleados)
            if("masculino".equals(empSex.getSexo())){
                hombres++;
                   
            }else{
                mujeres++;
            }
            
        return "El numero de empleados de sexo masculino es: "+ hombres + "\n y el de empleados de sexo femenino es: "  + mujeres;
    }
    /**
     * método que calcula la edad promedio de los empleados
     * @return un string en donde agrega el valor del promedio de las edades.
     */
    public Double empleadoEdadesProm(){
        OperacionBD op = new OperacionBD();
        op.conectar();
        empleados = op.mostrarEmpleados();
        
        double sumador =  op.extraerEdades();
        System.out.println("sumador empleadoEdadesProm: "+ sumador);
        double numeroEmp = empleados.size()/2;
        System.out.println("numeroEmp: "+ numeroEmp);
        double prom = ((double) sumador)/numeroEmp;
        
         
        return prom;
    }
    /**
     * metodo que regresa el  empleado con el menor y el que tiene el mayor sueldo
     * @return Regresa un String con los valores del empleado con mayor sueldo
     */
    public String salarioMenoryMayor(){
        OperacionBD op = new OperacionBD();
        op.conectar();
        empleados = op.ordenarEmpleadosPorSalario();
        int ultimo = empleados.size()-1; 
        String nombre1 = empleados.get(0).getNombre();
        double salario1 = empleados.get(0).getSalario();
        String nombre2 = empleados.get(ultimo).getNombre();
        double salario2 = empleados.get(ultimo).getSalario();
        
        String emp = "El empleado con menor sueldo es: \n" + nombre1 + " Salario: "+ salario1
                + " y el de mayor sueldo es:\n " + nombre2 + " Salario: " +salario2;
        
        return emp;
    
    }
}
