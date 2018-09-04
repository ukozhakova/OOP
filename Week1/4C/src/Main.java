import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int b;
        b = sc.nextInt();
        int i = 0;
        while(Math.pow(2,i)<=b){
            System.out.print((int)Math.pow(2,i)+ " ");
            i++;
        }
    }
}