import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        Double d= Double.parseDouble(scan.nextLine());
        String s= scan.nextLine();
        // Write your code here. 

        System.out.println("String: "+ s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}