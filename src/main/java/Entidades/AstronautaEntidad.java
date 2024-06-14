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
            ;
    public AstronautaEntidad() {
    }
    
    
    
}
