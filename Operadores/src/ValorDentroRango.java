import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro de rango ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un valor dentro del rango de 0 a 5: ");
        var valor = Integer.parseInt(consola.nextLine());

        if (valor >= 0 && valor <= 5) {
            System.out.println("Dentro del rango tu valor es: " + valor);
        }else {
            System.out.println("Fuera del rango");
        }
    }
}
