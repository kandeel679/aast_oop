public class Book {
    public String Tital;
    public int year;
    public double price;
    public Book(String Tital){
        this.Tital = Tital;
        this.year = 2010;
        this.price = 1500;
    }
    public Book(String Tital, int year, double price) {
        this.Tital = Tital;
        if (!(year >= 2000 && year <=2020)) {
            System.out.println("invalid input: setting the default values");
            this.year = 2010;
        }else{this.year= year;}
        
        if (price < 0) {
            System.out.println("invalid input: setting the default values");
            this.price = 1500;
        }else{this.price = price;}
    }
}

