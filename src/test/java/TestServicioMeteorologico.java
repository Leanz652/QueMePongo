import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import servicios.ServicioMeteorologico;
import servicios.ServicioMeteorologicoAccuWeather;

import static org.mockito.Mockito.*;

public class TestServicioMeteorologico {

  ServicioMeteorologicoAccuWeather mockAccuWeather = mock(ServicioMeteorologicoAccuWeather.class);


  @DisplayName("Servicio AccuWeather devuelve 14 grados y 0 de probabilidadDePrecipitaciones ")
  @Test
  void servicioAccuWeatherDevuelveCondicionesClimaticas() {
    when(mockAccuWeather.getTemperatura()).thenReturn(10.00);
    when(mockAccuWeather.getProbabilidadDePrecipitaciones()).thenReturn(5.00);
    Assertions.assertEquals(5,mockAccuWeather.getProbabilidadDePrecipitaciones());
    Assertions.assertEquals(10,mockAccuWeather.getTemperatura());

  }

}