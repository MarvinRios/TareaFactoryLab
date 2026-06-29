package app;

import builder.LaptopsFactory;
import models.LaptopProfesional;
import models.Laptops;

public class ProfesionalFactory extends LaptopsFactory {
    @Override
    public Laptops ejecutarlaptops() {
        return new LaptopProfesional();
    }
}
