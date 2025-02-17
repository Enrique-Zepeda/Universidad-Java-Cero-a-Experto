public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("*** Manejo indices en cadenas ***");
        var cadena1 = "Hola Mundo";
        
        // Recuperar primer caracter
        char primerCaracter = cadena1.charAt(0); //Recupera el caracter de H
        System.out.println("primerCaracter = " + primerCaracter); 
        var ultimoCaracter = cadena1.charAt(9); //Recupera el caracter de H
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        var caracter5 = cadena1.charAt(5); //Recupera el caracter de H
        System.out.println("caracter5 = " + caracter5);



    }
}
