import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x, i, n;
        x= sc.nextInt();
        i=x;
        n=x;
        while(i>1){
            if(x%i==0){
                n=i;
            }
            i--;
        }
        System.out.println(n);
    }
}
