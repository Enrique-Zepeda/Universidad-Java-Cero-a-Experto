import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //Arreglos
        // 1. Declarar arreglo
        int[] enteros;
        // 2. Inicializar el arreglo
        enteros = new int[3];

        // Declarar y inicializar el arreglo en una sola fila
        int[] numeros = new int[2];
        var numeros1 = new int[4];
        
        // Agregar valores
        var enteros1 = new int[5];
        enteros1[0] = 5;
        enteros1[1] = 52;
        enteros1[2] = 54;
        enteros1[3] = 15;
        
        //Imprimir valor
        System.out.println("enteros1[0] = " + enteros1[0]);
        
        // Imprimir arreglo
        System.out.println("enteros1 = " + Arrays.toString(enteros1));

        // Definir arreglo con valores
        int[] enteros2 = {100,200,300,400,500};
        // Definir con var
        var enteros3 = new int[]{100,200,300,400,500};

        System.out.println(enteros2[3]);
        System.out.println("enteros3 = " + Arrays.toString(enteros3));

        // Iterar elemntos de un arreglo
        for (int i = 0; i < enteros2.length; i++) {
            System.out.println("enteros2 en el indice " + i + " = "+ enteros2[i]);

        }

        // Introducir valores de manera dinamica a un arreglo
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el largo del arreglo: ");
        int largo = consola.nextInt();
        int[] arreglo = new int[largo];
        // Solicitar los valores del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa los numeros del arreglo");
            var numero = consola.nextInt();
            arreglo[i] = numero;
        }
        System.out.println("Arrays.toString(arreglo) = " + Arrays.toString(arreglo));
    }
}
