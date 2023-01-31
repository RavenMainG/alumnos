package Escuela;

import java.util.Scanner;

public class Profesor {
    Scanner sc = new Scanner(System.in);
    private String idProfesor, nombre, apellido, numTelefono, correo;

    public Profesor() {
        
    }

    public Profesor(String idProfesor, String nombre, String apellido, String numTelefono, String correo) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public void saltoLinea() {
        System.out.println(" ");
    }

    public void mostrarProfesor() {
        System.out.println("1.- ID Profesor: " + idProfesor);
        System.out.println("2.- Nombre: " + nombre);
        System.out.println("3.- Apellidos: " + apellido);
        System.out.println("4.- Numero telefono: " + numTelefono);
        System.out.println("5.- Correo: " + correo);
    }

    public int buscarProfesor(Profesor[] profesores) {

        
        if(profesores[0] == null) {

            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return -1;
        }

        String datoIngresado;
        saltoLinea();
        System.out.println("Ingresa el ID del profesor: ");
        datoIngresado = sc.next();
 
        for(int i = 0; i < profesores.length; i++) {
            if(profesores[i].getIdProfesor().equals(datoIngresado)) {
                saltoLinea();
                System.out.println("Profesor encontrado: ");
                profesores[i].mostrarProfesor();;
                return i;
            }
        }

        System.out.println("El id ingresado no pertenece a ningun profesor!!");

        return -1;
    }

    public void mensajeActulizacionExitosa() {
        System.out.println("Actualizacion exitosa!!");
    }

    public void mensajeActulizacionFallo() {
        System.out.println("No se realizo ninguna actualizacion!!");
    }

    public String actualizarPrint(String tipoDato) {
        
        System.out.println("Deseas actualizar " + tipoDato + " ? (si / no): ");

        return sc.next();
    }

    public String solDato(String tipoDato) {
        System.out.println("Ingresa el nuevo dato para: " + tipoDato);
        return sc.next();
    }

    public void actualizarProfesorCompleto(Profesor[] profesores) {

        
        if(profesores[0] == null) {

            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return;
        }
    
        int indice = buscarProfesor(profesores);

        if(indice == -1) return;

        Profesor profesorActual = profesores[indice];

        if(actualizarPrint("ID Profesor").equals("si")) {

            profesorActual.setIdProfesor(solDato("matricula"));

        }
        if(actualizarPrint("nombre").equals("si")) {

            profesorActual.setNombre(solDato("nombre"));
        
        }
        if(actualizarPrint("apellidos").equals("si")) {
            
            profesorActual.setApellido(solDato("apellidos"));
        
        }
        if(actualizarPrint("numero de telefono").equals("si")) {
            
            profesorActual.setNumTelefono(solDato("numero de telefono"));
        
        }
        if(actualizarPrint("correo").equals("si")) {
            
            profesorActual.setCorreo(solDato("correo"));
        
        }
        
        saltoLinea();
        profesorActual.mostrarProfesor();

    }

    public void actualizarDatoProfesor(Profesor[] profesores) {

        if(profesores[0] == null) {

            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return;
        }

        int indice = buscarProfesor(profesores);
        if (indice == -1) return;

        Profesor profesorActual = profesores[indice];
        int datoIngresado;

        System.out.println("Selecciona uno de los datos a actualizar: ");
        datoIngresado = sc.nextInt();

        switch(datoIngresado) {
            case 1: // matricula
                if(actualizarPrint("matricula").equals("si")){
                    profesorActual.setIdProfesor(solDato("matricula"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 2: // nombres
                if(actualizarPrint("nombres").equals("si")){
                    profesorActual.setNombre(solDato("nombres"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 3: // apellidos 
                if(actualizarPrint("apellidos").equals("si")){
                    profesorActual.setApellido(solDato("apellidos"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 4: // numero de telefono
                if(actualizarPrint("telefono").equals("si")){
                    profesorActual.setNumTelefono(solDato("telefono"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 5: // correo
                if(actualizarPrint("correo").equals("si")){
                    profesorActual.setCorreo(solDato("correo"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            default:
                System.out.println("Opcion ingresada no valida!!");
                break;

        }
        profesorActual.mostrarProfesor();
    }


}
