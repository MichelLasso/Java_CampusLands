
package campus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Campus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            //insercion de datos
            estudiantes estudiante1 = new estudiantes("Sputnik", "Cristina", "Aguilera Moron", 4024, 
                "Calle 9 #10-210", "Ramon Aguilera Torrado", "601 5787492", "313 575 78 25", 
                "Cursando", "Pedro", "Java", "19-02-2024", "14-04-2025", "inactivo");

            estudiantes estudiante2 = new estudiantes("Apolo", "Diego Leon", "Santana Conedo", 6536, 
                    "Calle 11 #24-253", "Carlos Santana Guerrero", "601 5423546", "302 575 45 66", 
                    "Cursando", "Stiven", "NodeJS", "19-02-2024", "14-04-2024", "inactivo");

            estudiantes estudiante3 = new estudiantes("Artemis", "Moly Alejandra", "Castillo Arellano", 5657, 
                    "Urbanizacion La Esmeralda", "Cristina Arellano Casas", "601 8255272", "313 527 35 52", 
                    "Cursando", "Andres", "NetCore", "19-02-2024", "14-04-2025", "inactivo");
            
            ArrayList<estudiantes> listEstudiantes= new ArrayList <> ();
            listEstudiantes.add(estudiante1);
            listEstudiantes.add(estudiante2);
            listEstudiantes.add(estudiante3);
            
            trainers trainer1= new trainers("andres", "Jurado", 2511, "andres13");
            trainers trainer2 = new trainers("pedro", "Gomez", 2111, "pedro21");
            
            ArrayList<trainers> listTrainers = new ArrayList<>();
            listTrainers.add(trainer1);
            listTrainers.add(trainer2);
            
            System.out.println(trainer1);
            System.out.println(trainer2);
            
            rutas ruta1= new rutas("Java", "fundamentos de programacion: Introduccion a la algoritmia, Pseint, Python", "Programacion web: HTML, CSS, Bootstrap", "Java", "Bases de datos principal: Mysql", "Base de datos alternativa: Postgresql", "SpingBoot, Express");
            ArrayList<rutas> listRutas = new ArrayList<>();
            listRutas.add(ruta1);
            
            rutaTrainer rutaT1 =new rutaTrainer("pedro", "Java");
            rutaTrainer rutaT2 =new rutaTrainer("stiven", "NodeJS");
            rutaTrainer rutaT3 =new rutaTrainer("andres", "NetCore");
            rutaTrainer rutaT4 =new rutaTrainer("michael", "PHP");
            
            ArrayList<rutaTrainer> listRutaTrainer = new  ArrayList<>();
            listRutaTrainer.add(rutaT1);
            listRutaTrainer.add(rutaT2);
            listRutaTrainer.add(rutaT3);
            listRutaTrainer.add(rutaT4);
            
            coordinador coordi1= new coordinador("Valerie", 2312, "val23");
            
            ArrayList<coordinador> listCoordi = new ArrayList<>();
            listCoordi.add(coordi1);
            
            inscritos inscrito1= new inscritos("mario", "Lopez Carascal", 1245, "Calle 53 #7-43", "Leslie Carrascal Sanchez", "601 3256738", "323 645 98 00", "Inscrito");
            
            ArrayList<inscritos> listInscritos= new ArrayList<>();
            listInscritos.add(inscrito1);
            
            ArrayList<desaprobados> listDesaprobados = new ArrayList<>();
            
            //Asignacion de varibales
            String simodulo = "Modulo aprobado";
            String nomodulo = "Modulo desaprobado";
            String si= "Aprobado";
            String no="Desaprobado";
            
            
            boolean salir= true;
            while (salir) { 
                    System.out.println("------------------------------------------------");
                    System.out.println("                 CAMPUSLAND                     ");
                    System.out.println("------------------------------------------------");
                    
                    System.out.println("Elige tu cargo para iniciar sesión");
                    System.out.println("1. Camper");
                    System.out.println("2. Trainer");
                    System.out.println("3. Coordinador");
                    String opcion= scanner.nextLine().toLowerCase();
                                        
                    if (opcion.equals("camper")) {
                        System.out.print("\033[H\033[2J"); 
                        
                        System.out.println("-------");
                        System.out.println("BIENVENIDO CAMPER");
                        System.out.println("-------");

                        System.out.println("Ingrese su nombre de usuario");
                        String usuario= scanner.nextLine().toLowerCase();
                        
                        System.out.println("Ingrese su contraseña: ");
                        int contrasena = scanner.nextInt();
                        scanner.nextLine();
                        
                        salir= false;
                        for (estudiantes i : listEstudiantes) {
                            if (i.estudianteNombre.toLowerCase().equals(usuario) && i.estudianteIdentificacion == contrasena) {
                                salir= true;
                                System.out.print("\033[H\033[2J");
                                
                                System.out.println("------");
                                System.out.println("DATOS" + i.estudianteNombre + i.estudianteApellido);
                                System.out.println("------");
                                
                                System.out.println("Dirección: "+ i.direccion);
                                System.out.println("Acudiente: " + i.acudiente);
                                System.out.println("Teléfono fijo: " + i.telefonoFijo);
                                System.out.println("Celular: " + i.celular);
                                System.out.println("Estado: " + i.estado);
                                System.out.println("Trainer: " + i.trainer);
                                System.out.println("Ruta: " + i.ruta);
                                System.out.println("Fecha de inicio: " + i.fechaInicio);
                                System.out.println("Fecha de finalización: " + i.fechaFinalizacion);
                                
                                System.out.println("¿Desea continuar viendo sus datos? (si/no)");
                                String pregunta= scanner.nextLine().toLowerCase();
                                
                                if (pregunta.equals("no")) {
                                    salir= true;
                                } else{
                                    salir=false;
                                }                        
                            } else {
                                System.out.println("Usuario y contraseña no encontrado.");
                            }
                    break;
                    
                    }
                    } else if (opcion.equals("trainer")) {
                        System.out.print("\033[H\033[2J"); 
                        
                        System.out.println("-------");
                        System.out.println("BIENVENIDO TRAINER");
                        System.out.println("-------");

                        System.out.println("Ingrese su nombre de usuario");
                        String usuario= scanner.nextLine().toLowerCase();
                        
                        System.out.println("Ingrese su contraseña: ");
                        String contrasena = scanner.nextLine();
                        
                        for (trainers i : listTrainers) {
                            if (i.nombre.toLowerCase().equals(usuario) && i.contrasena.equals(contrasena)) {
                                boolean trainerBucle= true;
                                while (trainerBucle=true) {
                                    System.out.println("-----");
                                    System.out.println("TRAINER");
                                    System.out.println("-----");
                                    System.out.println("1. Informacion personal");
                                    System.out.println("2. Cerrar sesion.");
                                    
                                    int opcionTrainer= scanner.nextInt();
                                    
                                    if (opcionTrainer==1) {
                                        System.out.println("----");
                                        System.out.println("DATOS");
                                        System.out.println("----");
                                        
                                        System.out.println("Nombre: " + i.nombre);
                                        System.out.println("Identificación: " + i.id);
                                        System.out.println("Contraseña: "+ i.contrasena);
                                        
                                        for (rutaTrainer x : listRutaTrainer) {
                                            
                                            if (x.nombre.equals(i.nombre)) {
                                                System.out.println("Ruta Asignada: " + x.ruta);
                                                System.out.println("---------");
                                                
                                                System.out.println("¿Desea continuar viendo sus datos? Si no, se volverá al menú principal. (si/no)");
                                                String pregunta= scanner.nextLine().toLowerCase();
                                                scanner.nextLine();
                                                if (pregunta.equals("si")) {
                                                    trainerBucle=false;
                                                } else {
                                                    salir=true;
                                                }
                                                
                                            }
                                        }
                                    } else if (opcionTrainer==2) {
                                        System.out.println("----");
                                        System.out.println("CERRAR SESION");
                                        System.out.println("----");
                                        System.out.println("1. Si");
                                        System.out.println("2. No");
                                        
                                        int sino= scanner.nextInt();
                                        
                                        if (sino==1) {
                                            System.out.println("Cerrando sesion...");
                                            Thread.sleep(3000);
                                            break;
                                        }
                                    } else {
                                        System.out.println("La opcion no existe :(");
                                        
                                    }
 {
                                    }
                                }
                            } else{
                                System.out.println("Contraseña o nombre incorrecto, verifique sus datos");
                            }
                        }
                    } else if (opcion.equals("coordinador")) {
                        boolean sesionCoordinador = true;
                        while (sesionCoordinador) {
                            System.out.println("----");
                            System.out.println("BIENVENIDO COORDINADOR");
                            System.out.println("----");

                            System.out.println("Numero de identificacion: ");
                            int usuario= scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Ingrese su contraseña: ");
                            String contrasena = scanner.nextLine();

                            boolean bucleCoordinador = true;
                            while (bucleCoordinador) {
                                for (coordinador i : listCoordi) {
                                    if (i.id==usuario && i.contrasena.equals(contrasena)) {

                                        System.out.println("Eliija una opcion: ");
                                        System.out.println("1. Inscribir campers");
                                        System.out.println("2. Registrar notas");
                                        System.out.println("3. Eliminar Trainers");
                                        System.out.println("4. Finalizar");
                                        int respuestaUsusuario= scanner.nextInt();

                                        if (respuestaUsusuario==1) {
                                            System.out.println("-----");
                                            System.out.println("Inscribir Campers");
                                            System.out.println("-----");
                                            
                                            System.out.println("Identificacion: ");
                                            int id= scanner.nextInt();
                                            scanner.nextLine();

                                            System.out.println("Nombres: ");
                                            String name= scanner.nextLine();

                                            System.out.println("Apellidos: ");
                                            String apellido= scanner.nextLine();

                                            System.out.println("Dirección: ");
                                            String direccion= scanner.nextLine();

                                            System.out.println("Acudiente: ");
                                            String acudiente= scanner.nextLine();

                                            System.out.println("Número fijo: ");
                                            String nFijo= scanner.nextLine();

                                            System.out.println("Celular: ");
                                            String cel= scanner.nextLine();

                                            System.out.println("Estado: ");
                                            String estado= scanner.nextLine();


                                            inscritos inscrito2= new inscritos(name, apellido, id, direccion, acudiente, nFijo, cel, estado);
                                            listInscritos.add(inscrito2);

                                            System.out.println("El Camper ah sido inscrito con éxito");
                                            System.out.println("------");

                                            System.out.println("¿Desea continuar? Si no, se volverá al menú principal. (si/no)");
                                            String pregunta= scanner.nextLine().toLowerCase();

                                            if (pregunta.equals("si")) {
                                                bucleCoordinador=false;
                                            } else {
                                                salir=true;
                                            }
                                        } else if(respuestaUsusuario==2){
                                            
                                            System.out.println("-----");
                                            System.out.println("Registrar notas");
                                            System.out.println("-----");
                                            
                                                System.out.println("----");
                                                System.out.println("Prueba inicial");
                                                System.out.println("----");
                                                
                                                System.out.println("Campers inscritos");
                                                System.out.println("-----");
                                                
                                                for (inscritos ins : listInscritos) {
                                                    System.out.println(ins.estudianteNombre + "" + ins.estudianteApellido + ins.estudianteIdentificacion);
                                                }
                                                System.out.println("-----");
                                                scanner.nextLine();
                                                System.out.println("Ingrese el nombre del camper que desea revisar: ");
                                                String nameCamper= scanner.nextLine().toLowerCase();
                                                System.out.println("Ingrese el id del camper");
                                                int idCamper= scanner.nextInt();
                                                
                                                for (inscritos ins : listInscritos) {
                                                    System.out.println(ins.estudianteIdentificacion);
                                                    if (ins.estudianteNombre.equals(nameCamper) && ins.estudianteIdentificacion== idCamper) {
                                                        System.out.println("Inscrito: "+ins.estudianteNombre + ins.estudianteApellido);
                                                        System.out.println("-----");
                                                        System.out.println("La persona fue encontrada :)");
                                                        System.out.println("-----");
                                                        System.out.println("Ingrese la nota de la prueba inicial: ");
                                                        System.out.println("Nota práctica 70%: ");
                                                        int porcentajeMayor= scanner.nextInt();
                                                        
                                                        System.out.println("Nota teórica 30%: ");
                                                        int porcentajeMenor= scanner.nextInt();
                                                        
                                                        if (porcentajeMayor<=100 && porcentajeMenor>=1) {
                                                            double resultado= ((porcentajeMayor * 0.7)+ (porcentajeMenor * 0.30));
                                                            System.out.println(resultado);
                                                            if (resultado>=60) {
                                                                ins.estado=si;
                                                                listEstudiantes.add(new estudiantes("", ins.estudianteNombre, ins.estudianteApellido, ins.estudianteIdentificacion, ins.direccion, ins.acudiente, ins.telefonoFijo, ins.celular, ins.estado, "", "", "", "", "Activo"));
                                                                
                                                                System.out.println("-----");
                                                                System.out.println("EXAMEN APROBADOO");
                                                                System.out.println("-----");
                                                                System.out.println("Ingrese el area de entrenamiento del alumno: (Sputnik, Apolo, Artemis) ");
                                                                System.out.println("-----");
                                                                String salonCamper= scanner.nextLine().toLowerCase();
                                                                scanner.nextLine();
                                                                
                                                                for (estudiantes est: listEstudiantes) {
                                                                    if (est.estudianteIdentificacion==ins.estudianteIdentificacion) {
                                                                        est.nombreSalon=salonCamper;
                                                                    }
                                                                }
                                                                System.out.println(listEstudiantes);
                                                            } else {
                                                                listDesaprobados.add(new desaprobados(ins.estudianteNombre, ins.estudianteApellido, ins.estudianteIdentificacion, ins.direccion, ins.acudiente, ins.telefonoFijo, ins.celular, no, resultado));
                                                                System.out.println("-----");
                                                                System.out.println("El camper ah rebropado con una nota de : " + resultado);
                                                                System.out.println("-----");
                                                                
                                                            }
                                                        } else {
                                                            System.out.println("-----");
                                                            System.out.println("La nota supera el limite o ingresaste mal los datos");
                                                            System.out.println("-----");
                                                        }
                                                        
                                                    } else {
                                                        System.out.println("No existe");
                                                    }
                                                }
                                        }else if(respuestaUsusuario==3){
                                            System.out.println("----");
                                            System.out.println("Eliminar Trainers");
                                            System.out.println("----");
                                            System.out.println("Ingrese el id del trainer");
                                            int idTrainer= scanner.nextInt();
                                                
                                            for (trainers trai : listTrainers) {
                                                    
                                                if (trai.id==idTrainer) {
                                                    System.out.println("----");
                                                    System.out.println("Trainer encontrado");
                                                    System.out.println(trai.nombre + trai.apellido);
                                                    System.out.println("----");
                                                    listTrainers.remove(trai);
                                                    System.out.println("----");
                                                    System.out.println("El trainer ah sido eliminado con exito:)");
                                                    System.out.println("----");
                                                    System.out.println(listTrainers);
                                                }
                                             }
                                        }else if(respuestaUsusuario==4){        
                                            bucleCoordinador=false;
                                            sesionCoordinador=false;
                                        }else {
                                            System.out.println("La opcion que ingresaste no existe");
                                        }
                                    }
                                }
                            }
                    }
                            
                    }
            } 
            
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally {
            scanner.close();
        }
    }
    
}
