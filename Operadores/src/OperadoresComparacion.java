public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de comparaciom ***");
        
        int a =3, b=2;
        // Igualdad ==
        var resultado = (a == b);
        System.out.println("resultado = " + resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("resultado = " + resultado);
        // Mayor que >
        resultado = a > b;
        System.out.println("resultado = " + resultado);
        //Mayor o igual que >=
        resultado = a >= b;
        System.out.println("resultado = " + resultado);
        // Menor que <
        resultado = a < b;
        System.out.println("resultado = " + resultado);
        // Menor que <=
        resultado = a <= b;
        System.out.println("resultado = " + resultado);
        
    }
}
