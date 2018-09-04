import java.util.Scanner;
public class Main {
    static int min(int a, int b, int c, int d){
        int res=b;
        if(a<=b && a<=c && a<=d)
            res=a;
        else if (c<=a && c <=d && c<=b)
            res=c;
        else if (d<=a && d<=b && d<=c){
            res=d;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        System.out.print(min(a,b,c,d));

    }
}
