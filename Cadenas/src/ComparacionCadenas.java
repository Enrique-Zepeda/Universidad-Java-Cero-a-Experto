public class ComparacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Comparacion de cadenas(pool de cadenas) ***");
        var cadena1 = "Java";
        var cadena2 = "Java"; //Esta cadena2 apunta a cadena1 porque tiene el mismo nombre hace referencia a la memoria
        var cadena3 = new String("Java"); //Para crear una cadena sin tener la misma referencia

        //Compracion de cadenas (==) compara la referencia en memeroria
        System.out.print("Cadena1 es igual a referencia de cadena2: ");
        System.out.println(cadena1 == cadena2);
        System.out.print("Cadena1 es igual a referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        System.out.println("Comparar contenido y no referencia, se usa el metodo equals ");
        System.out.print("Cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3)); // no comprara la referencia de memoria compara el contenido



    }
}
