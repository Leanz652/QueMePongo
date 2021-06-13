package prenda;

public enum TipoPrenda {
  ZAPATO
      {
        @Override
        public CategoriaPrenda getCategoria(){return CategoriaPrenda.CALZADO;}
      },
  CAMISA
      {
        @Override
        public CategoriaPrenda getCategoria(){return CategoriaPrenda.SUPERIOR;}
      },
  PANTALON
      {
        @Override
        public CategoriaPrenda getCategoria(){return CategoriaPrenda.INFERIOR;}
      },
  JOYA
      {
        @Override
        public CategoriaPrenda getCategoria(){return CategoriaPrenda.ACCESORIOS;}
      };

  public abstract CategoriaPrenda getCategoria();
}