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
        for (int i=1; i<n-1;++i){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}

