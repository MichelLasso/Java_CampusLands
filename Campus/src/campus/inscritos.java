/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;

/**
 *
 * @author Uniminuto Tibu
 */
public class inscritos {
    String estudianteNombre;
    String estudianteApellido;
    int estudianteIdentificacion;
    String direccion;
    String acudiente;
    String telefonoFijo;
    String celular;
    String estado;

    public inscritos(String estudianteNombre, String estudianteApellido, int estudianteIdentificacion, String direccion, String acudiente, String telefonoFijo, String celular, String estado) {
        this.estudianteNombre = estudianteNombre;
        this.estudianteApellido = estudianteApellido;
        this.estudianteIdentificacion = estudianteIdentificacion;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoFijo = telefonoFijo;
        this.celular = celular;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "inscritos{" + "estudianteNombre=" + estudianteNombre + ", estudianteApellido=" + estudianteApellido + ", estudianteIdentificacion=" + estudianteIdentificacion + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoFijo=" + telefonoFijo + ", celular=" + celular + ", estado=" + estado + '}';
    }
    
    
}
