/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class rutas {
    String ruta;
    String fundamentos;
    String web;
    String formal;
    String datos;
    String datos2;
    String backend;

    public rutas(String ruta, String fundamentos, String web, String formal, String datos, String datos2, String backend) {
        this.ruta = ruta;
        this.fundamentos = fundamentos;
        this.web = web;
        this.formal = formal;
        this.datos = datos;
        this.datos2 = datos2;
        this.backend = backend;
    }

    @Override
    public String toString() {
        return "rutas{" + "ruta=" + ruta + ", fundamentos=" + fundamentos + ", web=" + web + ", formal=" + formal + ", datos=" + datos + ", datos2=" + datos2 + ", backend=" + backend + '}';
    }
}
