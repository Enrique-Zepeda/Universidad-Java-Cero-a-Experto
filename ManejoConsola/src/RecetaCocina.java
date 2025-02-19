import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("Receta Cocina");

        var consola = new Scanner(System.in);

        System.out.print("Nombre de la receta: ");
        var receta = consola.nextLine();
        System.out.print("Ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Tiempo: ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("--- Recta de Cocina ---");
        System.out.println("Nombre de la receta: " + receta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempo);
        System.out.println("Dificultad = " + dificultad);
    }
}
