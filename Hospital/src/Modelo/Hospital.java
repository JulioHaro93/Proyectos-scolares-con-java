/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.OperacionBD;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Hospital {
    
    private ArrayList<Empleado> empleados;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Paciente> pacientes;

    public Hospital(){}
    
    public Hospital(ArrayList<Empleado> empleados, ArrayList<Medicamento> medicamentos, ArrayList<Paciente> pacientes) {
        this.empleados = empleados;
        this.medicamentos = medicamentos;
        this.pacientes = pacientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public ArrayList<Paciente> padecimientoVocal(){
        OperacionBD op = new OperacionBD();
        int b =0;
        //int i =0;
        op.conectar();
        ArrayList<Paciente> paV = new ArrayList();
        pacientes = op.mostrarPacientes();
        //for(Paciente pa : pacientes){
        for(int i = 0; i<pacientes.size(); i++){
            Paciente pa = pacientes.get(i);
            if (/*pa.getPadecimiento().charAt(0) == 'a' || 
                    pa.getPadecimiento().charAt(0) == 'e' || pa.getPadecimiento().charAt(0) =='i' 
                    || pa.getPadecimiento().charAt(0) == 'o' || pa.getPadecimiento().charAt(0) == 'u' ||*/
                    pa.getPadecimiento().charAt(0) == 'A' || 
                    pa.getPadecimiento().charAt(0) == 'E' || pa.getPadecimiento().charAt(0) =='I' 
                    || pa.getPadecimiento().charAt(0) == 'O' || pa.getPadecimiento().charAt(0) == 'U') {
                paV.add(pa);
                System.out.println(pa.getNombre() + "\n");
                //paV.get(b);
                //b = 2*i;
            }
            i++;
        }
        return paV;
    }
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
    
    public String empleadoEdadesProm(){
        OperacionBD op = new OperacionBD();
        op.conectar();
        empleados = op.mostrarEmpleados();
        
        double sumador =  op.extraerEdades();
        System.out.println("sumador empleadoEdadesProm: "+ sumador);
        double numeroEmp = empleados.size()/2;
        System.out.println("numeroEmp: "+ numeroEmp);
        double prom = ((double) sumador)/numeroEmp;
        
         
        return "El promedio de las edades por empleado es: "+ prom;
    }
    public void salarioMenoryMayor(){
        OperacionBD op = new OperacionBD();
        op.conectar();
        empleados = op.ordenarEmpleadosPorSalario();
        int ultimo = empleados.size()-1; 
        System.out.println("El empleado con menor sueldo es: \n "+ empleados.get(0));
        System.out.println("El empleado con mayor sueldo es: "+ empleados.get(ultimo));
    
    }
}
