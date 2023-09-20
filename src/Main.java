import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static SistemaEventos sistema = new SistemaEventos();
    private static Scanner tcld = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Sistema de eventos");
    }
    private static void creaEvento(){
        String nombre, fechaString;
        LocalDate fecha;
        int precio, op, dia, mes, año;
        TipoEvento tipo = null;
        System.out.println("Ingrese nombre evento:");
        nombre = tcld.next();
        System.out.println("Ingrese fecha(dd/mm/yyyy)");
        fechaString = tcld.next();
        String [] partesFecha = fechaString.split("/");
        dia = Integer.parseInt(partesFecha[0]);
        mes = Integer.parseInt(partesFecha[1]);
        año = Integer.parseInt(partesFecha[2]);
        fecha = LocalDate.of(año, mes, dia);
        System.out.println("Ingrese precio del evento: ");
        precio = tcld.nextInt();
        System.out.println("Seleccione tipo: ");
        System.out.println("1) Charla ");
        System.out.println("2) Seminario ");
        System.out.println("3) Congreso ");
        op = tcld.nextInt();
        switch(op){
            case 1: tipo = TipoEvento.CHARLA; break;
            case 2: tipo = TipoEvento.SEMINARIO; break;
            case 3: tipo = TipoEvento.CONGRESO;
        }
        sistema.creaEvento(nombre, fecha, precio, tipo);
    }
    private static void creaAsistente(){
        String nombre;
        String email;
        System.out.println("Ingrese nombre:");
        nombre = tcld.next();
        System.out.println("Ingrese email: ");
        email = tcld.next();
        sistema.creaAsistente(nombre, email);
    }
    private static void inscribeEvento(){
        String nombreAsistente, nombreEvento;
        System.out.println("Ingrese nombre asistente:");
        nombreAsistente=tcld.next();
        System.out.println("Ingrese nombre evento:");
        nombreEvento = tcld.next();
        sistema.inscribeAsistenteEnEvento(nombreAsistente, nombreEvento);
    }

}
