/* 
NoteBook
properties/ attribute(variable)
1> size of page
2> color
4> company
5> number of pages 
behaviour(function)
1> calculating price based on numper of pages and company.
*/ 
import java.util.Scanner;

class NoteBook{
    String company;
    int numberOfPages;
    String pageSize;
    String notebookSize;
    NoteBook(int numberOfPages, String pageSize, String company, String notebookSize) {
        this.company = company;
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
        this.notebookSize = notebookSize;
    }

    double calculatePrice() {
        double basePrice = 5.0; 
        double sizeMultiplier = getSizeMultiplier(); 
        double companyMultiplier = getCompanyMultiplier();
        double notebookSize = getNotebookSize(); 
        return basePrice * sizeMultiplier * companyMultiplier * numberOfPages * notebookSize;
    }
    double getNotebookSize(){
        double multiplier = 0.5;
        if(notebookSize.toLowerCase() == "l"){
            multiplier = 0.5;
        }
        else if(notebookSize.toLowerCase() == "m"){
            multiplier = 0.25;
        }
        else if(notebookSize.toLowerCase() == "s"){
            multiplier = 0.1;
        }
        return multiplier;
    }

    double getSizeMultiplier() {
        double multiplier = 1.0;
        switch (pageSize.toLowerCase()) {
        case "a4":
            multiplier = 1.0;
            break;
        case "a3":
            multiplier = 1.2;
            break;
        case "a2":
            multiplier = 1.5;
            break;
        }
        return multiplier;
    }
                
    double getCompanyMultiplier() {
        double multiplier = 1.0;
        switch (company.toLowerCase()) {
            case "1":
                multiplier = 1.2;
                break;
            case "2":
                multiplier = 1.5;
                break;
            case "3":
                multiplier = 1.7;
                break;
                    
        }
        return multiplier;
    }

}

class oop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of pages: ");
        int numberOfPages = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter page size (e.g., A4, A3, A2): ");
        String pageSize = input.nextLine();
        System.out.print("Enter company name: ");
        String company = input.nextLine();
        System.out.print("Enter Notebook size(S, L , M): ");
        String notebookSize = input.nextLine();

        NoteBook notebook = new NoteBook(numberOfPages, pageSize, company ,notebookSize);
        double price = notebook.calculatePrice();
        System.out.println("The price of the notebook is: $" + price);
        input.close();
    }

}

