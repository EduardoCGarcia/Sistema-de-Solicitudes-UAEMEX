package Modelos.Convocatorias;

import java.time.LocalTime;

/**
 *
 * @author EduardoCGarcia
 */
public class ConvocatoriaExtraordinaria {
    private LocalTime horaSesion;

    public ConvocatoriaExtraordinaria() {
    }

    public ConvocatoriaExtraordinaria(LocalTime horaSesion) {
        this.horaSesion = horaSesion;
    }

    public LocalTime getHoraSesion() {
        return horaSesion;
    }

    public void setHoraSesion(LocalTime horaSesion) {
        this.horaSesion = horaSesion;
    }
    
    
            
}
