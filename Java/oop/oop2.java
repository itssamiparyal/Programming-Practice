// package oop;

// import java.util.Scanner;

// public class oop2 {
//     class Notebook {
//         private int numberOfPages;
//         private String pageSize;
//         private String company;
    
//         public Notebook(int numberOfPages, String pageSize, String company) {
//             this.numberOfPages = numberOfPages;
//             this.pageSize = pageSize;
//             this.company = company;
//         }
    
//         public double calculatePrice() {
//             double basePrice = 5.0; // Base price for all notebooks
//             double sizeMultiplier = getSizeMultiplier(); // Multiplier based on page size
//             double companyMultiplier = getCompanyMultiplier(); // Multiplier based on company
    
//             return basePrice * sizeMultiplier * companyMultiplier;
//         }
    
//         private double getSizeMultiplier() {
//             double multiplier = 1.0;
//             switch (pageSize.toLowerCase()) {
//                 case "a4":
//                     multiplier = 1.0;
//                     break;
//                 case "a3":
//                     multiplier = 1.2;
//                     break;
//                 case "a2":
//                     multiplier = 1.5;
//                     break;
//                 // Add more cases for other page sizes if needed
//             }
//             return multiplier;
//         }
    
//         private double getCompanyMultiplier() {
//             double multiplier = 1.0;
//             if (company.equalsIgnoreCase("company1")) {
//                 multiplier = 1.2;
//             } else if (company.equalsIgnoreCase("company2")) {
//                 multiplier = 1.5;
//             }
//             // Add more conditions for other companies if needed
//             return multiplier;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

    
//         System.out.print("Enter number of pages: ");
//         int numberOfPages = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         System.out.print("Enter page size (e.g., A4, A3, A2): ");
//         String pageSize = scanner.nextLine();

        
//         System.out.print("Enter company name: ");
//         String company = scanner.nextLine();

//         // Create Notebook object
//         Notebook notebook = new Notebook(numberOfPages, pageSize, company);

//         // Calculate and display price
//         double price = notebook.calculatePrice();
//         System.out.println("The price of the notebook is: $" + price);

//         scanner.close();
        
//     }
// }
