import java.util.Scanner;
public class TheGreaterOne{
    public static void main(String[] args){
        Scanner object  = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = object.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = object.nextInt();

        if(true){
            if(firstNumber > secondNumber){
                System.out.println("First number is greater");}
            if(secondNumber > firstNumber){
                System.out.println("Second number is greater");
            }
            }
            object.close();
        }
        

}
