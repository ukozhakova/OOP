import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String IPnumber = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = IPnumber + "." +  IPnumber + "." +  IPnumber + "." + IPnumber;
}