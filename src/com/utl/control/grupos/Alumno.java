package com.utl.control.grupos;

import com.utl.control.materias.AlumnoMateria;

public class Alumno {
    
    public int matricula;
    public String nombre;
    public String clave;
    public int telefono;
    public int cuatrimestre;
    public String sexo;
    public AlumnoMateria[] materias;

    public Alumno(int matricula, String nombre, String clave, int telefono, int cuatrimestre, String sexo, AlumnoMateria[] materias) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.clave = clave;
        this.telefono = telefono;
        this.cuatrimestre = cuatrimestre;
        this.sexo = sexo;
        this.materias = materias;
    }

    public int consultarMatricula() { return matricula; }
    public String consultarNombre() { return nombre; }
    public String consultarClave() { return clave; }
    public int consultarTelefono() { return telefono; }
    public int consultarCuatrimestre() { return cuatrimestre; }
    public String consultarSexo() { return sexo; }
    public AlumnoMateria[] consultarMaterias() { return materias; }

}
