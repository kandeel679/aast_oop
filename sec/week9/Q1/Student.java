package sec.week9.Q1;

public class Student extends Person {
    private enum status{
        freshman,sosophomore,junior,senior
    } 
    private status Status;
  public Student(String name,String email,String add,int phone,int s){
        super(name, add, phone, email);
        this.Status = status.freshman;
  }
@Override
public String toString() {
    return super.toString()+"Student [Status=" + Status + "]";
}
}
