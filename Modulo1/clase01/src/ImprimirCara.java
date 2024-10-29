public class ImprimirCara {
    /*Ejercicio 2 
    Escriba un archivo llamado ImprimirCara que imprima una cara usando caracteres de texto.
    */

    public static void main(String[] args) {
        //vamo hacerlo de dos maneras la facil y la complicada teniendo en cuenta el uso de memoria.

        //Facil
        System.out.println("  @@@@@@@");
        System.out.println(" @| O O |@");
        System.out.println(" (|  ^  |)");
        System.out.println("  | [_] |");
        System.out.println("  +-----+");

        //Complicada
        System.out.printf("%s%n%s%n%s%n%s%n%s%n","  @@@@@@@"," @| O O |@"," (|  ^  |)","  | [_] |","  +-----+");
    }
}
