/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



public class MuerteEntidad implements Serializable {

    @Id
    @Column (name = "idMuerte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "fechaRegistro", length = 100, nullable = false)
    private Calendar fechaRegistro;
    
    @OneToOne (cascade = {CascadeType.REMOVE})
    
    @JoinColumn(name = "idAstronauta", nullable = false)
    private AstronautaEntidad alumno;    

    public MuerteEntidad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public AstronautaEntidad getAlumno() {
        return alumno;
    }

    public void setAlumno(AstronautaEntidad alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "MuertesEntidad{" + "id=" + id + ", fechaRegistro=" + fechaRegistro + ", alumno=" + alumno + '}';
    }
    
}
