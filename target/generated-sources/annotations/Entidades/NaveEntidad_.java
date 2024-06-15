package Entidades;

import Entidades.AstronautaNavesEntidad;
import Entidades.ViajeEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-14T20:42:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(NaveEntidad.class)
public class NaveEntidad_ { 

    public static volatile SingularAttribute<NaveEntidad, Long> tamaño;
    public static volatile SingularAttribute<NaveEntidad, String> color;
    public static volatile ListAttribute<NaveEntidad, ViajeEntidad> vuelos;
    public static volatile SingularAttribute<NaveEntidad, Integer> numPasajeros;
    public static volatile SingularAttribute<NaveEntidad, Long> id;
    public static volatile SingularAttribute<NaveEntidad, String> nombre;
    public static volatile ListAttribute<NaveEntidad, AstronautaNavesEntidad> tripulacion;
    public static volatile SingularAttribute<NaveEntidad, String> pais;

}