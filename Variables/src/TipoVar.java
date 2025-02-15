public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //  Sin el usor de var
        String nombre1 = "Kike";
        System.out.println("nombre1 = " + nombre1);
        // Con var
        var nombre2 = "Adair";
        System.out.println("nombre2 = " + nombre2);
//        Otra variables con var
        var edad = 22;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;
        System.out.println("sueldo = " + sueldo);
        var esCasado = false;
        esCasado = true;
//        esCasado = "No"; nose puede hacer eso porque ya es boolean

//        Se debe definir su valor
//        var precio; //esto da error tenemos que asignar un valor
//        var apellido = null // esta mal no se puede inferir el tipo de dato

    }
}
