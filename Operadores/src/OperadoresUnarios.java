public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a; //transforma e indica a un valor positivo no modifica el valor de la variable
        System.out.println("resultado = " + resultado);

        //Operador unario -
        resultado = -a;
        System.out.println("resultado = " + resultado);

        //Operador unario incremeto/decremento
//        Pre-Incremento
        a = 3;
        resultado = ++a;
        System.out.println("resultado = " + resultado);
        //Post-incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y despues se incrementa, solo se incrementa cuando vuelve a ser usada la variable
        System.out.println("resultado a++ " + resultado);
        System.out.println("a en este momento se incrementa " + a);

        //        Pre-decremento
        b = -2;
        resultado = ++b;
        System.out.println("resultado = " + resultado);
        //Post-incremento
        b = -2;
        resultado = b--; //Primero se usa el valor y despues se decrementa, solo se decrementa cuando vuelve a ser usada la variable
        System.out.println("resultado a++ " + resultado);
        System.out.println("b en este momento se decrementa " + b);

    }
}
