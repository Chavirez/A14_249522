package Entidades;

import Entidades.NaveEntidad;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-14T20:42:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ViajeEntidad.class)
public class ViajeEntidad_ { 

    public static volatile SingularAttribute<ViajeEntidad, NaveEntidad> naveEntidad;
    public static volatile SingularAttribute<ViajeEntidad, Integer> numPasajeros;
    public static volatile SingularAttribute<ViajeEntidad, Long> id;
    public static volatile SingularAttribute<ViajeEntidad, Calendar> fechaViaje;

}