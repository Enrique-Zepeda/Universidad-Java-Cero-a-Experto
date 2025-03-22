public class SwitchMejorado {
    public static void main(String[] args) {
        System.out.println("*** Switch Mejorado ***");
        int dia = 1;
        int mes = 12;
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No existe ese dia: "+ dia);
        }
        switch (mes){
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
            default -> System.out.println("Estacion desconocida");
        }
    }
}
