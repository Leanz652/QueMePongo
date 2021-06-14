package avisos;

import dominio.Usuarios;

import java.util.List;

public interface AvisosConfigurables {

  void notificarAUsuarioDeAlerta(List<Alerta> alerta, Usuarios usuario);

}
