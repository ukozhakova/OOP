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
        boolean isExist= false;
        for (int i=1; i<n;++i){
            if(a[i]*a[i-1]>0){
                isExist=true;
            }
        }
        if(isExist== false) {
            System.out.print("NO");
        }
            else System.out.print("YES");

        }
    }

