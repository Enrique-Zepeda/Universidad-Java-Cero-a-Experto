public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema subcadenas
        //substring(inicio, fin(sin incluir el ultimo caracter)
        //substring(inicio) devuelve desde el indice indicado hasta el final
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
