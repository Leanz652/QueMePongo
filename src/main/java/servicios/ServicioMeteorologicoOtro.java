package servicios;

import avisos.Alerta;

import java.util.List;

public class ServicioMeteorologicoOtro implements ServicioMeteorologico{
  @Override
  public double getTemperatura() {
    return 0;
  }

  @Override
  public double getProbabilidadDePrecipitaciones() {
    return 0;
  }

  @Override
  public List<Alerta> getAlertaMeteorologica() {
    return null;
  }
}
