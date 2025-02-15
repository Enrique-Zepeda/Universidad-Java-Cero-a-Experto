public class ReservaHoteles {
    public static void main(String[] args) {
        String nombreCliente = "Enrique Zepead";
        int diasEstancia = 5;
        float tarifaDiaria = 1349.99F;
        boolean hasVistaMar = false;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("hasVistaMar = " + hasVistaMar);

        System.out.println("Valores modificados");
        nombreCliente = "Enrique Zepeda";
        hasVistaMar = true;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("hasVistaMar = " + hasVistaMar);
    }
}
