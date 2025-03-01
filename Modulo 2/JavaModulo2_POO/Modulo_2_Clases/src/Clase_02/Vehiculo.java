package Clase_02;

public class Vehiculo {

    String marca;
    String modelo;
    float velocidadMaxima;

    public Vehiculo(){
        marca = "N/A";
        modelo = "N/A";
        velocidadMaxima = 0;
    }

    public Vehiculo(String  marca, String modelo, float velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Marca: " + modelo);
        System.out.println("Marca: " + velocidadMaxima);

    }

}


