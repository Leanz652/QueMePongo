import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prenda.Atuendo;
import prenda.CategoriaPrenda;
import prenda.Prenda;
import prenda.TipoPrenda;
import servicios.*;

import java.util.Arrays;
import java.util.List;


public class TestSugerencias {

  // setup
  ServicioMeteorologicoAccuWeather servAccuWeatherMock = mock(ServicioMeteorologicoAccuWeather.class);
  Generador generadorSugerencias = new Generador(servAccuWeatherMock);

  // prendas fixture
  Prenda remera = generarPrenda(TipoPrenda.CAMISA, 40.0);
  Prenda remeraMangaLarga = generarPrenda(TipoPrenda.CAMISA, 20.0);
  Prenda cortoDeportivo = generarPrenda(TipoPrenda.PANTALON, 40.0);
  Prenda pantalon = generarPrenda(TipoPrenda.PANTALON, 20.0);
  Prenda ojotas = generarPrenda(TipoPrenda.ZAPATO, 40.0);
  Prenda pantuflas = generarPrenda(TipoPrenda.ZAPATO, 20.0);
  Prenda gafas = generarPrenda(TipoPrenda.JOYA, 20.0);
  Prenda gafasDeOro = generarPrenda(TipoPrenda.JOYA, 20.0);

  List<Prenda> guardarropa = Arrays.asList(remera,remeraMangaLarga,
      cortoDeportivo,pantalon,ojotas,pantuflas,gafas,gafasDeOro);


  @DisplayName("Genero sugerencia con prendas aptas para la temperatura indicada")
  @Test
  void sugerenciasConPrendasQueCumplenTemperaturaMaxima30C() {

    when(servAccuWeatherMock.getTemperatura()).thenReturn(30.0);
    Atuendo sugerencia = generadorSugerencias.generarAtuendoParaTemperaturaActual(guardarropa);
    Assertions.assertTrue(sugerencia.getPrendasAtuendo().stream()
        .allMatch(prenda -> prenda.getTmpMaxima() <= servAccuWeatherMock.getTemperatura()));
  }

  private Prenda generarPrenda(TipoPrenda tipoPrenda, Double tempMax) {
    return new Prenda(tipoPrenda,null,null,null,null,tempMax);
  }
}