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
    @JoinColumn(name = "idAlumno", nullable  = false)
    private AstronautaEntidad astronautaEntidad;
    
    @ManyToOne (cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "idCurso", nullable  = false)
    private NaveEntidad naveEntidad;
    
    
}
