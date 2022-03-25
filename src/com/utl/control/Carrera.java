package com.utl.control;

public class Carrera {

    // Atributos de la clase carrera
    private String nombre; //Nombre de la carrera
    private String modalidad; //Modalidad de la carrera TSU o Lic/Ing
    private String turno; //Turno de la carrera
    private String especialidad;//Area especializada de la carrera


    public String consultarNombre() { return this.nombre; }
    public String consultarModalidad() { return this.modalidad; }
    public String consultarTurno() { return this.turno; }
    public String consultarEspecialidad() { return this.especialidad; }

}
