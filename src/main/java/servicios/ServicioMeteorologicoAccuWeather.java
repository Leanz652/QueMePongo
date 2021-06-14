package servicios;

import avisos.Alerta;

import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico
{
  private AccuWeatherAPI api = new AccuWeatherAPI();
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

  @Override
  public List<Alerta> getAlertaMeteorologica() {
   return api.getAlertas(direccion);
  }

  private Map<String, Object> consultarApi()
  {
    return api.getWeather(direccion).get(0);
  }

}
