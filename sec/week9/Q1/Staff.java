package sec.week9.Q1;

public class Staff extends Employee {
     private String title;

    public Staff(String name, String add, String email, String office, String DateHired, double salary,
            int phone_number, String title) {
        super(name, add, email, office, DateHired, salary, phone_number);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [title=" + title + "]";
    }

}
