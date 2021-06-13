package dominio;

import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

  List<Prenda> prendas = new ArrayList<>();
  List<Propuesta> propuestasTentativas = new ArrayList<>();

  public List<Prenda> getPrendas() {
    return prendas;
  }


  public void aceptarPropuesta(Propuesta propuesta)
  {
    quitarPropuesta(propuesta);
    propuesta.aplicarEn(this);
  }

  public void rechazarPropuesta(Propuesta propuesta)
  {
    quitarPropuesta(propuesta);
    propuesta.aplicarEn(this);
  }

  public void quitarPropuesta(Propuesta propuesta)
  {
    propuestasTentativas.remove(propuesta);
  }

  public void agregarPrenda(Prenda prenda)
  {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda)
  {
    prendas.remove(prenda);
  }

}
