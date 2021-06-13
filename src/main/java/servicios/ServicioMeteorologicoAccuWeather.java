package servicios;

import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico
{
  private AccuWeatherAPI api;
  private String direccion = "Buenos Aires, Argentina";

  @Override
  public double getTemperatura() {
    Map<String, Object> temperatura = (Map<String, Object>) consultarApi().get("Temperature");
    return temperatura.get("Unit").equals("F") ? (double) temperatura.get("Value") * 5/8 : (double) temperatura.get("Value");
  }

  @Override
  public double getProbabilidadDePrecipitaciones() {
    return (double) consultarApi().get("PrecipitationProbability");
  }

  private Map<String, Object> consultarApi()
  {
    return api.getWeather(direccion).get(0);
  }



}
