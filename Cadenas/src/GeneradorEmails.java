public class GeneradorEmails {
    public static void main(String[] args) {
//        retoSinAyuda();
        retoConAyuda();

    }

    public static void retoSinAyuda() {
        String nombre = "Ubaldo Acosta Soto";
        String empresa = "Global Mentoring";
        String dominio = "com.mx";

        var primerNombre = nombre.substring(0,6);
        var primerApellido = nombre.substring(7,13);
        var segundoApellido = nombre.substring(14);
        var empresa1 = empresa.substring(0,6);
        var empresa2 = empresa.substring(7);
        var nombreJuntoPuntos = new StringBuilder();
        nombreJuntoPuntos.append(primerNombre).append(".").append(primerApellido).append(".").append(segundoApellido).append("@").append(empresa1).append(empresa2).append(".").append(dominio);
        var email = nombreJuntoPuntos.toString();
        System.out.println("email = " + email.toLowerCase());
    }

    public static void retoConAyuda() {
        System.out.println("*** Generador de emails ***");
        //Nombre completo del usuario
        var nombreCompleto = "   Ubaldo Acosta Soto    ";
        //Procesar limpiar espacios en blanco
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacios en blanco con puntos .
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        //convertir a minuscular
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        //Datos empresa
        var nombreEmpresa = "Global Mentoring ";
        var extensionDominio = ".com.mx";

        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
        
        var emailFinal = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailFinal = " + emailFinal);

    }

}
