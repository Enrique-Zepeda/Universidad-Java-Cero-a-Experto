import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo Libros ***");
        var consola = new Scanner(System.in);
        System.out.print("Tienes credencia de la escuela(true,false): ");
        var hasCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("A cuantos Km de distancia vives: ");
        var km = Integer.parseInt(consola.nextLine());

        if (km <= 3 || hasCredencial) {
            System.out.println("Cumple");
        }
    }

}
