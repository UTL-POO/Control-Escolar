package com.utl.control.personal;

public class Maestro {

    //ATRIBUTOS CLASE MAESTRO
    private int matricula; //matricula del profesor
    private String nombre; //nombre del profesor
    private String sexo;  //género del profesor
    private String clave; //clave del profesor
    private int telefono; //télefono del profesor
    private String correo; //correo electronico del profesor

    public Maestro(int matricula, String nombre, String sexo, String clave, int telefono, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.clave = clave;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int consultarMatricula() { return this.matricula; }
    public String consultarNombre() { return this.nombre; }
    public String consultarSexo() { return this.sexo; }
    public String consultarClave() { return this.clave; }
    public int consultarTelefono() { return this.telefono; }
    public String consultarCorreo() { return this.correo; }

}
