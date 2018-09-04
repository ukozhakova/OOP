import java.util.Scanner;
public class Main {
    static int _Xor(int a, int b){
        if(a!=b)
            return 1;
        else return 0;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.print(_Xor(a,b));
    }
}
