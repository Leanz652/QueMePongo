package dominio;

import avisos.Alerta;
import avisos.AvisosConfigurables;
import prenda.Atuendo;
import servicios.Generador;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

  private Guardarropa guardarropa;
  private Generador generador;
  private Atuendo sugerenciaDiaria;
  private String mail;
  private List<AvisosConfigurables> avisosConfigurablesSubscriptos = new ArrayList<>();

  public String getMail() {
    return mail;
  }

  public Atuendo recibirSugerencia()
  {
    return generador.generarAtuendoParaTemperaturaActual(guardarropa.getPrendas());
  }

  public void recibirSugerenciaDiaria()
  {
    sugerenciaDiaria = generador.generarAtuendoParaTemperaturaActual(guardarropa.getPrendas());
  }

  public void actuarAnteAlertas(List<Alerta> alertas)
  {
  avisosConfigurablesSubscriptos.forEach(avisosConfigurables ->
      avisosConfigurables.notificarAUsuarioDeAlerta(alertas,this));
  }

}



