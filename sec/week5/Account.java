package sec.week5;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date dataCreated;
    private double annuallntereRate;
    public Account(int id,double balance,double annuallntereRate ){
        this.id = id;
        this.balance = balance;
        this.annuallntereRate = annuallntereRate;
        this.dataCreated = new Date();
    }
    public Account(){
        this(0,0,0);
        this.dataCreated = new Date();
    }
    
    // geters and seters
        //  geters
        public Date getDate(){
            return this.dataCreated;
        }
        public double getId(){
            return this.id;
        }
        public double getBalance(){
            return this.balance;
        }
        public double getAnnuallntereRate(){
            return this.annuallntereRate;
        }
        //seters
        public void setId(int id){
            this.id = id;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public void setAnnuallntereRate(double annuallntereRate){
            this.annuallntereRate = annuallntereRate;
        }

    //methods
        public double getMonthlyInterstRate(){
            return annuallntereRate/12 ;
        }
        public double getMonthlyInterst(){
            return (this.balance)*(getAnnuallntereRate()/100); 
        }
        public void withdraw(double b){
            if (this.balance >= b) {
                this.balance -= b;
            }
            else{
                System.out.println("Not enough money in balance");
            }
        }
        public void deposit(double b){
            this.balance += b;
 
        }
        @Override
        public String toString() {
            return "Account [id=" + id + ", balance=" + balance + ", dataCreated=" + dataCreated + ", annuallntereRate="
                    + annuallntereRate + "]";
        }

}
