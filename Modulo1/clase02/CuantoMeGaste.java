public class CuantoMeGaste {
    public static void main(String[] args) {
        //Ejercicio 4: ¿Cuánto se ha gastado Carmen?
        //Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€. Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
        double valorInicial = 23;
        double valorFinal = 12.75;

        var valorGastado = valorFinal - valorInicial;

        System.out.printf("Valor inicial al salir de casa: %.2f %n Valor final al retornar a casa: %.2f %n Para un gasto total de: %.2f",valorInicial,valorFinal,valorGastado);
    }
}
