package Escuela;

import java.util.Scanner;

public class Universidad {
    Scanner sc = new Scanner(System.in);

    Profesor gestorProfesor = new Profesor();
    Alumno gestorAlumno     = new Alumno();
    AlumnoProfesor gestorReportes = new AlumnoProfesor();

    Alumno[] alumnos;
    Profesor[] profesores;
    AlumnoProfesor[] registros;

    boolean registroAlumnos = false;
    boolean registroProfesores = false;

    int contadorRegistros = -1;



    public void free() {
        sc.nextLine();
    }

    public void saltoLinea() {
        System.out.println(" ");
    }

    public int[] inicializarDatos() {
        int[] arrDatos = new int[3];

        System.out.println("Ingresa la cantidad de alumnos que tendra el sistema: ");
        arrDatos[0] = sc.nextInt();

        System.out.println("Ingresa la cantidad de profesores que tendra el sistema: ");
        arrDatos[1] = sc.nextInt();

        System.out.println("Ingresa la cantidad de reportes que tendra el sistema: ");
        arrDatos[2] = sc.nextInt();

        return arrDatos;
    }

    public int menu() {
        int datoIngresado;

        saltoLinea();
        System.out.println(
            "1.- Profesores\n" +
            "2.- Alumnos\n" +
            "3.- Reportes\n" +
            "4.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();
        return datoIngresado;
    }

    public int menuAlumno() {
        int datoIngresado;

        saltoLinea();
        System.out.println(
            "1.- Agregar alumno\n" +
            "2.- Buscar alumno\n" +
            "3.- Mostrar alumnos\n" +
            "4.- Actualizar alumno\n" +
            "5.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();
        return datoIngresado;
    }

    public void llenarDatosAlumnos() {

        if(registroAlumnos == true) {
            System.out.println("Los datos de alumnos ya estan registrados!!");
            return;
        }

        String matricula, nombre, apellidos, numTelefono, correo;

        for(int i = 0; i < alumnos.length; i++) {
            saltoLinea();
            System.out.println("Registro de alumnos");
            System.out.println("Alumno #" + (i + 1));

            System.out.println("Ingresa la matricula: ");
            matricula = sc.next();
            free();

            System.out.println("Ingresa el nombre: ");
            nombre = sc.next();
            free();

            System.out.println("Ingresa los apellidos: ");
            apellidos = sc.next();
            free();

            System.out.println("Ingresa el numero de telefono: ");
            numTelefono = sc.next();
            free();

            System.out.println("Ingresa el correo: ");
            correo = sc.next();
            free();

            alumnos[i] = new Alumno(matricula, nombre, apellidos, numTelefono, correo);
        }

        saltoLinea();
        System.out.println("Registro de alumnos completado!!");
        registroAlumnos = true;
    }

    public void actualizacionAlumno() {
        int datoIngresado;
        saltoLinea();
        System.out.println(
            "1.- Actualizar solo un dato\n" +
            "2.- Actualizar varios datos\n" +
            "3.- Salir"
        );
        datoIngresado = sc.nextInt();
        switch(datoIngresado) {
            case 1:
                gestorAlumno.actualizarDatoAlumno(alumnos);
                break;
            case 2:
                gestorAlumno.actualizarAlumnoCompleto(alumnos);
                break;
            case 3:
                System.out.println("Saliendo...");
                saltoLinea();
                break;
            default:
                System.out.println("La opcion ingresada no es valida!!");
                break;
        }
    }

    public void sistemaAlumno() {
        int datoUsuario;
        do{

            datoUsuario = menuAlumno();
            switch(datoUsuario) {
                case 1:
                    llenarDatosAlumnos();
                    break;
                case 2:
                    gestorAlumno.buscarAlumno(alumnos);
                    break;
                case 3:
                    gestorAlumno.buscarAlumno(alumnos);
                    break;
                case 4:
                    actualizacionAlumno();
                    break;
                case 5:
                    System.out.println("Saliendo del gestor de alumnos...");
                    saltoLinea();
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida!!");
                    break;
            }

        }while(datoUsuario != 5);
    }

    public int menuProfesor() {
        int datoIngresado;

        saltoLinea();
        System.out.println(
            "1.- Agregar profesor\n" +
            "2.- Buscar profesor\n" + 
            "3.- Mostrar profesor\n" +
            "4.- Actualizar profesor\n" +
            "5.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();
        return datoIngresado;
    }

    public void registroProfesores() {

        if(registroProfesores == true) {
            System.out.println("Ya se ha realizado el registro de alumnos!!");
            return;
        }

        String idProfesor, nombre, apellido, numTelefono, correo;

        for(int i = 0; i < profesores.length; i++) { 

            saltoLinea();
            System.out.println("Registro de Profesores");
            System.out.println("Profesor #" + (i + 1));

            System.out.println("Ingresa el ID: ");
            idProfesor = sc.next();
            free();

            System.out.println("Ingresa el nombre: ");
            nombre = sc.next();
            free();

            System.out.println("Ingresa los apellidos: ");
            apellido = sc.next();
            free();

            System.out.println("Ingresa el numero de telefono: ");
            numTelefono = sc.next();
            free();

            System.out.println("Ingresa el correo: ");
            correo = sc.next();
            free();

            profesores[i] = new Profesor(idProfesor, nombre, apellido, numTelefono, correo);
        }

        saltoLinea();
        System.out.println("Registro de maestros completado!!");
        registroProfesores = true;
    }

    public void actualizacionProfesor() {
        int datoIngresado;
        saltoLinea();
        System.out.println("Actualizacion de profesor");

        System.out.println(
            "1.- Actualizar varios datos\n" +
            "2.- Actualizar solo un dato\n" +
            "3.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();

        switch(datoIngresado) {
            case 1:
                gestorProfesor.actualizarProfesorCompleto(profesores);
                break;
            case 2:
                gestorProfesor.actualizarDatoProfesor(profesores);
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("La opcion ingresada no es valida!!");
                break;
        }
    }

    public void sistemaProfesor() {
        int datoUsuario;

        do{

            datoUsuario = menuProfesor();

            switch(datoUsuario) {
                case 1:
                    registroProfesores();
                    break;
                case 2:
                    saltoLinea();
                    gestorProfesor.buscarProfesor(profesores);
                    break;
                case 3:
                    saltoLinea();
                    gestorProfesor.buscarProfesor(profesores);
                    break;
                case 4:
                    actualizacionProfesor();
                    break;
                case 5:
                    System.out.println("Saliendo del gestor de profesores...");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }

        }while(datoUsuario != 5);
    }

    public int menuReporte() {
        saltoLinea();
        int datoIngresado;
        System.out.println(
            "1.- Crear vinculo\n" +
            "2.- Gererar reporte\n" +
            "3.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();
        return datoIngresado;
    }

    public void sistemaReporte() {
        int datoIngresado;

        do{
            datoIngresado = menuReporte();

            switch(datoIngresado) {
                case 1:
                    gestorReportes.registrarRelacion(registros, profesores, alumnos, contadorRegistros);
                    contadorRegistros++;
                    break;
                
                case 2:
                    gestorReportes.reportes(profesores, alumnos, contadorRegistros, registros);
                    break;
                
                case 3:
                    System.out.println("Saliendo del gestor de reportes...");
                    break;

                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }
        }while(datoIngresado != 3);
    }

    public void sistema() {
        int[] arrInicializacion = inicializarDatos();

        alumnos = new Alumno[arrInicializacion[0]];
        profesores = new Profesor[arrInicializacion[1]];
        registros = new AlumnoProfesor[arrInicializacion[2]];

        int datoIngresaUsuario;

        do{
            datoIngresaUsuario = menu();

            switch(datoIngresaUsuario) {
                case 1:
                    sistemaProfesor();
                    break;
                case 2:
                    sistemaAlumno();
                    break;
                case 3:
                    sistemaReporte();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    saltoLinea();
                    break;
                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }

        }while(datoIngresaUsuario != 4);

    }





    
}
