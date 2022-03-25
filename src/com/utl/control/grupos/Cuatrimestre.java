package com.utl.control.grupos;

public class Cuatrimestre {
    
    public int cuatrimestre;
    public int[] clave_materias;
    public Grupo[] grupos;

    public int consultarCuatrimestre() { return cuatrimestre; }
    public int[] consultarClave_materias() { return clave_materias; }
    public Grupo[] consultarGrupos() { return grupos; }

}
