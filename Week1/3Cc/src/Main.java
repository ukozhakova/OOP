import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
                if (Math.sqrt(i)%1==0) {
                    System.out.print(i + " ");
                }
        }
        System.out.println();
    }
    }
