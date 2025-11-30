import java.util.Scanner;
class Function{
    public static void main(String[] args){
        int num1, num2;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  name: ");
        name = input.nextLine();
        greet(name);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("The largest nnumber is "+max(num1, num2));
        input.close();
    }
    static void greet(String name){
        System.out.println("Hello "+ name+ " ,Good Afternoon");
    }
    static int max(int n1, int n2){
        return n1>n2?n1:n2;
    }
    

}