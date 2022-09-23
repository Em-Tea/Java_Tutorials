package OverloadingConstructors;
    public class Pizza {
        String bread;
        String sauce;
        String cheese;
        String topping;

        /*
        Overloading a constructor allows for the same constructor method to be called with a different set of parameters.
        When instantiating an object, different arguments are passed in, in accordance to overloaded methods.
         */
        Pizza( String bread, String sauce, String cheese, String topping) {
            this.bread = bread;         //This method includes 4 parameters.
            this.cheese = cheese;
            this.sauce = sauce;
            this.topping = topping;
        }

        Pizza( String bread, String sauce, String cheese) {
            this.bread = bread;     //This method is an overload of the Pizza instantiation method, instead including 3
            this.cheese = cheese;   //parameters, but the same method name.
            this.sauce = sauce;
        }

        void OrderD() {
            System.out.print("Your order is a " + this.bread + ", ");
            System.out.print(this.sauce + ", ");
            System.out.print(this.cheese + " and ");
            System.out.print(this.topping + " pizza.");
        }
    }
