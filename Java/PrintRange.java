import java.util.Scanner;
public class PrintRange{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lower = object.nextInt();
        System.out.println("Enter upper limit: ");
        int upper = object.nextInt();
        while(lower<=upper){
            if(isPrime(lower)){
                System.out.println(lower);
            }
            lower += 1;
        }
        object.close();   
    }
    static boolean isPrime(int number){
        for(int i = 2; i<number;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
        
    }
}