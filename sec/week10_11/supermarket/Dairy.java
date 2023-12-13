package sec.week10_11.supermarket;

import java.time.LocalDate;

public class Dairy extends Item {
    private String brandName;
    private LocalDate expire;
    
    public Dairy(String name, double price, String brandName, LocalDate expire) {
        super(name, price);
        this.brandName = brandName;
        this.expire = expire;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public LocalDate getExpire() {
        return expire;
    }

    @Override
    public String toString() {
        return "Dairy [brandName=" + brandName + ", expire=" + expire + super.toString() +"]";
    }
    
    
}
