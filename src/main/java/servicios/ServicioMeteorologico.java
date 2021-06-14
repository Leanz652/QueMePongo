package servicios;

import avisos.Alerta;

import java.util.ArrayList;
import java.util.List;

public interface ServicioMeteorologico {

   double getTemperatura();
   double getProbabilidadDePrecipitaciones();
   List<Alerta> getAlertaMeteorologica();

}
