package com.utl.control.materias;

abstract public class Materia {

    private int clave;
    private String nombre;
    private int hora_semanal;

    public int consultarClave() { return this.clave; }
    public String consultarNombre() { return this.nombre; }
    public int consultarHoraSemanal() { return this.hora_semanal; }
}
