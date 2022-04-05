package com.utl.control.grupos;

import com.utl.control.materias.AlumnoMateria;
import com.utl.control.personal.Personal;

public class Alumno extends Personal {

    public int semestre;
    public AlumnoMateria[] materias;

    public Alumno() { }

    public Alumno(int matricula, String nombre, String clave, int telefono, int semestre, String sexo, String correo, AlumnoMateria[] materias) {
        super(matricula, nombre, clave, telefono, sexo, correo);

        this.semestre = semestre;
        this.materias = materias;
    }

    public int consultarSemestre() { return semestre; }
    public AlumnoMateria[] consultarMaterias() { return materias; }

}
