import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ejercicio5();
    }

    // Ejercicio 1
    // Escriba un programa que permita ingresar un número real e identifique si el
    // número es negativo, positivo o cero.

    public static void Ejercicio1() {
        var lector = new Scanner(System.in);

        System.out.println("Digite el numero que desea evaluar: ");
        var digito = lector.nextDouble();
        if (digito < 0) {
            System.out.printf("Numero ingresado es negativo: %.1f", digito);

        } else {
            System.out.printf("Numero ingresado es positivo: %.1f", digito);
        }
        lector.close();
    }

    // Ejercicio 2
    // Escriba un programa que le permita ingresar tres números e imprima en la
    // consola el más grande de ellos.

    public static void Ejercicio2() {
        var lector = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        var digito1 = lector.nextDouble();
        System.out.println("Digite el segundo numero: ");
        var digito2 = lector.nextDouble();
        System.out.println("Digite el tercer numero: ");
        var digito3 = lector.nextDouble();
        lector.close();
        if (digito1 == digito3 || digito1 == digito2) {
            // primero Math.max como solo toma dos argumentos primero tomamos los dos
            // numeros y luego lo evaluamos nuevamente con el digito faltante
        }
        if (digito2 == digito3) {
            System.out.println("Alguno de los numeros ingresados son iguales, para evaluar ");
        } else {
            var numeroMaximo = Math.max(digito1, Math.max(digito2, digito3));
            System.err.println("Numero mas grande es: " + numeroMaximo);
        }

    }

    // Ejercicio 3
    // Escriba un programa que permita ingresar un número e identificar si es par o
    // impar.
    public static void Ejercicio3() {
        var lector = new Scanner(System.in);
            System.out.println("Digite el numero a evaluar: ");
            var digito = lector.nextDouble();
            var comparador = digito % 2;
            if (comparador == 0) {
                System.out.printf("El numero es Par: %.2f", digito);
            } else {
                System.out.printf("El numero es Impar: %.2f", digito);
            }
            lector.close();
    }
    // Ejercicio 4
    // Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
    public static void Ejercicio4() {
        var lector = new Scanner(System.in);
            System.out.println("Digite el caracter a evaluar: ");
            char caracter = lector.next().charAt(0);
            if (Character.isUpperCase(caracter)) {
                System.out.printf("Caracter ingresado esta mayusculas: %s", caracter);
            } else if (Character.isLowerCase(caracter)){
                System.out.printf("Caracter ingresado esta en minusculas: %s", caracter);
            }else{
                System.out.println("Caracter no valido.");
            }
            lector.close();
    }

    //Ejercicio 5
    //Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.

    public static void Ejercicio5() {
        var lector = new Scanner(System.in);
            System.out.println("Digite el caracter a evaluar: ");
            char caracter = lector.next().toLowerCase().charAt(0);
            
            if (caracter >= 'a' && caracter <= 'z') {
                if (caracter == 'a' && caracter == 'e' && caracter == 'i'&& caracter == 'o'&& caracter == 'u') {
                    System.out.printf("La letra ingresada es vocal: %s.",caracter);
                }else{
                    System.out.printf("La letra ingresada es consonante: %s.",caracter);
                }
                
            }else{
                System.out.printf("Caracter ingresado no es una letra.");
            }

            lector.close();
    }
    

}   
