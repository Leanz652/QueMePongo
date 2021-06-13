package servicios;

public class ServicioMeteorologicoOtro implements ServicioMeteorologico{
  @Override
  public double getTemperatura() {
    return 0;
  }

  @Override
  public double getProbabilidadDePrecipitaciones() {
    return 0;
  }
}
