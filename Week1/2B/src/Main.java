import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        boolean a= (x%4==0);
        boolean b=x%100!=0;
        boolean c= x%400==0;
        if((a && b)|| c){
            System.out.println("YES");
        }else
            System.out.println("NO");

	// write your code here
    }
}
