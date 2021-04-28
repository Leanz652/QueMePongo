import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testBorrador {

  @Test
  @DisplayName("Al instanciar un BorradorPrenda sin TipoPrenda, arroja una excepcion")
  void TipoPrendaNullArrojaNullPointerException() {
    Assertions.assertThrows(NullPointerException.class,
        () -> new BorradorPrenda(null));
  }

  @Test
  @DisplayName("Si no indico una trama, o la nulleo, por defecto es lisa")
  void tramaSinEspecificarEsLISA() {
    BorradorPrenda borradorTramaNull = borradorPrendaValidaSinTrama();
    borradorTramaNull.buildTrama(null);
    Prenda prendaLISA = borradorTramaNull.crearPrenda();

    assertEquals(borradorPrendaValidaSinTrama().crearPrenda().getTrama(), Trama.LISA);
    assertEquals(prendaLISA.getTrama(), Trama.LISA);

  }

  @Test
  @DisplayName("Si el borrador no tiene seteado el colorPrimario no puedo crear una prenda")
  void borradorSinColorPrimarioNoCreaPrenda() {

    assertThrows(PrendaInvalidaException.class, () -> borradorSinColorPrimario().crearPrenda());
  }

  @Test
  @DisplayName("Si el borrador no tiene seteado el Material no puedo crear una prenda")
  void borradorSinMaterialNoCreaPrenda() {

    assertThrows(PrendaInvalidaException.class, () -> borradorSinMaterial().crearPrenda());
  }


  private BorradorPrenda borradorPrendaValidaSinTrama() {
    BorradorPrenda prendaCreable = new BorradorPrenda(TipoPrenda.CAMISA);
    prendaCreable.buildColorPrincipal(new Color(1,2,3));
    prendaCreable.buildMaterial(MaterialPrenda.TELA);

    return prendaCreable;
  }

  private BorradorPrenda borradorSinColorPrimario() {
    BorradorPrenda sinColorPrimario = new BorradorPrenda(TipoPrenda.PANTALON);
    sinColorPrimario.buildMaterial(MaterialPrenda.TELA);

    return sinColorPrimario;
  }

  private BorradorPrenda borradorSinMaterial() {
    BorradorPrenda sinMaterial = new BorradorPrenda(TipoPrenda.CAMISA);
    sinMaterial.buildColorPrincipal(new Color(0,10,20));
    sinMaterial.buildColorPrincipal(new Color(20,30,50));

    return sinMaterial;
  }
}