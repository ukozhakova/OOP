import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        if(x>0){
            System.out.println(1);
        } else if(x<0){
            System.out.println(-1);
        } else if (x==0){
            System.out.println(0);
        }
	// write your code here
    }
}
