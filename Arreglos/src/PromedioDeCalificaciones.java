import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int promedio = 0;
        
        System.out.print("Ingresa cuantas calificaciones deseas agregar: ");
        int materias = consola.nextInt();
        int[] calificaciones = new int[materias];

        for (int i = 0; i < materias; i++) {
            System.out.print("Ingresa una calificacion: ");
            int cal = consola.nextInt();
            calificaciones[i] = cal;
        }

        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }

        System.out.println("El promedio de las calificaciones es: " + promedio/materias);
    }
}
