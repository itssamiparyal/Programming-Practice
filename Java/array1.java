import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
        input.close();
    }
}
