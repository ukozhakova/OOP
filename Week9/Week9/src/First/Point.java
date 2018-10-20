package First;

public class Point implements Shape3D {
    private int x,y,z;
    Point(){}
    Point(int x, int y, int z){this.x=x; this.y=y; this.z=z;}

    @Override
    public double surfaceArea() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
    public void Move(int dx, int dy, int dz){x+=dx; y+=dy; z+=dz;}

    @Override
    public String toString() {
        return "For Point: X is "+this.x+", Y is "+this.y+", Z is "+this.z;
    }
}
