package com.utl.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControlMySQL {

    private String usuario = "root";
    private String clave = "root";
    private String database = "sdu";

    private Connection connection = null;

    public ControlMySQL() throws SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + this.database, this.usuario, this.clave
        );

    }

    public Connection conseguir() { return this.connection; }

}
