import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Evento {
   private String nombre;
   private LocalDate fecha;
   private int precio;
   private TipoEvento tipo;

   private ArrayList<Inscripcion> inscripciones;

    public Evento(String nombre, LocalDate fecha, int precio, TipoEvento tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.tipo = tipo;
        inscripciones=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return nombre.equals(evento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }

    public boolean InscribeAsistente(Asistente asistente){
        LocalDate hoy=LocalDate.now();
        Inscripcion inscripcion=new Inscripcion(hoy,asistente,this);
        inscripciones.add(inscripcion);
        asistente.addInscripcion(inscripcion);
        return true;
    }

    public Asistente[] getInscripciones(){

    }
}
