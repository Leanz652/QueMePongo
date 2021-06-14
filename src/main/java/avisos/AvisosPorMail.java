package avisos;

import dominio.Usuarios;

import java.util.List;

public class AvisosPorMail implements AvisosConfigurables {
  MailSender sender;

  @Override
  public void notificarAUsuarioDeAlerta(List<Alerta> alerta, Usuarios usuario) {
    String MENSAJE_MAIL_ALERTAS = "Tenemos las siguientes alertas: "
        + alerta.get(0).name() + "," + alerta.get(1).name();
  sender.enviar(usuario.getMail(),MENSAJE_MAIL_ALERTAS);
  }
}
