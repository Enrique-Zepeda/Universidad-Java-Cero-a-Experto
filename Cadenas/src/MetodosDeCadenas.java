public class MetodosDeCadenas {
    public static void main(String[] args) {
//        Metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Remplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minuculas
        System.out.println("Minusculas = " + cadena1.toLowerCase());

        // Eliminar espacios al final y inicio
        var cadena2 = "    Kike Zepeda    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
