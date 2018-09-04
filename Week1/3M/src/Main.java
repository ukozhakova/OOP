import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            x = sc.nextInt();
            if (x == 0) {
                sum++;
            }
        }System.out.println(sum);
    }


    }
