package First;

public class Main {
    public static void main(String[] args){
        Cube cube= new Cube(4);
        Cylinder cylinder= new Cylinder(2,3);
        Point point= new Point(2,3,5);
        point.Move(5,5,5);
        Sphere sphere= new Sphere(5);
        System.out.println(cube.toString());
        System.out.println(point.toString());
        System.out.println(cylinder.toString());
        System.out.println(sphere.toString());
    }
}
