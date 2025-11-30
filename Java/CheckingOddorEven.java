import java.util.Scanner;
public class CheckingOddorEven{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int enteredNumber = userInput.nextInt();
        if(enteredNumber % 2 == 0){
        System.out.println("It is an Even Number");
        }
        else{
        System.out.println("It is an odd number");
        }
        userInput.close();
    }
}