public class PrecioSinDescuento {
    public static void main(String[] args) {
        //Ejercicio 6: ¿Qué precio tenían antes del descuento?
        //Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento del 15%. 
        //¿Qué precio tenían antes de aplicar el descuento?
        var valorPagado = 34d;
        System.out.printf("Valor pagado: %.2f$%n",valorPagado);
        var descuento = 15d;
        System.out.printf("Descuento: %.2f %n",descuento);
        var pagoConDescuento = (100-descuento)/100;
        var valorOriginal = valorPagado / pagoConDescuento;
        System.out.printf("Pago el %.0f porciento por lo tanto el valor antes del descuento es: %.2f$",pagoConDescuento*100,valorOriginal);
    }
}
