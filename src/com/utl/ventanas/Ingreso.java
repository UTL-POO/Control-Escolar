package com.utl.ventanas;

import javax.swing.*;

public class Ingreso extends Ventana {

    public Ingreso() {
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
            return;
        }

        entrada = super.mostrarEntrada(
                "Bienvenido " + matricula,
                "Ingresa tu contraseña",
                JOptionPane.QUESTION_MESSAGE
        );

    }
}
