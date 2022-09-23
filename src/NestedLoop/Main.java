package NestedLoop;
import java.util.Scanner;

//nested loop = loop within a loop

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter a symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++) {    //this section defines and increments the row
            System.out.println();
            for(int j = 1; j <= columns; j++){  //this section prints the symbol as many times as requested
                System.out.print(symbol);
            }
        }
    }
}
