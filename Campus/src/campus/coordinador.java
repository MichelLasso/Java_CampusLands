/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class coordinador {
     String nombre;
    int id;
    String contrasena;

    public coordinador(String nombre, int id, String contrasena) {
        this.nombre = nombre;
        this.id = id;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "coordinador{" + "nombre=" + nombre + ", id=" + id + ", contrasena=" + contrasena + '}';
    }
}
