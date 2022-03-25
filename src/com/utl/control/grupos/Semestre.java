package com.utl.control.grupos;

public class Semestre {
    
    public int semestre;
    public int[] clave_materias;
    public Grupo[] grupos;

    public int consultarSemestre() { return semestre; }
    public int[] consultarClave_materias() { return clave_materias; }
    public Grupo[] consultarGrupos() { return grupos; }

}
