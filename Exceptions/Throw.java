package Exceptions;

public class Throw {
    public static void main(String[] args) throws IllegalArgumentException
     {
        Test a = new Test();
        a.meth();
    }
}


class Test{
    void meth() throws IllegalArgumentException
    {
        int a= 10;
        int b = -5;
   
            int ans = area(a,b);
            System.out.println(ans);
            
      
    
    }
    int area(int x,int y) throws IllegalArgumentException
    {
        if(x<0 || y<0)
        {
            throw new IllegalArgumentException("Dimensions are non positive");
        }
        int area = x*y;
        return area;
    }
}