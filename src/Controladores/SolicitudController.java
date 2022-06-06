package Controladores;

import Modelos.Genericos.Folio;
import Modelos.Genericos.Solicitud;
import Modelos.Persona.Estudiante;
import Utilerias.Archivos;
import Vista.app;

/**
 *
 * @author EduardoCGarcia
 */
public class SolicitudController {

    public static void registrarSolicitud(String asunto) throws Exception {
        if (app.typeRole.equals("alumno")) {
            registrarSolicitudAlumno(asunto);
        } else if (app.typeRole.equals("profesor")) {
            registrarSolicitudProfesor(asunto);
        } else if (app.typeRole.equals("admin")) {
            registrarSolicitudAdmin(asunto);
        }
    }

    public static void registrarSolicitudAlumno(String asunto) throws Exception {
        Solicitud n = new Solicitud(asunto, app.sol, new Folio());
        app.solicitudes.add(n);
        Archivos.guardarArchivo("solicitudes.dat", app.solicitudes);
    }

    public static void registrarSolicitudProfesor(String asunto) throws Exception {
        Solicitud n = new Solicitud(asunto, app.sol, new Folio());
        app.solicitudes.add(n);
        Archivos.guardarArchivo("solicitudes.dat", app.solicitudes);
    }

    public static void registrarSolicitudAdmin(String asunto) throws Exception {
        Solicitud n = new Solicitud(asunto, app.admin, new Folio());
        app.solicitudes.add(n);
        Archivos.guardarArchivo("solicitudes.dat", app.solicitudes);
    }

}
