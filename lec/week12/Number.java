package lec.week12;

public class Number implements Calculation {

    private int numerator,denomintor;
    

    
    public Number(int numerator, int denomintor) {
        this.numerator = numerator;
        this.denomintor = denomintor;
    }

    public Number() {
        this(0,1);
    }
    

    @Override
    public boolean equals(Object o){
        if (this == o ){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Number [numerator/denomintor=" + numerator/denomintor + "]";
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomintor() {
        return denomintor;
    }

    public void setDenomintor(int denomintor) {
        this.denomintor = denomintor;
    }

    @Override
    public void resetNumber() {
        this.numerator = 0;
       this.denomintor = 1;
    }
    
}
