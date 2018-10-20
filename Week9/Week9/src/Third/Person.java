package Third;

import java.util.Objects;

class Person implements Cloneable{
    private String name;
    public Person(){
        this.name="Unknown";
    }
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Object o){
        Person p2= (Person)o;
        if(this.name.equals(p2.name))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    public Person cloneShallow() throws CloneNotSupportedException{
        Person p=this;
        System.out.print("Clone Shallow: ");
        return p;
    }
    public Person cloneDeep() throws CloneNotSupportedException{
        Person p= new Person();
        p.name=this.name;
        System.out.print("Clone Deep: ");
        return p;
    }
    public String toString(){
        return "His name is "+name;
    }
}