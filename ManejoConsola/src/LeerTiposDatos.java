import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        // Leer tipo entero
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //Leer tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
    //Consumimos el caracter de salto de linea
        consola.nextLine(); // se usa asi depues de usar numero y antes de leer una linea completa String

//        Leer tipo string despues de numeros
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("nombre = " + nombre);
        System.out.println();

        //Leer tipos de valores enteros y double sin nextDouble ni nextInt
        System.out.print("Ingresa un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //Tipo flotante
        System.out.print("Ingresa un valor flotante: ");
        var floatString = Float.parseFloat(consola.nextLine());
        System.out.println("floatString = " + floatString);

//        Mas metodos
//        Double.parseDouble();
//        Boolean.parseBoolean();
    }
}
