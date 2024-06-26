/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.AstronautaEntidad;
import Entidades.AstronautaNavesEntidad;
import Entidades.MuerteEntidad;
import Entidades.NaveEntidad;
import Entidades.ViajeEntidad;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author santi
 */
public class AstronautaDAO {

    public AstronautaDAO() {
    }
    
    public void guardar(){
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("conexionAstronauta");
    EntityManager entityManager = managerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    
    AstronautaEntidad romina = new  AstronautaEntidad("Romina", "Meza", "Galindo", "O+", "México", 20, "Femenino");
    AstronautaEntidad santiago = new  AstronautaEntidad("Santiago", "Sánchez", "Chavira", "A+", "México", 21, "Masculino");
    MuerteEntidad muerte = new MuerteEntidad(Calendar.getInstance());
    
    Calendar va1 = Calendar.getInstance();
    
    NaveEntidad nave = new NaveEntidad("Magnum", "Transparente", "Zimbabwe", 54, 100);
    
    ViajeEntidad v1 = new ViajeEntidad(52, va1);
    
    Calendar va2 = new GregorianCalendar(2024, Calendar.JUNE, 16, 8, 15, 45);
    
    ViajeEntidad v2 = new ViajeEntidad(42, va2);    
    
    Calendar va3 = new GregorianCalendar(2025, Calendar.MAY, 11, 21, 0, 0);
    
    ViajeEntidad v3 = new ViajeEntidad(52, va3);
    
    Calendar va4 = new GregorianCalendar(2025, Calendar.JANUARY, 01, 01, 01, 01);
    
    ViajeEntidad v4 = new ViajeEntidad(52, va4);
    
    Calendar va5 = new GregorianCalendar(2025, Calendar.FEBRUARY, 28, 23, 59, 59);
    
    ViajeEntidad v5 = new ViajeEntidad(52, va5);    
    
    v1.setNaveEntidad(nave);
    v2.setNaveEntidad(nave);
    v3.setNaveEntidad(nave);
    v4.setNaveEntidad(nave);
    v5.setNaveEntidad(nave);    
    
    AstronautaNavesEntidad an1 = new AstronautaNavesEntidad(santiago, nave);
    AstronautaNavesEntidad an2 = new AstronautaNavesEntidad(romina, nave);
    
    List<AstronautaNavesEntidad> naves = new ArrayList<>();
    List<ViajeEntidad> viajes = new ArrayList<>();
    
    viajes.add(v1);
    viajes.add(v2);
    viajes.add(v3);
    viajes.add(v4);
    viajes.add(v5);
    
    naves.add(an1);
    naves.add(an2);
    
    muerte.setAlumno(santiago);
    santiago.setMuerte(muerte);
    santiago.setNaves(naves);
    romina.setNaves(naves);
    
    nave.setTripulacion(naves);
    nave.setVuelos(viajes);
    
    entityManager.persist(santiago);
    entityManager.getTransaction().commit();
    entityManager.close();
    managerFactory.close();
        
    }
    
    public void leer(){
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("conexionAstronauta");
 
        EntityManager entityManager = managerFactory.createEntityManager();

        String nombreUno = "Romina";
        String nombreDos = "Santiago";
        String nombreNave = "Magnum";

        TypedQuery<Object[]> query = entityManager.createQuery(
            "SELECT a1.nombres, a2.nombres, n.nombre, n.numPasajeros, v.fechaViaje, a2.nombres, m.fechaRegistro " +
            "FROM AstronautaEntidad a1 " +
            "JOIN a1.naves ne " +
            "JOIN ne.naveEntidad n " +
            "JOIN n.vuelos v " +
            "JOIN n.tripulacion t " + 
            "JOIN t.astronautaEntidad a2 " +
            "JOIN a2.muerte m " +
            "WHERE v.fechaViaje = m.fechaRegistro AND a1.nombres != a2.nombres", Object[].class);

        List<Object[]> result = query.getResultList();
        


        for (Object[] row : result) {
            String astronautaUnoNombre = (String) row[0];
            String astronautaDosNombre = (String) row[1];
            String naveNombre = (String) row[2];
            int capacidadPasajeros = (Integer) row[3];
            Calendar fechaHoraSalida = (Calendar) row[4];
            Date d1 = fechaHoraSalida.getTime();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String fechaHoraSalidaD = sdf1.format(d1);            
            String astronautaMuerteNombre = (String) row[5];
            Calendar fechaHoraMuerte = (Calendar) row[6];
            Date d2 = fechaHoraSalida.getTime();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String fechaHoraMuerteD = sdf2.format(d2);              

            System.out.println("Los astronautas: " + astronautaUnoNombre + " y " + astronautaDosNombre +
                " fueron muy valientes debido a que se subieron a la " + naveNombre +
                " que tiene la capacidad de " + capacidadPasajeros +
                " pasajeros haciendo un vuelo el " + fechaHoraSalidaD +
                " y lamentablemente perdió la vida " + astronautaMuerteNombre +
                " en la fecha de " + fechaHoraMuerteD);
        }

        entityManager.close();
        managerFactory.close();     
        
    }
    
}
