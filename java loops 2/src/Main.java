import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int firstN = a;
            for(int j=0;j<n;j++)
            {
                firstN+=(Math.pow(2,j)*b);
                System.out.print(firstN+" ");
            }
            System.out.println();
        }
    }
}