package prenda;

import excepciones.PrendaInvalidaException;
import static java.util.Objects.requireNonNull;

public class BorradorPrenda {
    TipoPrenda tipo;
    MaterialPrenda material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama = Trama.LISA;
    double tmpMaxima;

    public BorradorPrenda(TipoPrenda tipo) {
        this.tipo = requireNonNull(tipo, "no puede ir nulo");
    }

    public void buildMaterial(MaterialPrenda material) {
        this.material = material;
    }
    public void buildColorPrincipal(Color color) {
        this.colorPrincipal = color;
    }
    void buildColorSecundario(Color color) {
        this.colorSecundario = color;
    }
    public void buildTrama(Trama trama) {
        if (trama == null) {
            this.trama = Trama.LISA;
        } else {this.trama = trama;}
    }

    public void buildTmpMaxima(double tmpMaxima){ this.tmpMaxima = tmpMaxima;}

    private void validarPrenda() {
        if (material == null || colorPrincipal == null){
            throw new PrendaInvalidaException("prenda.Prenda invalida, indicar material/color principal");
        }
    }

    public Prenda crearPrenda() {
        validarPrenda();
        return new Prenda(tipo,material,colorPrincipal,colorSecundario,trama,tmpMaxima);
    }
}
