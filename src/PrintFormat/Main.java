package PrintFormat;

public class Main {
    /*printf() is an optyional method to control, format and display text to the console window.
    two arguments = format string + (object/variable/value)
    % [flags] [precision] [width] [conversion-character]
    */
    public static void main (String[]args) {
        //the format specifier '%d' to decimal, is where the second argument is placed.
        System.out.printf("This is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Michael";
        int myInt = 50;
        double myDouble = 100000000;

        System.out.printf("%b", myBoolean);  //format boolean and display
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        //width is the number of characters to be written as output
        System.out.println("");
        System.out.printf("Hello %10s", myString);

        //precision sets the number of digits of precision when outputting floating point values
        System.out.println("");
        System.out.printf("%.1f", myDouble);  //limit to 1 digits

        /*
        Flags add an effect to an output based on the flag added to the format specifier
        - : justify left
        + : output a plus or minus sign for a numerical value
        0 : numeric values are zero-padded
        , : comma grouping separator if numbers > 1000
         */
        System.out.println("");
        System.out.printf("You have this much money %,f", myDouble);
    }
}
