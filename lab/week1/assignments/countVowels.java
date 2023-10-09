
import java.util.Scanner;
public class countVowels {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String x = input.nextLine();
            int Vcount=0;
            int Ccount = 0;
            for (char c : x.toCharArray()) {
                if ("AEIOUaeiou".indexOf(c) != -1){
                    Vcount++;
                }else if(c!=' '){
                    Ccount++;
                }
            }
            System.out.println("The number of vowels is: " + Vcount);
            System.out.println("The number of consonants  is: " + Ccount);

        }
    
    }
}