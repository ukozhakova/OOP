package Second;

public class CatExtended extends Animal {
    private String color;
    private String name;
    public CatExtended(){}
    public CatExtended(String color, String name){this.color= color; this.name= name;}
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "CatExtended's name: "+getName()+ ", color: "+getColor();
    }
}
