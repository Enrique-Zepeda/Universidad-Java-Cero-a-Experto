public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or || ***");
        // Or || regresa tru si alguno es verdadero si los dos son falsos regresa false
        boolean a = true, b = false;
        var resultado = a || b;
        System.out.println("resultado = " + resultado);
        a = false;
        resultado = a || b;
        System.out.println("resultado = " + resultado);
    }
}
