import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String A = sc.next();
    static char[] arr = A.toCharArray();

    public static void main(String[] args) {
        if(isPalindrom(arr) || A.length()==1)
            System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isPalindrom(char[] a) {
        boolean _Palindrom = false;
        if (A.length() % 2 == 0) {
            for (int i = 0; i < A.length() / 2 - 1; ++i) {
                if (arr[i] != arr[A.length() - i - 1]) {
                    return false;
                } else
                    _Palindrom = true;
            }
        } else {
            for (int i = 0; i < (A.length() - 1) / 2 - 1; ++i) {
                if (arr[i] != arr[A.length() - i - 1]) {
                    return false;
                } else _Palindrom = true;
            }
        }
        return _Palindrom;
    }
}




