import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int x;
        int sum=0;
        for (int i=0; i<=99; i++){
            x= sc.nextInt();
            sum+=x;
        }
        System.out.println(sum);
    }
}
