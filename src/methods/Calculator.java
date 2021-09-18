package methods;

public class Calculator {
    public void Add(){
        int a= 45;
        int b= 54;
        int result= a+b;
        System.out.println("Addition of two number is "+result);
    }
    public void mul(){
        int a= 34;
        int b= 21;
        int result= a+b;
        System.out.println("Multiplication of two number is "+ result);
    }
    public void Sub(){
        int a= 54;
        int b=23;
        int result= a-b;
        System.out.println("Subtraction of two number is "+result);
    }
    public void divide(){
        int a =50;
        int b =25;
        int result= a/b;
        System.out.println("Division of two number is " +result);
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.Add();
        obj.mul();
        obj.Sub();
        obj.divide();
    }

}
