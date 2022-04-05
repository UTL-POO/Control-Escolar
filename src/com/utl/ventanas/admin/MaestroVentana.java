package com.utl.ventanas.admin;

import com.utl.control.personal.Maestro;
import com.utl.session.Session;
import com.utl.ventanas.Ventana;

import javax.swing.*;

public class MaestroVentana extends Ventana {


    private Maestro maestro_temp;

    public MaestroVentana(Session session) {
        this.iniciar();
    }

    public void iniciar() {
        switch (super.mostrarOpciones(
                "Lista de maestros",
                "| Matricula | Nombre       | Sexo | Grupo  | Telefono   | Semestre |" + "\n" +
                        "|  210001  | Alejandro R.  |   M  | DSM201 | 4776807121 |    1     |" + "\n" +
                        "|  210002  | Uriel Vallejo |   M  | DSM201 | 4773837182 |    1     |" + "\n" +
                        "|  210003  | Cuitlahuac R. |   M  | DSM202 | 4775983823 |    1     |" + "\n" +
                        "|  210004  | Patricio Rey. |   M  | DSM202 | 4779282123 |    1     |" + "\n",
                new Object[] {"Agregar Maestro", "Eliminar Maestro"}
        )) {
            case 0:
                this.agregarMaestro();
                break;

            case 1:
                this.eliminarMaestro();
                break;

            default:
                break;
        }
    }

    public void agregarMaestro() {
        this.maestro_temp = new Maestro();

        this.maestro_temp.definirNombre(super.mostrarEntrada(
                "Agregar Maestro",
                "Ingresa el nombre del Maestro",
                JOptionPane.QUESTION_MESSAGE
        ));

        this.maestro_temp.definirSexo(
                super.mostrarOpciones(
                        "Agregar Maestro",
                        "¿Cual es el sexo del Maestro?",
                        new Object[]{"Hombre", "Mujer"}
                ) == 0 ? "H" : "M"
        );

        this.maestro_temp.definirTelefono(
                Integer.parseInt(super.mostrarEntrada(
                        "Agregar Maestro",
                        "Ingresa el numero de telefono del Maestro",
                        JOptionPane.QUESTION_MESSAGE
                ))
        );

        super.mostrarOpciones(
                "Confirmación",
                "¿Estás seguro de agregar al Maestro con estos datos?" + "\n" +
                        "Nombre: " + this.maestro_temp.consultarNombre() + "\n" +
                        "Sexo: " + this.maestro_temp.consultarSexo() + "\n" +
                        "Telefono: " + this.maestro_temp.consultarTelefono(),
                new Object[]{"Aceptar"}
        );

        iniciar();
    }

    public void eliminarMaestro() {
        super.mostrarEntrada(
                "Eliminar Maestro",
                "Ingresa la matricula del Maestro a eliminar",
                JOptionPane.QUESTION_MESSAGE
        );

        super.mostrarTexto("Se eliminó el Maestro!");

        iniciar();
    }

    
}