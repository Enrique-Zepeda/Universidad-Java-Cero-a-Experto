public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres Especiales
        // \n - imprime un salto de linea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // \t tabulacion
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // \' Agraga comilla simple
        var cadena3 = " hola \' mundo";
        System.out.println("cadena3 = " + cadena3);

        // \" agrega una comilla doble
        var cadena4 = " hola \" mundo";
        System.out.println("cadena4 = " + cadena4);

        // \\ para imprimir la \
        var cadena5 = " hola \\ mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
