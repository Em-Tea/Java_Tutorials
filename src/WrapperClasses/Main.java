package WrapperClasses;

public class Main {
    public static void main (String[]Args){
        /*
        A wrapper class provides a way to use primitive data types as reference data types.
        Reference data types contain useful methods which can be used with collections (ex.ArrayList)
        A String is already a reference data type.

        Primitive                                     Wrapper
        ---------------                               ---------------
        boolean                                       Boolean
        char                                          Character
        int                                           Integer
        double                                        Double

       autoboxing = the automatic conversion that the Java compiler makes between the primitive data types
                    and their corresponding wrapper class.
       -----------------------------------------------------------------------------------------------------
       unboxing = The reverse of autoboxing. Automatic conversion of wrapper class to primitive.
         */

        Boolean a = true;
        Character b = 'B';
        Integer c = 123;
        Double d = 3.14;
        String e = "Me";

        if(a == true) {
            System.out.println("This is true.");
        }
    }
}
