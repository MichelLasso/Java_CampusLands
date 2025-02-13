/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class trainers {
    String nombre;
    String apellido;
    int id;
    String contrasena;
    
    public trainers(String nombre, String apellido, int id,String contrasena){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.contrasena=contrasena;
    }

    @Override
    public String toString() {
        return "trainers{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", contrasena=" + contrasena + '}';
    }
}
