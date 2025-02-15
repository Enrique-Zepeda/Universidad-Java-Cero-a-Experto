public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas de nombres de variables
        String nombreCompleto = "Kike Zepeda"; //Correcto, y buenas practicas (camelCase)
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Kike Zepeda 2"; //Correcto, pero no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
//        String nombre-cliente = "Kike Zepeda"; // incorrecto no se permiten -
        String nombre_cliente = "Kike Zepeda Cliente"; // Correcto, pero no aplica buenas practicas
        String _apellido = "Zepeda"; // Correcto y aceptable
        String $apellidoCompleto = "Zepeda Zambrano"; // Correcto y aceptable
        int totPzs = 10; //Esta variable es correcta pero no aplica las buenas practicas porque no es un nombre descriptivo
        int totalPiezas = 10; //Correcto, aplica las buenas practicas
        boolean casado = true; // Correcta, puede mejorar porque es booleana
        boolean esCasado = true; // Correcta, tipo booleano
        boolean isCasado = true; // Correcta, tipo booleano
        boolean tieneSaldo = true; // correcta
        boolean hasSaldo = true; // correcta
    }
}
