import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("Dibuja un triangulo");
        var consola = new Scanner(System.in);
        System.out.println("Prporciona el numero de filas: ");
        int numeroFilas = consola.nextInt();

        //Iterar sobre cada fila del triangulo
        for (int fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlancos = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlancos + asteriscos);
        }
    }
}
