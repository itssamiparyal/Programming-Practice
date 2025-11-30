import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int inputValue = inputNum.nextInt();
        int trialNumbers = inputValue;
        int sum = 0;
        String num = String.valueOf(inputValue);
        int length = num.length();
        
        for(int i=0; i < length; i++) {
            int isolatedInt = trialNumbers%10;
            sum = sum + (int) Math.pow(isolatedInt, length );
            trialNumbers = trialNumbers/10;
         


        }


        if(sum==inputValue){
            System.out.println("It is an armstrong number");


        }
        else{
            System.out.println("It is not an armstrong number");
        }
        inputNum.close();
        
    }
}