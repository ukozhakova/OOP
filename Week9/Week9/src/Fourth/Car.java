package Fourth;

public class Car implements Initializable {
    private int location;
    Car(){}
    Car(int location){this.location=location;}
    public void setLocation(int location){this.location=location;}
    public int getLocation(){return this.location;}

    @Override
    public void move() {
        location+=200;
    }
}