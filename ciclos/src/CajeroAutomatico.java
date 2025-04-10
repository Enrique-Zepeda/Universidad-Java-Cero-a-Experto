import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        int opc;
        double saldo = 1000,cantidad = 0;

        do {
            System.out.println("Cajero Automatico");
            System.out.println("---------- M E N U ----------");
            System.out.println("0.Salir del menu");
            System.out.println("1.Depositar");
            System.out.println("2.Retirar");
            System.out.println("3.Consultar Saldo");
            System.out.print("Ingresa una opcion:");
            opc = Integer.parseInt(consola.nextLine());

            switch (opc){
                case 1:
                    System.out.println("Cantidad a depositar");
                    cantidad = Double.parseDouble(consola.nextLine());
                    saldo+=cantidad;
                    System.out.println("Saldo Ingresado con Exito");
                    break;
                case 2:
                    System.out.println("Cantidad a retirar");
                    cantidad = Double.parseDouble(consola.nextLine());
                    saldo-=cantidad;
                    System.out.println("Saldo retirado con Exito");
                    break;
                case 3:
                    System.out.println("Saldo disponible: " + saldo);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }

        }while (opc != 0);

    }
}
