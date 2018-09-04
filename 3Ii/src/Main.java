import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int cnt=0;
        int i=1;
        while(i<=Math.sqrt(a)){
            if(a%i==0){
                cnt++;
            }
            i++;
        }
        if(Math.sqrt(a)%1==0)
            System.out.println(cnt*2-1);
        else
            System.out.println(cnt*2);
    }
}
