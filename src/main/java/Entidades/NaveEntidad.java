/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Administrator
 */
@Entity
public class NaveEntidad implements Serializable {

    @Id
    @Column (name = "idNave")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nombre",length = 30, nullable = false)
    private String nombre;
    
    @Column(name = "color", length = 15, nullable = false)
    private String color;
    
    @Column(name = "pais", length = 20, nullable = false)
    private String pais;
    
    @Column(name = "numPasajeros", length = 2, nullable = false)
    private int numPasajeros;
    
    @Column(name = "Tamaño", length = 50, nullable = false)
    private long tamaño;
    
    @OneToMany(mappedBy = "NaveEntidad", cascade = {CascadeType.PERSIST})
    private List<AstronautaNavesEntidad> tripulacion;  
   
    @OneToMany(mappedBy = "NaveEntidad", cascade = {CascadeType.PERSIST})
    private List<ViajeEntidad> vuelos;

    public NaveEntidad() {
    }

    public NaveEntidad(String nombre, String color, String pais, int numPasajeros, long tamaño) {
        this.nombre = nombre;
        this.color = color;
        this.pais = pais;
        this.numPasajeros = numPasajeros;
        this.tamaño = tamaño;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public List<AstronautaNavesEntidad> getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(List<AstronautaNavesEntidad> tripulacion) {
        this.tripulacion = tripulacion;
    }

    public List<ViajeEntidad> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<ViajeEntidad> vuelos) {
        this.vuelos = vuelos;
    }

    @Override
    public String toString() {
        return "NaveEntidad{" + "id=" + id + ", nombre=" + nombre + ", color=" + color + ", pais=" + pais + ", numPasajeros=" + numPasajeros + ", tama\u00f1o=" + tamaño + ", tripulacion=" + tripulacion + ", vuelos=" + vuelos + '}';
    }
    
    

  
    
}
