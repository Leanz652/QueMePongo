package dominio;

import dominio.Guardarropa;
import dominio.Propuesta;
import prenda.Prenda;

public class PropuestaDeQuitar implements Propuesta {
  private Prenda prenda;
  private Guardarropa guardarropa;


  @Override
  public void aplicarEn(Guardarropa guardarropa) {
    guardarropa.quitarPrenda(prenda);
  }
}
