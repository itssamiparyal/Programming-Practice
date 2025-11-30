import java.util.Scanner;
public class YourGrade{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your marks in Maths: ");
        float maths = object.nextFloat();
        System.out.println("Enter your marks in Chemistry: ");
        float chem = object.nextFloat();
        System.out.println("Enter your marks in Physics: ");
        float physics = object.nextFloat();
        System.out.println("Enter your marks in English: ");
        float english = object.nextFloat();
        System.out.println("Enter your marks in Nepali: ");
        float nepali = object.nextFloat();
        System.out.println("Enter your marks in computer: ");
        float computer = object.nextFloat();
        float average = (maths + chem + physics + english + nepali + computer);
        float percentage = (average/600)*100 ;

        if(percentage >= 90){
            System.out.println("A+");
        }
        else if(percentage >= 80){
            System.out.println("A");
        }
        else if(percentage >= 70){
            System.out.println("B+");

        }
        else if(percentage >= 60){
            System.out.println("B");
        }
        else if(percentage >= 50){
            System.out.println("C+");
    
        }
        else{
            System.out.println("YOU FAILED!^!");
        }
        object.close();
    }
}