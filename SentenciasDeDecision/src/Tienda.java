import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Eres miembro de la tienda(True/False): ");
        var miembro = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Cuanto gastaste: ");
        var dinero = Integer.parseInt(consola.nextLine());
        var porcentaje = 10;
        if (!miembro){
            porcentaje = 5;
        }

        var descuento = dinero/100*porcentaje;
        var total = dinero -descuento;

        if (miembro && dinero >= 1000){
            System.out.println("EL descuento es de " + descuento + " Y el total es de " + total);
        } else if (!miembro && dinero >= 1000) {
            System.out.println("EL descuento es de " + descuento + " Y el total es de " + total);
        }else {
            System.out.println("EL descuento es de " + descuento + " Y el total es de " + total);

        }


    }
}
