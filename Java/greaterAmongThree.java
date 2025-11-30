import java.util.Scanner;
public class greaterAmongThree{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);

        System.out.println("Enter A: ");
        int A = number.nextInt();

        System.out.println("Enter B: ");
        int B = number.nextInt();

        System.out.println("Enter C: ");
        int C = number.nextInt();

        if (A>B & A>C) {
            System.out.println("A is greater");
        }
        else if(B>C & B>A) {
            System.out.println("B is greater");
        }

        else{
            System.out.println("C is greater");
        }
        number.close();
    }

}