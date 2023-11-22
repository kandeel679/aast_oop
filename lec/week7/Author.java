public class Author {
    public String name;
    public int ssn;
    public Book[] list;
    public int totalBooks;
    public double totalPrices;
    // Constructor
    public Author(String name, int ssn, Book[] list) {
        this.name = name;
        this.ssn = ssn;
        this.list = list;
        this.totalBooks = list.length;
        calcTotal();
        
    }
    public void calcTotal(){
        for (int i = 0; i < this.list.length; i++) {
            this.totalPrices+=list[i].price;
        }
    }
    
    
    
}
