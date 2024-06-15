/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author santi
 */
@Entity
public class ViajeEntidad implements Serializable {

    @Id
    @Column (name = "idVuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "numPasajeros", length = 5, nullable = false)
    private int numPasajeros;
    
    @Column (name = "fechaViaje", length = 6, nullable = false)
    private Calendar fechaViaje;
    
    @ManyToOne (cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "idNave", nullable  = false)
    private NaveEntidad naveEntidad;

    public ViajeEntidad() {
    }

    public ViajeEntidad(int numPasajeros, Calendar fechaViaje) {
        this.numPasajeros = numPasajeros;
        this.fechaViaje = fechaViaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Calendar getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Calendar fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public NaveEntidad getNaveEntidad() {
        return naveEntidad;
    }

    public void setNaveEntidad(NaveEntidad naveEntidad) {
        this.naveEntidad = naveEntidad;
    }

    @Override
    public String toString() {
        return "VueloEntidad{" + "id=" + id + ", numPasajeros=" + numPasajeros + ", fechaViaje=" + fechaViaje + ", naveEntidad=" + naveEntidad + '}';
    }
    
}
