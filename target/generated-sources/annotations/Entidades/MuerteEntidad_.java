package Entidades;

import Entidades.AstronautaEntidad;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-14T20:42:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(MuerteEntidad.class)
public class MuerteEntidad_ { 

    public static volatile SingularAttribute<MuerteEntidad, Calendar> fechaRegistro;
    public static volatile SingularAttribute<MuerteEntidad, AstronautaEntidad> astronauta;
    public static volatile SingularAttribute<MuerteEntidad, Long> id;

}