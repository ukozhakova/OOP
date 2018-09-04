import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int i=0;
        while(a>1){
            if(a%2==0) a/=2;
            else break;
        }
        if(a>1)
            System.out.print("NO");
        else System.out.print("YES");
    }
}
