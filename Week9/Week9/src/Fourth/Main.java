package Fourth;

public class Main {
    public static void main(String[] args){
        Car c= new Car(200);
        c.move();
        System.out.println(c.getLocation()+ c.InitialLoc);
    }
}
