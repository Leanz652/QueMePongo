import static java.util.Objects.requireNonNull;

public class BorradorPrenda {
    TipoPrenda tipo;
    MaterialPrenda material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama = Trama.LISA;

    public BorradorPrenda(TipoPrenda tipo) {
        this.tipo = requireNonNull(tipo, "no puede ir nulo");
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
    void buildTrama(Trama trama) {
        if (trama == null) {
            this.trama = Trama.LISA;
        } else {this.trama = trama;}
    }


    private void validarPrenda() {
        if (material == null || colorPrincipal == null){
            throw new PrendaInvalidaException("Prenda invalida, indicar material/color principal");
        }
    }


    Prenda crearPrenda() {
        validarPrenda();
        return new Prenda(tipo,material,colorPrincipal,colorSecundario,trama);
    }
}
