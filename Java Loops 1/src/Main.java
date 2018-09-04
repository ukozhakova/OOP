import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a= new int[10];
        int[] b= new int[10];
        int number=scanner.nextInt();
        for(int i=0; i<10; ++i){
            b[i]=(i+1)*number;

        }
        for(int i=0; i<10; ++i){
            System.out.println(number+ " x "+ (i+1)+" = "+b[i]);
        }
    }
}
