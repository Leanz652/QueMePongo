public class BuilderPrenda {
    TipoPrenda tipo;
    MaterialPrenda material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama = Trama.LISA;

    public BuilderPrenda(TipoPrenda tipo) {
        this.tipo = tipo;
    }

    void buildMaterial(MaterialPrenda material) {
        this.material = material;
    }
    void buildColorPrincipal(Color color) {
        this.colorPrincipal = color;
    }
    void buildColorSecundario(Color color) {
        this.colorSecundario = color;
    }
    void buildTrama(Trama trama) {this.trama = trama;}

    Prenda crearPrenda() {
        if (tipo != null || material != null || colorPrincipal != null) {
        Prenda prenda = new Prenda(tipo,material,colorPrincipal,colorSecundario);
        return prenda;
    }
    }
}
