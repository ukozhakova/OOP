import java.util.Scanner;
class StarTriangle{
    int width;
    StarTriangle(int width){this.width=width;}
    public String toString(){
        String res="";
        for(int i=1; i<=this.width;++i){
            for(int j=0; j<i; ++j){
                res+="[*]";
            }
            res+="\n";
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StarTriangle small= new StarTriangle(4);
        System.out.println(small.toString());

    }
}
