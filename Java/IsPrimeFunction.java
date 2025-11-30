import java.util.Scanner;
class isPrime{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = object.nextInt();
        System.out.println("Is prime? " + checkPrime(number));
        object.close();

    }
    static boolean checkPrime(int check){
        boolean isPrime=true;
        boolean result;
        for (int i=2;i<check;i++){
            if(check%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            result = true;
        }
        else{
            result = false;
        }
    return result;
    }
}