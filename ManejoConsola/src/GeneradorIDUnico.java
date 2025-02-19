import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Generador id unico ***");
        var consola = new Scanner(System.in);

        //Guardar Datos y preguntasr datos
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa tu año de nacimiento(YYYY): ");
        var anioNacimiento = consola.nextLine();

        // Generar id 4 digitos
        var random = new Random();
        var id = random.nextInt(9999) + 1;
//        System.out.printf("%04d", id);

        // Generar id unico
        var dosLetrasNombre = nombre.trim().toUpperCase().substring(0,2);
        var dosLetrasApellido = apellido.trim().toUpperCase().substring(0,2);
        var dosUltimosDigitosNacimiento =  anioNacimiento.trim().substring(2);
        var idUnico = String.format("%s%s%s%04d",dosLetrasNombre,dosLetrasApellido,dosUltimosDigitosNacimiento,id);

        //Imprimir Id
        System.out.println(idUnico);

    }
}
