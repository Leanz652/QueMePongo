public class Prenda {

  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;

  Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal){
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;


  }

  void setColorSecundario(Color color){
    this.colorSecundario = color;
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




