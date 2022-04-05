package com.utl.control.personal;

import com.utl.control.grupos.Grupo;

public class Maestro extends Personal {

    private Grupo[] grupos;

    public Maestro() { }

    public Maestro(int matricula, String nombre, String clave, int telefono, String sexo, String correo) {
        super(matricula, nombre, clave, telefono, sexo, correo);
    }

    public Grupo[] obtenerGrupos() { return this.grupos; }

}
