import java.util.Scanner;
public class AddTwoNumber{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = object.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = object.nextInt();
        System.out.println("sum: " + (num1 + num2));
        object.close();
    }
}