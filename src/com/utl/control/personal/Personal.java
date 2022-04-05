package com.utl.control.personal;

import com.utl.control.materias.AlumnoMateria;

public abstract class Personal {

    private int matricula;
    private String nombre;
    private String clave;
    private int telefono;
    private String sexo;
    private String correo;

    public Personal() { }

    public Personal(int matricula, String nombre, String clave, int telefono, String sexo, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.clave = clave;
        this.telefono = telefono;
        this.sexo = sexo;
        this.correo = correo;
    }

    public void definirMatricula(int matricula) { this.matricula = matricula; }
    public void definirNombre(String nombre) { this.nombre = nombre; }
    public void definirTelefono(int telefono) { this.telefono = telefono; }
    public void definirSexo(String sexo) { this.sexo = sexo; }
    public void definirCorreo(String correo) { this.correo = correo; }

    public int consultarMatricula() { return matricula; }
    public String consultarNombre() { return nombre; }
    public String consultarClave() { return clave; }
    public int consultarTelefono() { return telefono; }
    public String consultarSexo() { return sexo; }
    public String consultarCorreo() { return correo; }

}
