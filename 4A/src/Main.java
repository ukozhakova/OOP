import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int x,i=1;
        x= sc.nextInt();
        while(i*i<=x){
            System.out.println(i*i);
            i++;
        }
    }
}
