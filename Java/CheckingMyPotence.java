import java.util.Scanner;

public class CheckingMyPotence {
    public static void main(String[] args){
        Scanner userEntered = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int userEnteredNumber = userEntered.nextInt();
        int decoyUserInput, lengthOfUserInput;
        lengthOfUserInput = (String.valueOf(userEnteredNumber)).length();
        int sum = 0;

        decoyUserInput = userEnteredNumber;

        for(int i = 0; i< lengthOfUserInput; i++){
            int remainder = decoyUserInput%10;
            sum = sum + (int) Math.pow(remainder,lengthOfUserInput);
            decoyUserInput = decoyUserInput/10;
         }

        if(sum == userEnteredNumber){
            System.out.println("Its an Armstrong!!");
        }
        else{
            System.out.println("Its not an Armstrong number!xD");
            
        }
        userEntered.close();
    }
}