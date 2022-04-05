package com.utl.ventanas.maestro;

import com.utl.ventanas.Ventana;

import javax.swing.*;

public class ControlMVentana extends Ventana {

    private Object[] grupos = new Object[]{"DSM 201", "DSM 202", "DSM203", "DSM204"};

    public ControlMVentana() {
        super.mostrarOpciones(
                "Grupos",
                "Por favor selecciona el grupo a capturar",
                this.grupos
                );

        super.mostrarEntrada(
                "Lista de alumnos",
                "| Matricula | Nombre       | Sexo | Grupo  | Telefono   | Semestre |" + "\n" +
                        "|  210001  | Alejandro R.  |   M  | DSM201 | 4776807121 |    1     |" + "\n" +
                        "|  210002  | Uriel Vallejo |   M  | DSM201 | 4773837182 |    1     |" + "\n" +
                        "|  210003  | Cuitlahuac R. |   M  | DSM202 | 4775983823 |    1     |" + "\n" +
                        "|  210004  | Patricio Rey. |   M  | DSM202 | 4779282123 |    1     |" + "\n\n" +
                        "Por favor ingresa la matricula del alumno a capturar",
                JOptionPane.QUESTION_MESSAGE
        );
    }

}
