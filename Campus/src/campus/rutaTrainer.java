/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class rutaTrainer {
    String nombre;
    String ruta;

    public rutaTrainer(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "rutaTrainer{" + "nombre=" + nombre + ", ruta=" + ruta + '}';
    }
}
