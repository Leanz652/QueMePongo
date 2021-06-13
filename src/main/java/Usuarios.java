import prenda.Atuendo;
import prenda.Prenda;
import servicios.Generador;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

  private List<Prenda> prendas = new ArrayList<>();
  private Generador generador;

  public Atuendo recibirSugerencia()
  {
    return generador.generarAtuendoParaTemperaturaActual(prendas);
  }


}



