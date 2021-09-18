package conditional_statement;

public class Statement_Demo {

    public void demo(){
        int age= 15;
        String city= "Agra";

        if (age>=15 && city=="Agra"){
            System.out.println("This person is adult and live in agra city");
        }else{
            System.out.println("This person is not adult and not live in agra city");
        }
        if (age>=15 || city=="Delhi"){
            System.out.println("This person is adult");
        }
        else{
            System.out.println("This is or operator");
        }
        // ! operator
        if(!(age>16)){
            System.out.println("if statement in not operator");
        }
        else
            {
            System.out.println("else statement of not operator");
        }
    }

    public static void main(String[] args) {
        Statement_Demo object= new Statement_Demo();
        object.demo();

    }
}
