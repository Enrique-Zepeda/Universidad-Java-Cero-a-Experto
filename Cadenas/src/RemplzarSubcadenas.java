public class RemplzarSubcadenas {
    public static void main(String[] args) {
        //Remplazar subcadenas
        var cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);

        //Remplazar "mundo"por "a todos"
        var nuevaCadena = cadena.replace("mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Remplzar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola","Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
