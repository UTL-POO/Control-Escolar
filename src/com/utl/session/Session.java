package com.utl.session;

import com.utl.control.grupos.Alumno;
import com.utl.control.materias.AlumnoMateria;
import com.utl.control.personal.Maestro;
import com.utl.control.personal.Personal;
import com.utl.database.ControlMySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Session {

    private int matricula;
    private Personal persona;

    private ControlMySQL connection;

    public Session(int matricula) throws SQLException {
        this.connection = new ControlMySQL();
        this.matricula = matricula;
    }

    public boolean validar() throws SQLException {
        ResultSet resultado = this.validarPersona();
        if (resultado == null) return false;

        this.cargar(resultado);
        return true;
    }

    public void cargar(ResultSet resultado) throws SQLException {
        try {
            if (resultado.getString("grupos") != null) {
                this.persona = new Maestro(
                        this.matricula,
                        resultado.getString("nombre"),
                        resultado.getString("clave"),
                        resultado.getInt("telefono"),
                        resultado.getString("sexo"),
                        resultado.getString("correo")
                );
                return;
            }
        } catch (SQLException sqlException) { }

        this.persona = new Alumno(
                this.matricula,
                resultado.getString("nombre"),
                resultado.getString("clave"),
                resultado.getInt("telefono"),
                resultado.getInt("semestre"),
                resultado.getString("sexo"),
                "",
                new AlumnoMateria[]{}
                );
    }

    public ResultSet validarPersona() throws SQLException {
        PreparedStatement statement = this.connection.conseguir().prepareStatement(
                "SELECT * FROM alumnos WHERE matricula=" + this.matricula
        );
        ResultSet resultado = statement.executeQuery();
        if (resultado.next()) return resultado;

        statement = this.connection.conseguir().prepareStatement(
                "SELECT * FROM maestros WHERE matricula=" + this.matricula
        );
        resultado = statement.executeQuery();
        if (resultado.next()) return resultado;

        return null;
    }

    public Personal conseguirPersona() { return this.persona; }

}
