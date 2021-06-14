package dominio;

import servicios.ServicioMeteorologico;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {

    private static final RepositorioUsuarios instance = new RepositorioUsuarios();

    private final List<Usuarios> listadoUsuarios = new ArrayList<>();

    private RepositorioUsuarios() {

    }

    public static RepositorioUsuarios getInstance() {
      return instance;
    }

    public void agregarUsuarios(Usuarios usuario) {
      this.listadoUsuarios.add(usuario);
    }

    public List<Usuarios> getUsuarios()
    {
      return listadoUsuarios;
    }

    public void vaciarListaUsuarios() {
      listadoUsuarios.clear();
    }

    public void actualizarSugerenciasDiarias()
    {
    listadoUsuarios.forEach(usuario -> usuario.recibirSugerenciaDiaria());
    }

    public void actualizarAlertasDeUsuarios(ServicioMeteorologico servicioMeteorologico)
    {
    listadoUsuarios.forEach(usuario -> usuario.actuarAnteAlertas(servicioMeteorologico.getAlertaMeteorologica()));
    }
}

