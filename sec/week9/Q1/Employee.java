package sec.week9.Q1;

public class Employee extends Person {
    private String office;
    private double salary;
    private String DateHired;
    Employee(String name,String add,String email,String office,String DateHired,double salary,int phone_number ){
        super(name, add, phone_number, email);
        this.DateHired = DateHired;
        this. office = office;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString()+"+Employee [office=" + office + ", salary=" + salary + ", DateHired=" + DateHired + "]";
    } 

}
