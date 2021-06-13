package dominio;

import prenda.Atuendo;
import servicios.Generador;

public class Usuarios {

  private Guardarropa guardarropa;
  private Generador generador;

  public Atuendo recibirSugerencia()
  {
    return generador.generarAtuendoParaTemperaturaActual(guardarropa.getPrendas());
  }


}



