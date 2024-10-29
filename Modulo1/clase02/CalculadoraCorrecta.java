public class CalculadoraCorrecta {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: 6 / 2 ( 1 + 2 )");

        int android=6/2*(1+2);
        int calculadoraCientifica=6/(2*(1+2));

        System.out.println("La calculadora de Android da: "+android+" y la calculadora cientifica da: "+calculadoraCientifica);
        System.out.println("Por lo tanto el resultado correcto es: "+calculadoraCientifica);

        //El resultado correcto es 1.
        //Ya que el celular no tiene en cuenta el orden de lectura de izquierda a derecha o el peso de la operacion a la hora
        //de hacer operaciones complejas donde se encuentren operadores de la misma categoria es decir, la division y multiplicacion.

        //Por ley primero se opera la multiplicacin y luego la division. 

        //La calculadora de Android puede que este programada de forma que opere lo que esta entre parentesis y luego
        //hace operaciones de izquierda a derecha sin importar la jerarquia.
        
    }
}
