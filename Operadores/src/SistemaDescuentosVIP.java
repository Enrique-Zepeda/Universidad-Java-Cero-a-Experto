import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos ***");
        var consola  = new Scanner(System.in);
        System.out.print("Cuantos articulos compraste: ");
        var articulos = Integer.parseInt(consola.nextLine());
        System.out.print("Eres miebro de la tienda (true,false): ");
        var miembro = Boolean.parseBoolean(consola.nextLine());

        if (articulos >= 10 && miembro){
            System.out.println("Se aplica descuento");
        }else {
            System.out.println("No tienes decuento");
        }
    }
}
