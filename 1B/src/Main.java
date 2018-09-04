import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println("The next number for the number " + x + " is " + (x + 1) + ".");
        System.out.println("The previous number for the number " + x + " is " + (x - 1) + ".");
        // write your code here
    }
} 