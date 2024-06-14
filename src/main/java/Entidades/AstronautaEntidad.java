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
import javax.persistence.OneToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class AstronautaEntidad implements Serializable {

    @Id
    @Column (name = "idAstronauta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nombres",length = 30, nullable = false)
    private String nombres;
    
    @Column(name = "apellidoPaterno", length = 15, nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellidoMaterno", length = 15, nullable = true)
    private String apellidoMaterno;
    
    @Column(name = "tipoSangre", length = 5, nullable = false)
    private String tipoSangre;
    
    @Column(name = "pais", length = 20, nullable = false)
    private String pais;
    
    @Column(name = "edad", length = 2, nullable = false)
    private int edad;
    
    @Column(name = "sexo", length = 10, nullable = true)
    private String sexo;

    @OneToMany(mappedBy = "AstronautaEntidad", cascade = {CascadeType.PERSIST})
    private List<AstronautaNavesEntidad> naves;
    
    @OneToOne(mappedBy = "AstronautaEntidad", cascade = {CascadeType.PERSIST})
    private MuerteEntidad muerte;
            
    public AstronautaEntidad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<AstronautaNavesEntidad> getNaves() {
        return naves;
    }

    public void setNaves(List<AstronautaNavesEntidad> naves) {
        this.naves = naves;
    }

    public MuerteEntidad getMuerte() {
        return muerte;
    }

    public void setMuerte(MuerteEntidad muerte) {
        this.muerte = muerte;
    }

    @Override
    public String toString() {
        return "AstronautaEntidad{" + "id=" + id + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", tipoSangre=" + tipoSangre + ", pais=" + pais + ", edad=" + edad + ", sexo=" + sexo + ", naves=" + naves + ", muerte=" + muerte + '}';
    }
    
    
    
}
