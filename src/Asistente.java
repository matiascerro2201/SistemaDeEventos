import java.util.ArrayList;
import java.util.Objects;

public class Asistente {
    private String nombre;
    private String email;

    private ArrayList<Inscripcion> inscripciones;

    public Asistente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        inscripciones=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asistente)) return false;
        Asistente asistente = (Asistente) o;
        return nombre.equals(asistente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public void addInscripcion(Inscripcion inscripcion){
        inscripciones.add(inscripcion);

    }

    public Inscripcion[] getInscripciones(){
        return inscripciones.toArray(new Inscripcion[0]);
    }
}
