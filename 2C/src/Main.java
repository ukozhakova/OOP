import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        if((a==1 && b==1)||(a!=1 && b!=1)){
            System.out.println("YES");
        } else
            System.out.println("NO");
	// write your code here
    }
}
