package Third;
import java.util.Date;
import java.util.Vector;
public class Manager extends Employee {
    private double bonus;
    private Vector<Employee> team;
    public Manager(){
        super();
        this.bonus=0;
        this.team=new Vector<>();
    }
    public Manager(String name, double salary, String insuranceNumber, double bonus){
        super(name, salary, insuranceNumber);
        this.bonus=bonus;
        this.team=new Vector<>();
    }
    public void addEmployee(Employee newEmp){
        team.add(newEmp);
    }
    public String  getTeam(){
        return this.team.toString();
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getBonus(){
        return this.bonus;
    }
    public boolean equals(Object o){
        Manager m=(Manager)o;
        if(super.equals(o)&& this.bonus==m.getBonus() && this.team.toArray().equals(m.team.toArray())) return true;
        return false;
    }
    @Override
    public int compareTo(Object o) {
        Manager m=(Manager)o;
        if(super.compareTo(o)==0) {
            if(this.bonus==m.bonus) return 0;
            else if(this.bonus>m.bonus) return 1;
            else return -1;
        }
        else return super.compareTo(m);
    }

    @Override
    public Manager cloneShallow() throws CloneNotSupportedException {
        Manager e=this;
        System.out.print("Clone Shallow: ");
        return e;
    }

    @Override
    public Manager cloneDeep() throws CloneNotSupportedException {
        Manager e= (Manager) super.cloneDeep();
        e.team= (Vector)this.team.clone();
        e.bonus= this.bonus;
        return e;
    }

    public String toString(){
        return super.toString()+", bonus: "+this.bonus+", team consists of "+this.getTeam()+" members";
    }
}
