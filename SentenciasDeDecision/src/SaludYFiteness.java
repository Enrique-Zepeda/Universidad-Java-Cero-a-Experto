import java.util.Scanner;

public class SaludYFiteness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fiteness ***");
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        var consola = new Scanner(System.in);

        //Datos del usuario
        System.out.print("Ingresa Tu Nombre:");
        var nombre = consola.nextLine();
        System.out.print("Ingresa Tus Pasos Diarios:");
        var pasos = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = (pasos >= META_PASOS_DIARIO) ? "Se cumplio" : "No se cumplio";
        System.out.println("meta_alcanzada = " + metaAlcanzada);

        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f
                """,nombre,pasos,caloriasQuemadas);
    }
}
