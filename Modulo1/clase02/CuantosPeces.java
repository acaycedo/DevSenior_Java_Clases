import java.util.Scanner;
public class CuantosPeces {

    public static void main(String[] args) {
        //Ejercicio 3: ¿Cuántos peces hay en el acuario?
        System.out.println("ONG Salvemos los peces de colores");
        System.out.println("Digite la cantidad de peces azules en cuarentena: ");
        var lector = new Scanner(System.in);
        
        var pecesAzules = lector.nextInt();
        System.out.println("Digite la cantidad de peces rojos en cuarentena: ");
        var pecesRojos = lector.nextInt();

        var pecesEnCuarentena = pecesAzules+pecesRojos;

        System.out.println("Hay un total de "+ pecesAzules +" peces azules y "+pecesRojos+" peces rojos, por lo tanto existen: "+pecesEnCuarentena+" dentro del acuario");

        lector.close();
    }
}