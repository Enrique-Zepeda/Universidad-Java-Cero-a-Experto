public class MasCincatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);

        //StringBuilder
        var constructorDeCadenas = new StringBuilder();
//        constructorDeCadenas.append(cadena1);
//        constructorDeCadenas.append(" ");
//        constructorDeCadenas.append(cadena2);
        constructorDeCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorDeCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        // Join
        resultado = String.join(" ",cadena1,cadena2, "Adios");
        System.out.println("resultado Join = " + resultado);
    }
}
