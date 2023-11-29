package sec.week9.Q1;

public class Person {
    private String name;
    private String address;
    private int phone_number;
    private String email;
    
    public Person(String name, String address, int phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", phone_number=" + phone_number + ", email=" + email
                + "]";
    }
    
}
