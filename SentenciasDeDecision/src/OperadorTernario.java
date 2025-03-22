public class OperadorTernario {
    public static void main(String[] args) {
        //Sintaxis
        //Condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        var numero = 4;
        var resultado = numero % 2 == 0 ? "Par" : "Impar";
        System.out.println("resultado = " + resultado);
        var edad = 4;
        var resultado1 = edad >= 18 ? "Mayor" : "Menor";
        System.out.println("resultado = " + resultado1);
        var num = 4;

        // ternario Anidado
        var resultado2 = num > 0 ? "Positivo" : num < 0 ? "Negativo" : "Cero";
        System.out.println("resultado = " + resultado2);
    }
}
