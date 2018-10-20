package Third;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p= new Person("Kang");
        Person pCloneDeep= p.cloneDeep();
        System.out.println(pCloneDeep.toString());
        Person pCloneShallow= p.cloneShallow();
        p.setName("EuiGon");
        System.out.println(pCloneShallow.toString());
        System.out.print("Origin: ");
        System.out.println(p.toString());
        System.out.println("***********************************");
        Employee e= new Employee("Daniel", 1111, "wannaOne");
        Employee eCloneDeep= e.cloneDeep();
        System.out.println(eCloneDeep.toString());
        Employee eCloneSh= e.cloneShallow();
        e.setInsuranceNumber("NewMMO");
        System.out.println(eCloneSh.toString());
        System.out.print("Origin: ");
        System.out.println(e.toString());
        System.out.println("***********************************");
        Manager m= new Manager("Lullaby", 10000, "Got7",23);
        Manager m2= new Manager("KissAndMakeUp", 10000, "BP", 22);
        Manager mCloneDeep= m.cloneDeep();
        System.out.println(mCloneDeep.toString());
        Manager mCloneSh= m.cloneShallow();
        m.setInsuranceNumber("NewEra");
        System.out.println(mCloneSh.toString());
        System.out.print("Origin: ");
        System.out.println(m.toString());
        if(m.compareTo(m2)>0) System.out.println("Manager "+ m.getName()+" gets more money than Manager "+ m2.getName());
        else if(m.compareTo(m2)<0) System.out.println("Manager"+ m2.getName()+" gets more money than "+ m.getName());
        else if(m.compareTo(m2)==0) System.out.println("Their salary are equal");
    }
}
