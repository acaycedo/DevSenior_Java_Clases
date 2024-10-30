public class CostoConDescuento {
    public static void main(String[] args) {
        //Ejercicio 5: ¿Cuánto te ha costado el ordenador?
        //Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?

        var costoTotal = 660d;
        var descuento = 10d;
        var totalDescuento = costoTotal - ((costoTotal * descuento )/100d);
        System.out.printf("Cotizacion PC Gamer para programar en DevSenior. %nSubTotal : %.2f $  %n Descuento : %.2f$%nTotal : %.2f $",costoTotal,costoTotal/10,totalDescuento);
    }
}
