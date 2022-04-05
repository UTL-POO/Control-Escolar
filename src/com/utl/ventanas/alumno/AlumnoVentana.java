package com.utl.ventanas.alumno;

import com.utl.ventanas.Ventana;

public class AlumnoVentana extends Ventana {

    public AlumnoVentana() {
        int opciones = super.mostrarOpciones(
                "Consulta de calificaciones",
                  "| Materia      | Parcial 1 | Parcial 2 | Parcial 3 |" + "\n" +
                        " | MEMODESO     |   10      |    7      |     5     |" + "\n\n",
                new Object[]{"Cerrar Sesion"}
        );
    }

}
