package com.utl.control.materias;

import com.utl.control.instalacion.Salon;
import com.utl.control.personal.Maestro;

public class AlumnoMateria extends Materia {

    public Maestro maestro;
    public float calificacion;
    public Salon salon;

    public Maestro consultarMaestro() { return this.maestro; }
    public float consultarCalificacion() { return this.calificacion; }
    public Salon consultarSalon() { return this.salon; }

}
