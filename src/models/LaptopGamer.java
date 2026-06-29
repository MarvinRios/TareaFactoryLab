package models;

public class LaptopGamer extends Laptops {

    public LaptopGamer() {
        this.marcaYModelo = "Macbook air";
        this.anioFabricacion = "2017";
        this.procesador = "Silicon M1";
        this.tamanoPantalla = "13";
    }

    @Override
    public void ejecutar() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println("Marca y Modelo: " + this.marcaYModelo);
        System.out.println("Año de Fabricacion: " + this.anioFabricacion);
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Tamaño de la Pantalla: " + this.tamanoPantalla);
        System.out.println();
    }
}
