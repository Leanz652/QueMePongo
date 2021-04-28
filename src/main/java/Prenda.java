public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama = Trama.LISA;

  Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal, Color colorSecundario,Trama trama){
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
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

  Trama getTrama() { return this.trama;}
}




