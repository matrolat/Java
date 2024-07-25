package Constructor;

public class App {
    public static void main(String[] args) {
        employee e1 = new employee();
        System.out.println(e1.salary);
        employee e2 = new employee("Sameer",20000);
        System.out.println(e2.name);
    }
}

class employee{
    public String name;
    public int salary;

    public employee()
    {
        salary = 10000;
    }

    public employee(String n,int s)
    {
        name = n;
        salary=s;
    }

}
