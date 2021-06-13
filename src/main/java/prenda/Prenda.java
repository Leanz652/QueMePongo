package prenda;

public class Prenda {
  TipoPrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama = Trama.LISA;
  double tmpMaxima;

  public Prenda(TipoPrenda tipo, MaterialPrenda material, Color colorPrincipal, Color colorSecundario,Trama trama, double tmpMaxima){
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.tmpMaxima = tmpMaxima;
  }

  public TipoPrenda getTipoPrenda() {
    return this.tipo;
  }

  public CategoriaPrenda getCategoria() {
    return this.tipo.getCategoria();
  }

  public MaterialPrenda getMaterial() {
    return this.material;
  }

  public Color getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Color getColorSecundario() {
    return this.colorSecundario;
  }

  public Trama getTrama() { return this.trama;}

  public double getTmpMaxima() { return this.tmpMaxima;}
}




