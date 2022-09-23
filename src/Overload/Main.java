package Overload;

public class Main {
        public static void main (String[]args) {
            // overloaded methods are methods that share the same name but have different parameters
            //method name + parameters = method signature

            double x = add(1.1, 2.2, 3.3, 4.4);
            System.out.println(x);

        }

        static int add(int a, int b) {  //Overload #1
            return a + b;
        }

        static int add(int a, int b, int c) {   //overload #2
            return a + b + c;
        }

        static int add(int a, int b, int c, int d) {
            return a + b + c + d;
        }
        static double add(double a, double b) {     //overload #4 - now accepts double as long as data type matches
            return a + b;
        }

        static double add(double a, double b, double c) {   //overload #5
            return a + b + c;
        }

        static double add(double a, double b, double c, double d) {     //overload #6
            return a + b + c + d;
        }
    }
