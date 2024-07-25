package Interface;

interface Computer{
    void display();
}

interface Electronics{
    void powerSupply();
}

// multiple inheritance is only possible in Interfaces
class Lenovo implements Computer,Electronics{
    public void display()
    {
        System.out.println("hello");
    }
    public void powerSupply()
    {
        
    }
}


public class App {
    public static void main(String[] args) {
        
    }
}
