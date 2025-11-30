// import java.util.Scanner;
// public class Test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the start of the range: ");
//         int LRange = scanner.nextInt();

//         System.out.print("Enter the end of the range: ");
//         int URange = scanner.nextInt();

//         scanner.close();

//         for (int i = LRange; i <= URange; i++) {
//             if (isPrime(i)) {
//                 System.out.println(i);
//             }
//         }
//     }
//     static boolean isPrime(int num) {
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = object.nextInt();
        System.out.print("Enter upper limit: ");
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