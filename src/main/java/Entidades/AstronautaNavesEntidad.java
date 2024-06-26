/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class AstronautaNavesEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne (cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "idAstronauta", nullable  = false)
    private AstronautaEntidad astronautaEntidad;
    
    @ManyToOne (cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "idNave", nullable  = false)
    private NaveEntidad naveEntidad;

    public AstronautaNavesEntidad() {
    }

    public AstronautaNavesEntidad(AstronautaEntidad astronautaEntidad, NaveEntidad naveEntidad) {
        this.astronautaEntidad = astronautaEntidad;
        this.naveEntidad = naveEntidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AstronautaEntidad getAstronautaEntidad() {
        return astronautaEntidad;
    }

    public void setAstronautaEntidad(AstronautaEntidad astronautaEntidad) {
        this.astronautaEntidad = astronautaEntidad;
    }

    public NaveEntidad getNaveEntidad() {
        return naveEntidad;
    }

    public void setNaveEntidad(NaveEntidad naveEntidad) {
        this.naveEntidad = naveEntidad;
    } 

    @Override
    public String toString() {
        return "AstronautaNavesEntidad{" + "id=" + id + ", astronautaEntidad=" + astronautaEntidad + ", naveEntidad=" + naveEntidad + '}';
    }


    
}
