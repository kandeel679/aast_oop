package lab.week5;

public class st {
    static int s = 0;
    int i = 0;
    public st(){
        s++;
        i++;
    }
    public static void main(String[] args) {
        st obj1 = new st();
        st obj2 = new st();
        System.out.println(obj1.s + "\n" + obj1.i);
        System.out.println(obj2.s + "\n" + obj2.i);
        
        System.out.println(st.s);

    }
}
