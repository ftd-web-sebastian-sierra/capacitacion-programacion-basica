import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // === === === === === HOLA MUNDO === === === === ===
//        System.out.println("Hola equipo QA");

        // === === === === === SOLICITAR INFORMACIÓN AL USUARIO === === === === ===
        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingresa tu nombre: ");
//        String nombreDeUsuario = sc.nextLine();
//        System.out.println("Hola " + nombreDeUsuario);

        // === === === === === TIPOS DE DATOS === === === === ===
        String nombre = "Andres";
        int edad = -23; // 2147483647
        long numeroMuyGrande = 224646464456456L; // 9,223,372,036,854,775,807
        Double estatura = 1.70;
        Boolean tieneCarro = false;
        String[] nombres = {"Anny", "Julian", "Roland"};

        // === === === === === CONVENCIÓN DE NOMBRES === === === === ===
        class PascalCase {}
        /*
         * Primera letra de cada palabra en mayuscula
         * Se utiliza para nombrar archivos y clases
         * */
        String camelCase = "camelCase";
        /*
         * Primera letra de cada palabra en mayuscula desde segunda palabra
         * Se utiliza para nombrar variables
         * */
        final String CONSTANT_CASE = "CONSTANT_CASE";
        /*
         * En mayuscula separación de palabras con _En mayuscula separación de palabras con _
         * Se utiliza para nombrar valores que queremos guardar en memoria que no cambiaran en ejecución
         * */

        // === === === === === CONDICIONALES === === === === ===
//        if (edad >= 18) {
//            System.out.println("Puedes ingresar. Eres mayor de edad");
//        } else if(edad < 0){
//            System.out.println("Edad no valida");
//        } else{
//            System.out.println("No puedes ingresar. No eres mayor de edad");
//        }

        // === === === === === SWITCH === === === === ===
//        final String ANNY = "Anny";
//        final String JULIAN = "Julian";
//        final String ROLAND = "Roland";
//        switch (nombre) {
//            case ANNY:
//                System.out.println("Su nombre es: " + ANNY);
//                break;
//            case JULIAN:
//                System.out.println("Su nombre es: " + JULIAN);
//                break;
//            case ROLAND:
//                System.out.println("Su nombre es: " + ROLAND);
//                break;
//            case "Andres":
//                System.out.println("Su nombre es: Andres");
//                break;
//            default:
//                System.out.println("No se encontraron coincidencias");
//                break;
//        }

        // === === === === === FOR === === === === ===
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Hola " + nombres[i]);
//        }

        // === === === === === FOR EACH === === === === ===
//        for (String nombrePersona : nombres) {
//            System.out.println("Hola " + nombrePersona);
//        }

        // === === === === === WHILE === === === === ===
//        int contador = 0;
//        while (contador < nombres.length) {
//            System.out.println("Hola " + nombres[contador]);
//            contador++;
//        }

        // === === === === === DO WHILE === === === === ===
//        int edadUsuario = 0;
//        do {
//            System.out.print("Ingrese una edad: ");
//            edadUsuario = Integer.parseInt(sc.nextLine());
//        } while (edadUsuario < 18);

        // === === === === === CONVERTIR TIPOS DE DATOS === === === === ===
        int numero = 5;
        String texto = "23";
        String numeroATexto = Integer.toString(numero);
        int textoANumero = Integer.parseInt(texto);

        // === === === === === FUNCIONES Y METODOS === === === === ===
//        sumar(5 , 3);
//        System.out.println("La resta es: " + restar(5, 3));
    }

//    public static void sumar(int num1, int num2) {
//        System.out.println("La suma es: " + (num1 + num2));
//    }
//    public static int restar(int num1, int num2) {
//        return num1 - num2;
//    }
}
