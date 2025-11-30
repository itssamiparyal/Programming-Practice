import java.util.Scanner;
public class CalculatorMaybe{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number first, then the operator whose operation you want to perfrom and the last number after that");
        int a = object.nextInt();
        System.out.println(" ");
        char b = object.next().charAt(0);
        System.out.println(" ");
        int c = object.nextInt();
        if('+'== b){
            System.out.println(a + c);

        }
        else if('-'== b){
            System.out.println(a - c);
        }
        else if('*'== b){
            System.out.println(a * c);
        }
        else if('/'== b){
            System.out.println(a / c);
        }
        object.close();
    }
}