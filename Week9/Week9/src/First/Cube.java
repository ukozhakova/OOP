package First;

public class Cube implements Shape3D {
    private double edge;
    Cube(){};
    Cube(double edge){this.edge=edge;}
    public void setEdge(double edge){this.edge=edge;}
    public double getEdge(){return this.edge;}

    @Override
    public double volume() {
        return edge*edge*edge;
    }

    @Override
    public double surfaceArea() {
        return 6*edge*edge;
    }

    @Override
    public String toString() {
        return "For Cube: Volume is "+volume()+ ", surface area is "+ surfaceArea();
    }
}
