package com.utl.control.materias;

public class MaestroMateria extends Materia {

    public float costo_hora;
    public int horas_asignadas;

    public float consultarCostoHora() { return this.costo_hora; }
    public int consultarHorasAsignadas() { return this.horas_asignadas; }

}
