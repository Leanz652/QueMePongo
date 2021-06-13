package servicios;

import prenda.CategoriaPrenda;
import prenda.Prenda;
import prenda.Atuendo;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Generador {

  private ServicioMeteorologico servicioMeteorologico;
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;
  Prenda prendaAccesorio;

  public Generador(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo generarAtuendoParaTemperaturaActual(List<Prenda> prendas){
  double temperatura = servicioMeteorologico.getTemperatura();
  List<Prenda> prendasTempOk = getListaPrendaTemperaturaCorrecta(prendas,temperatura);
  prendaSuperior = getPrendaRandom(getListaPrendaCategoriaCorrecta(prendasTempOk,CategoriaPrenda.SUPERIOR));
  prendaInferior = getPrendaRandom(getListaPrendaCategoriaCorrecta(prendasTempOk,CategoriaPrenda.INFERIOR));
  prendaCalzado = getPrendaRandom(getListaPrendaCategoriaCorrecta(prendasTempOk,CategoriaPrenda.CALZADO));
  prendaAccesorio = getPrendaRandom(getListaPrendaCategoriaCorrecta(prendasTempOk,CategoriaPrenda.ACCESORIOS));

  return new Atuendo(prendaSuperior,prendaInferior,prendaCalzado,prendaAccesorio);
}

private Prenda getPrendaRandom (List<Prenda> prendas)
{
  return prendas.get(new Random().nextInt(prendas.size()));
}

public List<Prenda> getListaPrendaTemperaturaCorrecta(List <Prenda> prendas, double temperatura)
{
  return prendas.stream().filter(prenda -> prenda.getTmpMaxima()<=temperatura).collect(Collectors.toList());
}

public List<Prenda> getListaPrendaCategoriaCorrecta(List <Prenda> prendas, CategoriaPrenda categoria)
  {
    return prendas.stream().filter(prenda -> prenda.getCategoria() == categoria).collect(Collectors.toList());
  }
}
