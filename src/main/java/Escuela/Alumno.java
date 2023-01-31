package Escuela;

import java.util.Scanner;


public class Alumno {
    Scanner sc = new Scanner(System.in);
    private String matricula, nombre, apellido, numTelefono, correo;

    public Alumno() {
        
    }

    public Alumno(String matricula, String nombre, String apellido, String numTelefono, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public void free() {
        sc.nextLine();
    }

    public void mostrarAlumno() {

        System.out.println("1.- Matricula: " + matricula);
        System.out.println("2.- Nombre: " + nombre);
        System.out.println("3.- Apellidos: " + apellido);
        System.out.println("4.- Numero telefono: " + numTelefono);
        System.out.println("5.- Correo: " + correo);
    }

    public int buscarAlumno(Alumno[] alumnos) {
        if(alumnos[0] == null) {
            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return -1;
        }

        String datoIngresado;
        System.out.println("Ingresa la matricula del alumno: ");
        datoIngresado = sc.next();
 
        for(int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getMatricula().equals(datoIngresado)) {
                System.out.println("\nAlumnos encontrado: ");
                alumnos[i].mostrarAlumno();
                return i;
            }
        }

        System.out.println("La matricula ingresada no pertenece a ningun alumno!!");
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

    public void actualizarAlumnoCompleto(Alumno[] alumnos) {

        if(alumnos[0] == null) {
            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return;
        }
    
        int indice = buscarAlumno(alumnos);

        if(indice == -1) return;

        Alumno alumnoActual = alumnos[indice];

        if(actualizarPrint("matricula").equals("si")) {

            alumnoActual.setMatricula(solDato("matricula"));
            free();

        }
        if(actualizarPrint("nombre").equals("si")) {

            alumnoActual.setNombre(solDato("nombre"));
            free();
        }
        if(actualizarPrint("apellidos").equals("si")) {
            
            alumnoActual.setApellido(solDato("apellidos"));
            free();
        }
        if(actualizarPrint("numero de telefono").equals("si")) {
            
            alumnoActual.setNumTelefono(solDato("numero de telefono"));
            free();
        }
        if(actualizarPrint("correo").equals("si")) {
            
            alumnoActual.setCorreo(solDato("correo"));
            free();
        }

        alumnoActual.mostrarAlumno();

    }

    public void actualizarDatoAlumno(Alumno[] alumnos) {

        if(alumnos[0] == null) {
            System.out.println("Aun no hay datos ingresados, por favor registra datos!!");
            return;
        }

        int indice = buscarAlumno(alumnos);
        if (indice == -1) return;

        Alumno alumnoActual = alumnos[indice];
        int datoIngresado;

        // alumnoActual.mostrarAlumno();
        System.out.println("Selecciona uno de los datos a actualizar: ");
        datoIngresado = sc.nextInt();

        switch(datoIngresado) {
            case 1: // matricula
                if(actualizarPrint("matricula").equals("si")){
                    alumnoActual.setMatricula(solDato("matricula"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 2: // nombres
                if(actualizarPrint("nombres").equals("si")){
                    alumnoActual.setNombre(solDato("nombres"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 3: // apellidos 
                if(actualizarPrint("apellidos").equals("si")){
                    alumnoActual.setApellido(solDato("apellidos"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 4: // numero de telefono
                if(actualizarPrint("telefono").equals("si")){
                    alumnoActual.setNumTelefono(solDato("telefono"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            case 5: // correo
                if(actualizarPrint("correo").equals("si")){
                    alumnoActual.setCorreo(solDato("correo"));
                    mensajeActulizacionExitosa();
                }else {
                    mensajeActulizacionFallo();
                }
                break;
            default:
                System.out.println("Opcion ingresada no valida!!");
                break;
        }

        alumnoActual.mostrarAlumno();

    }
}
