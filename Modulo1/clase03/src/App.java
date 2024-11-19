import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ejercicio11();
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
        if (digito2 == digito3) {
            System.out.println("Alguno de los numeros ingresados son iguales, para evaluar ");
        } else {
            var numeroMaximo = Math.max(digito1, Math.max(digito2, digito3));
            System.out.println("Numero mas grande es: " + numeroMaximo);
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
    // Escriba un programa que permita ingresar una letra e identifique si la letra
    // es mayúscula o minúscula.
    public static void Ejercicio4() {
        var lector = new Scanner(System.in);
        System.out.println("Digite el caracter a evaluar: ");
        char caracter = lector.next().charAt(0);
        if (Character.isUpperCase(caracter)) {
            System.out.printf("Caracter ingresado esta mayusculas: %s", caracter);
        } else if (Character.isLowerCase(caracter)) {
            System.out.printf("Caracter ingresado esta en minusculas: %s", caracter);
        } else {
            System.out.println("Caracter no valido.");
        }
        lector.close();
    }

    // Ejercicio 5
    // Escriba un programa que permita ingresar una letra e identifique si es vocal
    // o consonante.

    public static void Ejercicio5() {
        var lector = new Scanner(System.in);
        System.out.println("Digite el caracter a evaluar: ");
        char caracter = lector.next().toLowerCase().charAt(0);

        if (caracter >= 'a' && caracter <= 'z') {
            if (caracter == 'a' && caracter == 'e' && caracter == 'i' && caracter == 'o' && caracter == 'u') {
                System.out.printf("La letra ingresada es vocal: %s.", caracter);
            } else {
                System.out.printf("La letra ingresada es consonante: %s.", caracter);
            }

        } else {
            System.out.printf("Caracter ingresado no es una letra.");
        }

        lector.close();
    }
    // Ejercicio 6
    // Escriba un programa que permita ingresar un número y determine si es
    // divisible por dos y siete.

    public static void Ejercicio6() {
        var lector = new Scanner(System.in);
        System.out.println("Digite un numero para evaluar si es divisible por 2 y 7: ");
        var numero = lector.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El numero es divisible por 2 y 7: " + numero);
        } else if (numero % 2 == 0 && numero % 7 != 0) {
            System.out.println("El numero es divisible por 2 pero no de 7: " + numero);
        } else if (numero % 2 != 0 && numero % 7 == 0) {
            System.out.println("El numero es divisible por 7 pero no de 2: " + numero);
        } else {
            System.out.println("El numero no es divisible por 2 y 7");
        }

        lector.close();
    }

    // Ejercicio 7
    // Escriba un programa que permita ingresar tres números (representan la
    // longitud de una línea) y compruebe si con estos números se puede formar un
    // triángulo.

    private static void Ejercicio7() {

        // Crear un objeto Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese tres números
        System.out.print("Ingrese el primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        // Verificar si se puede formar un triángulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los números ingresados pueden formar un triángulo.");
        } else {
            System.out.println("Los números ingresados NO pueden formar un triángulo.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    private static void Ejercicio8() {
        // Escriba un programa que permita ingresar un número (va a representar la
        // cantidad de años) y de como respuesta la etapa en la que se encuentra la
        // persona de acuerdo con la siguiente tabla.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Primera Infancia");

        } else if (age >= 6 && age <= 11) {
            System.out.println("Infancia");

        } else if (age >= 12 && age <= 18) {
            System.out.println("Adolescencia");

        } else if (age >= 19 && age <= 26) {
            System.out.println("Juventud");

        } else if (age >= 27 && age <= 59) {
            System.out.println("Adultez");

        } else if (age > 59) {
            System.out.println("Persona Mayor");
        } else {
            System.out.println("Edad invalida");
        }
        scanner.close();

    }

    private static void Ejercicio9() {
        // Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la
        // cantidad de unidades que le compren. La siguiente tabla muestra la
        // información:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de camisetas a comprar: ");
        int und = scanner.nextInt();

        if (und >= 1 && und < 50) {
            System.out.println("Precio por unidad: $45.000");

        } else if (und >= 50 && und < 100) {
            System.out.println("Precio por unidad: $40.000");

        } else if (und >= 100 && und < 150) {
            System.out.println("Precio por unidad: $35.000");

        } else if (und >= 150 && und <= 200) {
            System.out.println("Precio por unidad: $25.000");

        } else if (und > 200) {
            System.out.println("Precio por unidad: $25.000");
        } else {
            System.out.println("Precio no disponible");
        }
        scanner.close();
    }

    private static void Ejercicio10() {
        // Escriba una función en la que ingrese un número entero entre 1 y 12. Este
        // número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El
        // resultado debe ser el número de días del mes ingresado.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mes para saber los dias: ");
        int month = scanner.nextInt();
        String typeMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.print("Mes escogido " + month);
                yield "31";
            }
            case 4, 6, 9, 11 -> {
                System.out.print("Mes escogido " + month);
                yield "30";
            }
            case 2 -> {
                System.out.print("Mes escogido " + month);
                yield "28";
            }
            default -> "Mes no válido";
        };
        System.out.println(" y tiene: " + typeMonth + " dias.");
        scanner.close();
    }

    private static void Ejercicio11() {
        // Escriba una función en la que pueda ingresar tres números enteros y
        // diferentes. Imprima estos valores en orden ascendente.
        var lector = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        var oneDigit = lector.nextInt();
        System.out.println("Digite el segundo numero: ");
        var twoDigit = lector.nextInt();
        System.out.println("Digite el tercer numero: ");
        var threeDigititos = lector.nextInt();
        
        int numeroMaximo1 = Math.max(oneDigit, Math.max(twoDigit, threeDigititos));
        int numeroMaximo2 = Math.max(twoDigit,threeDigititos);
        int numeroMinimo = Math.min(oneDigit, Math.min(twoDigit, threeDigititos));
        System.out.println("el orden de los numeros es: "+numeroMaximo1+", "+numeroMaximo2+", "+numeroMinimo);

        lector.close();
    }

}
