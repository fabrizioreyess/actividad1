/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pc
 */
public class cliente extends persona{
    private String nit;

    public cliente (){}
    public cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
        System.out.println("NIt :"+ getNit());
        System.out.println("Nombres :"+ getNombres());
        System.out.println("Apellidos :"+ getApellidos());
        System.out.println("Direccion :"+ getDireccion());
        System.out.println("Telefono :"+ getTelefono());
        System.out.println("Fecha Nacimiento :"+ getFecha_nacimiento());
        System.out.println("------------------------------");

    }
}
