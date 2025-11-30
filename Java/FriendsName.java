import java.util.Scanner;

public class FriendsName {
    public static void main(String[] args) {
        // declare and initialize an array of strings
        String[] stringArray = new String[5];

        // take string inputs from user and store in the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // display the array
        System.out.println("The strings you entered are:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println((i + 1) + ". " + stringArray[i]);
        }
        scanner.close();
    }
}