import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0; i<n; ++i){
            a[i]= sc.nextInt();
        }
        int cnt=0;
        for (int i=0; i<n;++i){
            if(a[i]>0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
