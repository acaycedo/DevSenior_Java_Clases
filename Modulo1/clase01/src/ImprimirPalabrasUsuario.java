import java.util.Scanner;

public class ImprimirPalabrasUsuario {
    public static void main(String[] args) {
        var escaner = new Scanner(System.in);
        System.out.print("Ingrese la primer palabra: ");
        String primerPalabra = escaner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String segundaPalabra = escaner.nextLine();
        System.out.print("Ingrese la tercer palabra: ");
        String tercerPalabra = escaner.nextLine();

        System.out.println("Opcion 1:");
        System.out.printf("%s %s %s %n",primerPalabra,segundaPalabra,tercerPalabra);

        //Si dado el caso que no dejara usar el printf podriamos concatenar las cadenas de texto
        System.out.println("Opcion 2:");
        System.out.println(primerPalabra + " "+ segundaPalabra + " " + tercerPalabra);
        escaner.close();
    }
}
