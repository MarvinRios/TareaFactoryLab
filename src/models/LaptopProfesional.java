package models;

public class LaptopProfesional extends Laptops {

    public LaptopProfesional() {
        this.marcaYModelo = "Macbook Pro";
        this.anioFabricacion = "2022";
        this.procesador = "Apple Silicon M2";
        this.tamanoPantalla = "16";
    }

    @Override
    public void ejecutar() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println("Marca y Modelo: " + this.marcaYModelo);
        System.out.println("Año de Fabricacion: " + this.anioFabricacion);
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Tamaño de la Pantalla: " + this.tamanoPantalla);
        System.out.println();
    }
}
