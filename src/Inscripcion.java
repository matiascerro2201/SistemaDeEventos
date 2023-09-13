import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fechaInscripcion;

    private Asistente asistente;
    private Evento evento;

    public Inscripcion(LocalDate fechaInscripcion, Asistente asistente, Evento evento) {
        this.fechaInscripcion = fechaInscripcion;
        this.asistente = asistente;
        this.evento = evento;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public Evento getEvento() {
        return evento;
    }
}
