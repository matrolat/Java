package MethodOverriding;
public class MethodOverriding{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        
    }
}

class Animal{
    public int x ;
    public void sound()
    {
        System.out.println("animal sound");
    }
}

class Dog extends Animal{
    public int y;
    public void sound()
    {
        System.out.println("woof woof");
    }
}