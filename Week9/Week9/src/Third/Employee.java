package Third;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person {
        private double salary;
        private Date hireDate;
        private String insuranceNumber;

        Employee() {
            super();
            this.hireDate= null;
            this.salary = 0;
            this.insuranceNumber = "notYet";
        }

        Employee(String name, double salary, String insuranceNumber) {
            super(name);
            this.salary = salary;
            this.hireDate = new Date();
            this.insuranceNumber = insuranceNumber;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return this.salary;
        }
        public Date getHireDate(){return this.hireDate;}
        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public int compareTo(Object o) {
            Employee e2= (Employee)o;
            if(e2.salary==this.salary) return 0;
            else if(this.salary>e2.salary) return 1;
            return -1;
        }

        public boolean equals(Object o) {
            Employee e=(Employee)o;
            return (this.salary == e.salary && this.hireDate.equals(e.hireDate) && this.insuranceNumber.equals(e.insuranceNumber));
        }

        public String toString() {
            return super.toString()+ ", Salary: " + this.salary + ", hire Date: " + this.hireDate + ", insurance number: " + this.getInsuranceNumber();
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.getName(), this.salary, this.hireDate, this.getInsuranceNumber());
        }

    @Override
    public Employee cloneDeep() throws CloneNotSupportedException {
            Employee e=(Employee)super.clone();
            e.salary= this.salary;
            e.insuranceNumber= this.insuranceNumber;
            e.hireDate= this.hireDate;
            System.out.print("Clone Deep: ");
            return e;
        }

    @Override
    public Employee cloneShallow() throws CloneNotSupportedException {
            Employee e= this;
            System.out.print("Clone Shallow: ");
            return e;
    }
}
