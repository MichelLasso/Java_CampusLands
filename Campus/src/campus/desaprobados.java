/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class desaprobados {
    String estudianteNombre;
    String estudianteApellido;
    int estudianteIdentificacion;
    String direccion;
    String acudiente;
    String telefonoFijo;
    String celular;
    String estado;
    double nota;

    public desaprobados(String estudianteNombre, String estudianteApellido, int estudianteIdentificacion, String direccion, String acudiente, String telefonoFijo, String celular, String estado, double nota) {
        this.estudianteNombre = estudianteNombre;
        this.estudianteApellido = estudianteApellido;
        this.estudianteIdentificacion = estudianteIdentificacion;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoFijo = telefonoFijo;
        this.celular = celular;
        this.estado = estado;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "desaprobados{" + "estudianteNombre=" + estudianteNombre + ", estudianteApellido=" + estudianteApellido + ", estudianteIdentificacion=" + estudianteIdentificacion + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoFijo=" + telefonoFijo + ", celular=" + celular + ", estado=" + estado + ", nota=" + nota + '}';
    }
    
    
    
}
