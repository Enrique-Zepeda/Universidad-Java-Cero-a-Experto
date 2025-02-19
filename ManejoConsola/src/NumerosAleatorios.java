import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros aleatorios ***");
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var random0Y9 = random.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9 = " + random0Y9);

        // Generar un numero aleatorio entre 1 y 10
        var random1Y10 = random.nextInt(10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10 = " + random1Y10);

        // Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular lanzamiento de un dado
        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);
    }
}
