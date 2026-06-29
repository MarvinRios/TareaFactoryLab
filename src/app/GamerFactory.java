package app;

import builder.LaptopsFactory;
import models.LaptopGamer;
import models.Laptops;

public class GamerFactory extends LaptopsFactory {
    @Override
    public Laptops ejecutarlaptops() {
        return new LaptopGamer();
    }
}
