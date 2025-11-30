import java.util.Scanner;
public class GradeConverter{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your numerical grade: ");
        int grade = object.nextInt();
        
        if(grade>=90 && grade <=100){
            System.out.println("A");
        }
        else if(grade>=80 && grade<90){
            System.out.println("B");
        }
                else if(grade>=70 && grade<80){
            System.out.println("C");
        }
                else if(grade>=60 && grade<70){
            System.out.println("D");
        }
                else if(grade>=50 && grade<60){
            System.out.println("E");
        }
        object.close();
    }
}