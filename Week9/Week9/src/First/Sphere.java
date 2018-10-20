package First;

public class Sphere implements Shape3D {
    private double radius;
    Sphere(){}
    Sphere(double radius){this.radius=radius;}
    public void setRadius(double radius){this.radius=radius;}

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }

    @Override
    public double surfaceArea() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "For sphere: Volume is "+volume()+ ", surface area is "+ surfaceArea();
    }
}
