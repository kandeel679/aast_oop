package lec.assignment;

public class Student {
    private static int count = 0;
    private int id;
    private String name;
    private int totalPoints;
    private double gpa;
    private char []arrayOfGrades;
    
    public Student(String name){
        this.name=name;
        this.totalPoints = 0;
        this.gpa = 0.0;
        this.id =++count;
        this.arrayOfGrades = new char[3];
    }
    public int getTotalPoints() {
        return totalPoints;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addGrade(char grade) {
        for (int i = 0; i < arrayOfGrades.length; i++) {
            if (arrayOfGrades[i] == '\u0000') {
                arrayOfGrades[i] = grade;
                break;
            }
        }
    }
    public void calculatePoints(){
        for (char grade : arrayOfGrades) {
            switch (grade) {
                case 'A':
                    totalPoints += 12;
                    break;
                case 'B':
                    totalPoints += 11;
                    break;
                case 'C':
                    totalPoints += 10;
                    break;
                case 'D':
                    totalPoints += 9;
                    break;
                case 'F':
                    totalPoints += 0;
                    break;
                default:
                    break;
            }           
        }
    }
    public double calculateGPA() {
        gpa = (double)totalPoints / 9;
        return gpa;
    }  
    
}
