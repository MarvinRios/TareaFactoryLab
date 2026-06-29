import app.BasicaFactory;
import app.GamerFactory;
import app.ProfesionalFactory;
import builder.LaptopsFactory;

void main(){

    System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

    LaptopsFactory factory;

    factory = new GamerFactory();
    factory.EjecutarLaptops();

    factory = new BasicaFactory();
    factory.EjecutarLaptops();

    factory = new ProfesionalFactory();
    factory.EjecutarLaptops();
}

