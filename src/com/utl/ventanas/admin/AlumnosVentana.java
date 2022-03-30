package com.utl.ventanas.admin;

import com.utl.control.grupos.Alumno;
import com.utl.ventanas.Ventana;

import javax.swing.*;

public class AlumnosVentana extends Ventana {

    private Alumno alumno_temp;

    public AlumnosVentana() {
        this.iniciar();
    }

    public void iniciar() {
        switch (super.mostrarOpciones(
                "Lista de alumnos",
                "| Matricula | Nombre       | Sexo | Grupo  | Telefono   | Semestre |" + "\n" +
                        "|  210001  | Alejandro R.  |   M  | DSM201 | 4776807121 |    1     |" + "\n" +
                        "|  210002  | Uriel Vallejo |   M  | DSM201 | 4773837182 |    1     |" + "\n" +
                        "|  210003  | Cuitlahuac R. |   M  | DSM202 | 4775983823 |    1     |" + "\n" +
                        "|  210004  | Patricio Rey. |   M  | DSM202 | 4779282123 |    1     |" + "\n",
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
