package Methods;

import java.util.Scanner;

public class Methods {
    public static void main (String [] args) {
        // A block of code that executes upon call
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        hello(name, age);

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(x + " + " + y + " = " + z);
        //or
        System.out.println(add(x,y));
    }

    //To create out own methods we define static - return type - name (parameter type, parameter name)
    static void hello(String name, int age) {
        System.out.println("Hi there " + name +", you are " + age + " years old.");
    }

    //static - data type - function name (parameter data type, parameter name)
    static int add(int x, int y){
        return x + y;
        //or
        //int result = x + y;
        //return result;
    }

}
