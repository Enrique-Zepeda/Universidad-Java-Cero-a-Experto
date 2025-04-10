import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int random = (int)(Math.random() * 50 + 1);

        int opc = 0,contador = 0;
        while (random != opc){
            System.out.print("Ingresa el numero a adivinar(1-50):");
            opc = Integer.parseInt(consola.nextLine());
            contador++;
        }
        System.out.println("Adivinaste en " + contador + " intentos");
    }
}
