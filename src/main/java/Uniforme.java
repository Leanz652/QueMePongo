import static java.util.Objects.requireNonNull;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;

  private void validarPrenda() {
    if (prendaSuperior.tipo.getCategoria() != CategoriaPrenda.SUPERIOR || prendaInferior.tipo.getCategoria() != CategoriaPrenda.INFERIOR ||
        prendaCalzado.tipo.getCategoria() != CategoriaPrenda.CALZADO){
      throw new PrendaInvalidaException("El uniforme debe tener una prenda SUPERIOR, INFERIOR y CALZADO");
    }
  }

  Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado)
  {
    validarPrenda();
    this.prendaSuperior = requireNonNull(prendaSuperior, "Debe tener una prenda superior");
    this.prendaInferior = requireNonNull(prendaInferior, "Debe tener una prenda inferior");
    this.prendaCalzado = requireNonNull(prendaCalzado, "Debe tener una prenda de calzado");
  }
}
