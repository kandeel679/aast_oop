package sec.week10_11.supermarket;

public class Address {
    private String city;
    private String street;
    private String building;
    private String phonenmber;
    
    @Override
    public String toString() {
        return "Address [city=" + city + ", street=" + street + ", building=" + building + ", phonenmber=" + phonenmber
                + "]";
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getPhonenmber() {
        return phonenmber;
    }
    public void setPhonenmber(String phonenmber) {
        this.phonenmber = phonenmber;
    }
}
