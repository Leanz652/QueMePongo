public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;

  Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal, Color colorSecundario){
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  TipoPrenda getTipoPrenda() {
    return this.tipo;
  }

  CategoriaPrenda getCategoria() {
    return this.tipo.getCategoria();
  }

  MaterialPrenda getMaterial() {
    return this.material;
  }

  Color getColorPrincipal() {
    return this.colorPrincipal;
  }

  Color getColorSecundario() {
    return this.colorSecundario;
  }
}




