import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueMePongo {

  @Test
  void laCategoriaDeUnZAPATOesCALZADO() {
    assertEquals(prendaDeTelaYColorPrimario(TipoPrenda.ZAPATO).getCategoria(), CategoriaPrenda.CALZADO);
  }
  @Test
  void laCategoriaDeUnPANTALONesPARTE_INFERIOR() {
    assertEquals(prendaDeTelaYColorPrimario(TipoPrenda.PANTALON).getCategoria(), CategoriaPrenda.INFERIOR);
  }
  @Test
  void laCategoriaDeUnaCAMISAesPARTE_SUPERIOR() {
    assertEquals(prendaDeTelaYColorPrimario(TipoPrenda.CAMISA).getCategoria(), CategoriaPrenda.SUPERIOR);
  }

  public Prenda prendaDeTelaYColorPrimario(TipoPrenda tipo) {
    return (new Prenda(tipo,MaterialPrenda.TELA,new Color(15,15,15)));
  }

}