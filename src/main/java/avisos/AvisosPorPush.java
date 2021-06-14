package avisos;

import dominio.Usuarios;

import java.util.List;

public class AvisosPorPush implements AvisosConfigurables {
  NotificationService notificationService;

  @Override
  public void notificarAUsuarioDeAlerta(List<Alerta> alerta, Usuarios usuario) {
    String MENSAJE_TORMENTA = "Sali con paraguas";
    String MENSAJE_GRANIZO = "No salgas en auto";
    if (alerta.contains(Alerta.TORMENTA))
    {
    notificationService.notify(MENSAJE_TORMENTA);
    } else if (alerta.contains(Alerta.GRANIZO))
    {
      notificationService.notify(MENSAJE_GRANIZO);
    }
  }
}
