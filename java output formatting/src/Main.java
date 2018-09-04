import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String x = sc.next();
            int k=x.length();
            for(int j=0;j<3-k;j++){
                x="0"+x;
            }

            int emp = 15-s1.length();
            String spc = "";
            for(int j=0;j<emp;j++){
                spc+=" ";
            }
            System.out.println(s1+spc+x);
        }
        System.out.println("================================");

    }
}