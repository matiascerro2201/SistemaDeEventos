import java.time.LocalDate;
import java.util.ArrayList;


public class SistemaEventos {
    private ArrayList<Evento> eventos;
    private ArrayList<Asistente> asistentes;

    public SistemaEventos() {
        eventos = new ArrayList<>();
        asistentes = new ArrayList<>();
    }

    public boolean creaEvento(String nombre, LocalDate fecha,
                              int precio, TipoEvento tipo) {
        Evento nuevoEvento=new Evento(nombre, fecha, precio, tipo);
        if(eventos.contains(nuevoEvento)){
            return false;
        }
        return eventos.add(nuevoEvento);
    }

    public boolean creaAsistente(String nombre, String email) {
        Asistente nuevoAsistente=new Asistente(nombre, email);
        if(asistentes.contains(nuevoAsistente)){
            return false;
        }
        return asistentes.add(nuevoAsistente);
    }

    public boolean inscribeAsistenteEnEvento(String nomAsistente, String nomEvento){
        Asistente asistenteABuscar=new Asistente(nomAsistente,"");
        int pos=asistentes.indexOf(asistenteABuscar);
        if(pos==-1){
            return false;
        }
        Asistente as=asistentes.get(pos);
        Evento ev=null;
        for (Evento evento : eventos) {
            if(evento.getNombre().equalsIgnoreCase(nomEvento)){
                ev=evento;
                break;
            }
        }
        if(ev==null){
            return false;
        }

        return ev.InscribeAsistente(as);
    }

    public String[][] listaEvento(){
        String[][] out=new String[0][0];
        return out;
    }


    public String[][] listaAsistentes(){
        String[][] out=new String[0][0];
        return out;
    }

    public String[][] listaAsistentesAEvento(){
        String[][] out=new String[0][0];
        return out;
    }
}
