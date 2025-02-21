public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de asignacion ***");
        //Asignacion =
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;

        //Asiganacion compuesto +=
        miNumero += 5; //miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero);

        //Asignacion de variables multiples
        int a = 10, b = 15, c = 20; //Todas la variables deben de ser un tipo de dato y todas deben de inicalizarse
        // y no se puede usar var porque var solo se puede inicializar una variable

        System.out.printf("a=%d,b=%d,c=%d",a,b,c);
    }
}
