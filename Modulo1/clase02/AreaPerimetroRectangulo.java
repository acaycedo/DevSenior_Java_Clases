import java.util.Scanner;
public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        //Ejercicio 8: Área y Perímetro de un Rectángulo
        System.out.println("Calculo del Area y el Perimetro.");
        var lector = new Scanner(System.in);
        System.out.println("Para calcular el area y el perimetro por favor digite el ancho del rectangulo en cm: ");
        double ancho = lector.nextDouble();
        System.out.println("Ahora digite el alto del mismo rectangulo en cm: ");
        double alto = lector.nextDouble();
        lector.close();
        var area = ancho * alto;
        var perimetro = 2*(ancho + alto);
        System.out.printf("El area de ese rectangulo es de: %.2f cm y el perimetro es de: %.2fcm",area,perimetro);

    }
}
