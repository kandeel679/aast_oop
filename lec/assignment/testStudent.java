package lec.assignment;

public class testStudent {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

         // Add grades and calculate GPA
         student.addGrade('A');
         student.addGrade('B'); 
         student.addGrade('B');
         student.calculatePoints();
 
         // Display the student's GPA and Points
         System.out.println("GPA: " + student.calculateGPA());
         System.out.println("Points: " + student.getTotalPoints());
         
         //output
            // GPA: 3.7777777777777777
            // Points: 34
    }
}
