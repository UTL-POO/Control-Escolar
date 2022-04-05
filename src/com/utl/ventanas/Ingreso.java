package com.utl.ventanas;

import com.utl.control.grupos.Alumno;
import com.utl.control.personal.Maestro;
import com.utl.session.Session;
import com.utl.ventanas.admin.AlumnosVentana;
import com.utl.ventanas.admin.MaestroVentana;
import com.utl.ventanas.alumno.AlumnoVentana;
import com.utl.ventanas.maestro.ControlMVentana;

import javax.swing.*;
import java.sql.SQLException;

public class Ingreso extends Ventana {

    public Ingreso() throws SQLException {
        super.mostrarTexto(
                "Bienvenido SDU (Sistema Digital Universitario)" + "\n" +
                        "SDU es un portal de control escolar para el control" + "\n" +
                        "administrativo de un centro de estudios, en la siguiente ventana" + "\n" +
                        "por favor ingresa tu matricula para acceder al SDU" + "\n\n"
        );

        String entrada = super.mostrarEntrada(
                SISTEMA,
                "Ingresa tu matricula",
                JOptionPane.QUESTION_MESSAGE
        );

        int matricula = 0;

        try {
            matricula = Integer.parseInt(entrada);

            if (entrada.length() != 6) throw new Exception("Matricula incompleta");
        } catch (Exception exception) {
            super.mostrarError(SISTEMA, "Tu matricula no es numerica o está incompleta!");

            new Ingreso();
            return;
        }

        Session session = new Session(matricula);
        if (!session.validar()) {
            super.mostrarError("Matricula no valida", "Has introducido una matricula no valida, intenta de nuevo!");

            new Ingreso();
            return;
        }

        String clave = super.mostrarEntrada(
                "Bienvenido " + session.conseguirPersona().consultarNombre(),
                "Ingresa tu contraseña",
                JOptionPane.QUESTION_MESSAGE
        );

        if (!session.conseguirPersona().consultarClave().equals(clave)) {
            super.mostrarError("Clave incorrecta", "La clave ingresada es incorrecta!");

            return;
        }

        if (session.conseguirPersona() instanceof Alumno) {
            new AlumnoVentana();
        } else if (session.conseguirPersona() instanceof Maestro) {
            new ControlMVentana();
        }

    }
}
