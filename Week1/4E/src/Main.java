import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=1;
        int cnt=0;
        while(i<a){
            i*=2;
            cnt++;
        }
        System.out.print(cnt);
    }
}
