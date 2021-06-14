package prenda;

import java.util.ArrayList;
import java.util.List;

public class RepoBorradores {
  private List<BorradorPrenda> borradoresIncompletos = new ArrayList<>();

  public RepoBorradores(){
  }

  public void agregarBorradorIncompleto(BorradorPrenda borrador) {
    borradoresIncompletos.add(borrador);
  }

  public List<BorradorPrenda> getBorradoresIncompletos() {
    return borradoresIncompletos;
  }

}
