public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscarg subcadenas
//        indexof - devuelve el indice de la primera aparacion de subcadena
        var cadena1 = "Hola Mundo";
        
        //subcadena a buscar "Hola"
        
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //Metodo lastIndexOf devuelve la utima aparacion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //sucadena no encontrada devuelve -1
        var indice3 = cadena1.lastIndexOf("java");
        System.out.println("indice3 = " + indice3);
    }
}
