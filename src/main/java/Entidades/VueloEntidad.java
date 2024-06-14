/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author santi
 */
@Entity
public class VueloEntidad implements Serializable {

    @Id
    @Column (name = "idVuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "numPasajeros", length = 5, nullable = false)
    private int numPasajeros;
    
    @Column (name = "fechaViaje", length = 100, nullable = false)
    private Calendar fechaViaje;
    
    
}
