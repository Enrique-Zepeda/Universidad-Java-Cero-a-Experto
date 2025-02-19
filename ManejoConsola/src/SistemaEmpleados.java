import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        var consola = new Scanner(System.in);

        //Nombre del empleado(leer)
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false): ");
        var isJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
//        System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado); // .formatted()
        System.out.println("\tEs Jefe de departamento: " + isJefe);
    }
}
