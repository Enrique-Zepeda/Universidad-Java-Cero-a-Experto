import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        boolean opc = false;
        do{
        System.out.print("Ingresa una contraseña");
        String password = consola.nextLine();
        if (password.length() >= 6){
            opc = true;
            System.out.println("Password valido");
        }
        }while(!opc);
    }
}
