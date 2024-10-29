public class ImprimirDiamante {
/*
Ejercicio 3
Escriba un archivo llamado ImprimirDiamante que imprima una cara usando caracteres de texto.
 */
    public static void main(String[] args) {
        //vamo hacerlo de dos maneras la facil y la complicada teniendo en cuenta el uso de memoria.

        //Facil
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");

        //Complicada
        System.out.println("________");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","   *","  ***"," *****","*******"," *****","  ***","   *");
    }
}
