import java.util.Scanner;
public class StandardDeviationArray{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("The start limit: ");
        int start = object.nextInt();
        System.out.println("The end limit: ");
        int end = object.nextInt();
        int[] even = new int[((end - start)/2) + 1 ];
        int index = 0;
        int sum = 0;
        for(int i=start; i<=end; i++){
            if (i%2==0){
                even[index]=i;
                index++;
            }

        }
        for (int i=0; i<(end - start)/2; i++){
            sum = sum + even[i];
        }
        
        System.out.println("Average = " + sum/50);
        for(int i = 0; i<(end - start)/2; i++){
            System.out.println("Deviation = " + ((sum/50) - even[i]) );
        }
    object.close();
    }
}