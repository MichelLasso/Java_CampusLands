/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus;
/**
 *
 * @author Uniminuto Tibu
 */
public class estudiantes {
    // Atributos ("características")
    String nombreSalon;
    String estudianteNombre;
    String estudianteApellido;
    int estudianteIdentificacion;
    String direccion;
    String acudiente;
    String telefonoFijo;
    String celular;
    String estado;
    String trainer;
    String ruta;
    String fechaInicio;
    String fechaFinalizacion;
    String estadoPlataforma;

    public estudiantes(String nombreSalon, String estudianteNombre, String estudianteApellido, int estudianteIdentificacion, String direccion, String acudiente, String telefonoFijo, String celular, String estado, String trainer, String ruta, String fechaInicio, String fechaFinalizacion, String estadoPlataforma) {
        this.nombreSalon = nombreSalon;
        this.estudianteNombre = estudianteNombre;
        this.estudianteApellido = estudianteApellido;
        this.estudianteIdentificacion = estudianteIdentificacion;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoFijo = telefonoFijo;
        this.celular = celular;
        this.estado = estado;
        this.trainer = trainer;
        this.ruta = ruta;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estadoPlataforma = estadoPlataforma;
    }

    @Override
    public String toString() {
        return "estudiantes{" + "nombreSalon=" + nombreSalon + ", estudianteNombre=" + estudianteNombre + ", estudianteApellido=" + estudianteApellido + ","
                + " estudianteIdentificacion=" + estudianteIdentificacion + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoFijo=" + telefonoFijo 
                + ", celular=" + celular + ", estado=" + estado + ", trainer=" + trainer + ", ruta=" + ruta + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + 
                fechaFinalizacion + ", estadoPlataforma=" + estadoPlataforma + '}';
    }
}
