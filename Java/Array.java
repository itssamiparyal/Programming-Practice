import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        float numbers[] = new float[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.print("Enter number for index "+ i +": ");
            numbers[i] = input.nextInt();
        }
        input.close();
        for(int i = 0 ;i<5; i++){
            System.out.println(numbers[i]);
        }
    }
}

// array is a data structure that stores similar datatype