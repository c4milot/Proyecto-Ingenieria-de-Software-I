public class Usuario{
    private int idUsuario;
    private string nombre;
    private string ubicacion;

    public void iniciarSolicitud(string ubicacion);
    public void seleccionarTipoRetiro(TipoRetiro tipoRetiro);
}

public class TipoRetiro{
    private string nombre;
    private string descripcion;
}

public class SolicitudRetiro{
    private int idSolicitud;
    private string ubicacion;

    public void registrar();
}

public class Sistema{
    public void recibirSolicitud(string ubicacion);
    public void validarUbicacion(string ubicacion);
    public void mostrarOpcionesRetiro();
    public void registrarSolicitud(string ubicacion, TipoRetiro tipo, Usuario usuario);
    public void mostrarConfirmacion();
}

public void API {
    public boolean validarUbicacion(string ubicacion){
        return true;
    }
}