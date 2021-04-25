public enum MaterialPrenda {
  TELA {
            Trama trama = Trama.LISA;
    @Override
    public Trama getTrama() {return this.trama;}
    public void setTrama(Trama trama) { this.trama = trama;}
          },
  NAYLON {
            Trama trama = Trama.LISA;
    @Override
    public Trama getTrama() {return this.trama;}
    public void setTrama(Trama trama) { this.trama = trama;}},

  PIEDRA {
            Trama trama = Trama.LISA;
    @Override
    public Trama getTrama() {return this.trama;}
    public void setTrama(Trama trama) { this.trama = trama;}
  };

  public abstract Trama getTrama();
  public abstract void setTrama(Trama trama);
}
