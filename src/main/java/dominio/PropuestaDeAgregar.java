package dominio;

import dominio.Guardarropa;
import dominio.Propuesta;
import prenda.Prenda;

public class PropuestaDeAgregar implements Propuesta {
  private Prenda prenda;
  private Guardarropa guardarropa;


  @Override
  public void aplicarEn(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(prenda);
  }
}
