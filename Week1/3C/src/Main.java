import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        for (int i=a; i<=b;i++){
            for(int j=0; j<=b;++j){
                if(j*j==i){
                    System.out.print(i+" ");
                }
            }
        }
    }
