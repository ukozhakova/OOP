package First;

public class Cylinder extends Shapes3D {
    private double radius;
    private double height;
    Cylinder(){};
    Cylinder(double radius, double height){
        this.height= height;
        this.radius= radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }


    public double surfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }


    public double volume() {
        return Math.PI*radius*radius*height;
    }
    public String toString() {
        return "For Cylinder: Volume is "+volume()+ ", surface area is "+ surfaceArea();
    }
}
