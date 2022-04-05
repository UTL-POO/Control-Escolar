package com.utl.ventanas.admin;

import com.utl.control.grupos.Alumno;
import com.utl.session.Session;
import com.utl.ventanas.Ventana;

import javax.swing.*;

public class AlumnosVentana extends Ventana {

    private Alumno alumno_temp;
    private Session session;

    public AlumnosVentana(Session session) {
        this.iniciar();
        this.session = session;
    }

    public Session conseguirSession() { return session; }

    public void iniciar() {
        String tabla = "| Matricula | Nombre       | Sexo | Grupo  | Telefono   | Semestre |" + "\n";

        switch (super.mostrarOpciones(
                "Lista de alumnos", tabla,
                new Object[] {"Agregar Alumno", "Eliminar Alumno"}
        )) {
            case 0:
                this.agregarAlumno();
                break;

            case 1:
                this.eliminarAlumno();
                break;

            default:
                break;
        }
    }

    public void agregarAlumno() {
        this.alumno_temp = new Alumno();

        this.alumno_temp.definirNombre(super.mostrarEntrada(
                "Agregar Alumno",
                "Ingresa el nombre del alumno",
                JOptionPane.QUESTION_MESSAGE
        ));

        this.alumno_temp.definirSexo(
                super.mostrarOpciones(
                        "Agregar Alumno",
                        "¿Cual es el sexo del alumno?",
                        new Object[]{"Hombre", "Mujer"}
                ) == 0 ? "H" : "M"
        );

        this.alumno_temp.definirTelefono(
                Integer.parseInt(super.mostrarEntrada(
                        "Agregar Alumno",
                        "Ingresa el numero de telefono del alumno",
                        JOptionPane.QUESTION_MESSAGE
                ))
        );

        super.mostrarOpciones(
                "Confirmación",
                "¿Estás seguro de agregar al alumno con estos datos?" + "\n" +
                        "Nombre: " + this.alumno_temp.consultarNombre() + "\n" +
                        "Sexo: " + this.alumno_temp.consultarSexo() + "\n" +
                        "Grupo: " + this.alumno_temp.consultarSemestre() + "\n" +
                        "Telefono: " + this.alumno_temp.consultarTelefono(),
                new Object[]{"Aceptar"}
        );

        iniciar();
    }

    public void eliminarAlumno() {
        super.mostrarEntrada(
                "Eliminar Alumno",
                "Ingresa la matricula del alumno a eliminar",
                JOptionPane.QUESTION_MESSAGE
        );

        super.mostrarTexto("Se eliminó el alumno!");

        iniciar();
    }

}
