public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador And && ***");
        boolean a= true, b =false;
        //And (regrasa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);
    }
}
