package AbstractClasses;

abstract class Car{
    public int a;
    public void windshield()
    {

    }
    abstract void gearchange();

}

class SportsCar extends Car{
    public void gearchange()
    {
        
    }
}



public class App {
    public static void main(String[] args) {
        SportsCar a = new SportsCar();
        a.gearchange();
    }
}
