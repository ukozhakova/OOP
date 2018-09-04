import java.util.Scanner;
public class Main {
    static float power(double a, double b){
        float res;
        res= (float)Math.pow(a,b);
        return res;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        double a,b;
        a= sc.nextDouble();
        b=sc.nextDouble();
        System.out.print(power(a,b));

    }
}
