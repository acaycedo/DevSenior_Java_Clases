import java.util.Scanner;

public class ErrorPrecio {
    public static void main(String[] args) {
        //Ejercicio 2: ¿Ves algún error en el precio?
        //precio del pernil por cada 100gr
        var precioPernil = 5.95F;
        System.out.printf("Precio del Pernil Iberic D'Engreix Llen por cada 100gr es de: %.2f %n",precioPernil);
        System.out.println("¿Cuantos kilos necesita?");

        var lector = new Scanner(System.in);
        //cuantosKilos almacena la cantidad de kilos necesitado
        double cuantosKilos = lector.nextDouble();
        //resultado hace la operacion del precio por 10 para calcular el precio por kilo y luego lo multiplica por la cantidad de kilos ingresados

        var resultado = (precioPernil*10)*cuantosKilos;
        System.out.printf("El precio por %.1f kilos es: %.2f1",cuantosKilos,resultado);
    
        lector.close();
    }
}
