package builder;

import models.Laptops;

public abstract class LaptopsFactory {
    public abstract Laptops ejecutarlaptops();

    public void EjecutarLaptops(){
        Laptops despliegue =  ejecutarlaptops();
        despliegue.ejecutar();
    }
}
