package OverloadingConstructors;

public class Main {
    public static void main(String[] args) {

        //Instantiating and utilising overloaded methods - note the different number of arguments but same method name.

        //We each overloaded method is identified by its signature.

        Pizza pizza1 = new Pizza("Thin Crust", "Tomato", "Moz", "Salami" );
        Pizza pizza2 = new Pizza("Thick Crust", "Garlic", "Moz");

        pizza1.OrderD();
        System.out.println("");
        pizza2.OrderD();

    }
}
