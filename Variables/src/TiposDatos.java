public class TiposDatos {
    public static void main(String[] args) {
//        Tipos de datos
//        Enteros
        byte tipoByte = 127; //127 valor maximo bits en byte
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000; //16 bits
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt); //32 bits

        long tipoLong = 9876543210L; //987654321 Valor mas grande pero si le ponemos una L se puede hasta 987654321098765432L 64 bits
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante
        float tipoFloat = 3.14F; //Usar F mayuscula al final 32 bits
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; //64Bits se pude poner una D al final para indicar que es tipo double
        System.out.println("tipoDouble = " + tipoDouble);
    }
}
