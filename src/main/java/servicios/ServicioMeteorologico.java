package servicios;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public interface ServicioMeteorologico {

   double getTemperatura();
   double getProbabilidadDePrecipitaciones();
}
