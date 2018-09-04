import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        int c= Math.abs(a*b)%109;
        int k;
        if(a>=0)
            k=c%109;
        else k = (109 - c) % 109;
        System.out.println(k);
	// write your code here
    }
}
