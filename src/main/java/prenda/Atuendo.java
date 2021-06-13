package prenda;

import excepciones.PrendaInvalidaException;


import java.util.Arrays;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class Atuendo {
  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  public Prenda prendaCalzado;
  public Prenda prendaAccesorio;

  private void validarPrenda() {
    if (prendaSuperior.getTipoPrenda().getCategoria() != CategoriaPrenda.SUPERIOR || prendaInferior.getTipoPrenda().getCategoria() != CategoriaPrenda.INFERIOR ||
        prendaCalzado.getTipoPrenda().getCategoria() != CategoriaPrenda.CALZADO || prendaAccesorio.getTipoPrenda().getCategoria() != CategoriaPrenda.ACCESORIOS)
    {
      throw new PrendaInvalidaException("El uniforme debe tener una prenda SUPERIOR, INFERIOR, CALZADO y ACCESORIO");
    }
  }

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado, Prenda prendaAccesorio)
  {
    this.prendaSuperior = requireNonNull(prendaSuperior, "Debe tener una prenda superior");
    this.prendaInferior = requireNonNull(prendaInferior, "Debe tener una prenda inferior");
    this.prendaCalzado = requireNonNull(prendaCalzado, "Debe tener una prenda de calzado");
    this.prendaAccesorio = requireNonNull(prendaAccesorio, "Debe tener una prenda accesorio");
    validarPrenda();
  }

  public List<Prenda> getPrendasAtuendo() {
    return Arrays.asList(prendaSuperior, prendaInferior, prendaCalzado, prendaAccesorio);
  }
}
