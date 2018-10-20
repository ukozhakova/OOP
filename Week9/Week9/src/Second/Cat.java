package Second;

public class Cat implements Comparable {
    private String color;
    private String name;
    Cat(){}
    Cat(String color, String name){this.color=color; this.name= name;}
    public void setColor(String color){this.color=color;}
    public String getColor(){return this.color;}
    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}

    @Override
    public int compareTo(Object other) {
        Cat cat2= (Cat)other;
        return this.name.compareTo(cat2.name);
    }

    @Override
    public String toString() {
        return "CatImplemented's name: "+getName()+", color: "+getColor();
    }
}
