import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema reserva Hotel ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre:");
        var nombreCliente = consola.nextLine();
        System.out.print("Ingresa dias de estadia:");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Quieres vista al mar(True/False):");
        var hasVistaMar = Boolean.parseBoolean(consola.nextLine());
        double costoTotal = 0.0;
        if (!hasVistaMar){
            costoTotal = ((double)diasEstadia) * 150.50;
        }else{
            costoTotal = ((double)diasEstadia) * 190.50;
        }

        System.out.printf("""
                %nNombre del cliente: %s
                Dias de estadia: %d
                Cuarto con vista al mar: %b
                Coste total: %.2f
                """,nombreCliente, diasEstadia, hasVistaMar, costoTotal);

    }
}
