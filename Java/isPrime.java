import java.util.Scanner;
class isPrime{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println();
        int number = object.nextInt();
        for (int i=2;i<number;i++){
            if(number%i==0){
                isPrime = false;
                break; 
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite number");
        }
        object.close();   
    }
}