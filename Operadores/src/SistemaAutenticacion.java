import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final String EMAIL = "admin";
        final String PASSWORD = "123";
        System.out.println("Sistema de autentificacion");
        System.out.print("Ingresa tu correo:");
        String email = consola.nextLine();
        System.out.print("Ingresa tu contrasenia:");
        String password = consola.nextLine();

        var verificado = email.equals(EMAIL) && password.equals(PASSWORD);

        System.out.println("verificado = " + verificado);
        
    }
}
