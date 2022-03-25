package com.utl.ventanas;

import javax.swing.*;

abstract public class Ventana {

    public static String SISTEMA = "SDU (Sistema Digital Universitario)";

    public void mostrarError(String titulo, String texto) {
        JOptionPane.showMessageDialog(
                null,
                texto,
                titulo,
                JOptionPane.ERROR_MESSAGE
        );
    }

    public String mostrarEntrada(String titulo, String texto) {
        return JOptionPane.showInputDialog(
                null,
                texto,
                titulo
        );
    }

    public String mostrarEntrada(String titulo, String texto, int imagen) {
        return JOptionPane.showInputDialog(
                null,
                texto,
                titulo,
                imagen
        );
    }
}
