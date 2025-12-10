public class Usuario {
    private int idUsuario;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Usuario(int id, String nombre, String direccion, String telefono, String email);

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getEmail() { return email; }
}

public class Recolector {
    private int idRecolector;
    private String nombre;
    private String rut;
    private String contacto;

    public Recolector(int id, String nombre, String rut, String contacto);
    
    public int getId() { return idRecolector; }
    public String getNombre() { return nombre; }
}
public class Coordinador {
    private int idCoordinador;
    private String nombre;
    private String cargo;

    public Coordinador(int id, String nombre, String cargo);
}

public class SolicitudRetiro {
    private int idSolicitud;
    private String direccion;
    private Date fechaCreacion;
    private String estado;     
    private String observaciones;

    private Usuario usuario;    
    private Zona zona;          
    private TipoRetiro tipo;    
    private RutaRecoleccion rutaAsignada; 

    public SolicitudRetiro(int id, String direccion, TipoRetiro tipo, Zona zona, Usuario usuario);

    public void setRutaAsignada(RutaRecoleccion ruta);

    public String getEstado() { return estado; }
}

public class RutaRecoleccion {
    private String codigoRuta;
    private Date fechaProgramada;
    private float cargaTotal;
    private String estadoRuta;
    
    private List<SolicitudRetiro> solicitudes; 
    private Recolector recolector;            
    private Coordinador coordinador;           

    public RutaRecoleccion(String codigo, Date fecha);

    public void agregarSolicitud(SolicitudRetiro sol);

    public void asignarRecolector(Recolector rec);

    private void recalcularCargaTotal();
}
