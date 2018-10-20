package Second;

public class Main {
    public static void main(String[] args){
        Cat catImp= new Cat("black", "ABC");
        Cat cat2= new Cat("black", "ABC");
        CatExtended catExt= new CatExtended("black", "CBA");
        if(catImp.compareTo(cat2)>=0) System.out.println("These cats have same name");
        else System.out.println("These cats have different name");
        System.out.println(catExt.toString());
        System.out.println(catImp.toString());
    }
}
