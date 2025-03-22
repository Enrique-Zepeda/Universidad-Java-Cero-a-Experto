import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al sistema Bancario ***");

        var consola = new Scanner(System.in);
        System.out.print("Desea salir del sistema");
        var salir = Boolean.parseBoolean(consola.nextLine());

//        Verificamos (aplicando una logica inversa)
        if (!salir){
            System.out.println("Continuamos dentro del sistema");
        }else {
            System.out.println("Saliendo del sistema");

        }
    }
}
