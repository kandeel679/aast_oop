package sec.week9.Q1;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;
    
    public Faculty(String name, String add, String email, String office, String DateHired, double salary,
            int phone_number, String officeHours, String rank) {
        super(name, add, email, office, DateHired, salary, phone_number);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +"Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
    }
}
