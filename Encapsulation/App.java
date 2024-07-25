package Encapsulation;


public class App {
    public static void main(String[] args) {
        employee e1 = new employee();

        e1.set("sameer",10000);

        e1.get();
    }
}

class employee{
    private String name;
    private int salary;

    public void set(String n,int s)
    {
        name = n;
        salary = s;
    }

    public void get()
    {
        System.out.println(name);
        System.out.println(salary);
    }
   

}

