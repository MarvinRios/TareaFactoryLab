package app;

import builder.LaptopsFactory;
import models.LaptopBasica;
import models.Laptops;

public class BasicaFactory extends LaptopsFactory {
    @Override
    public Laptops ejecutarlaptops() {
        return new LaptopBasica();
    }
}
