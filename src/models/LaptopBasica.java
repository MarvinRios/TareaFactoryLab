package models;

public class LaptopBasica extends Laptops {

    public LaptopBasica() {
        this.marcaYModelo = "Dell Latitude";
        this.anioFabricacion = "2020";
        this.procesador = "intel core i7";
        this.tamanoPantalla = "14";
    }

    @Override
    public void ejecutar() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println("Marca y Modelo: " + this.marcaYModelo);
        System.out.println("Año de Fabricacion: " + this.anioFabricacion);
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Tamaño de la Pantalla: " + this.tamanoPantalla);
        System.out.println();
    }
}
