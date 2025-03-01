package Clase_03;

public class Carro implements Vehiculo { //usamos implements ya que debe si o si tener los metodos de padre

    @Override
    public void move() {
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public int getSpeed() {
        return 260;
    }

    @Override
    public void changeMarcha(int cambio) {
        System.out.println("Se cambio a "+cambio+ "marcha");
    }

}
