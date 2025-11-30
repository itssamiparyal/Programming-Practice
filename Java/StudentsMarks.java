// // import java.util.Scanner;
// // public class StudentsMarks{
// //     public static void main(String[] args){

// //         Scanner object = new Scanner(System.in);
// //         String[] names = new String[3];
// //         int[][] marks = new int[3][3];
// //         for(int i = 0; i<3; i++){
// //             System.out.println("Enter student's name: ");
// //             names[i] = object.nextLine();
            
// //             for(int k = 0; k<3; k++){
// //                 System.out.println("Enter marks for " + names[i]);
// //                 marks[i][k] = object.nextInt();
// //             }
// //         }

// //     }
// // }
        
        
// import java.util.Scanner;

// class StudentsMarks {
//     public static void main(String arg[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of students: ");
//         int numStudents = scanner.nextInt();
//         String names[] = new String[numStudents];
//         int marks[] = new int[numStudents];
//         char sections[] = new char[numStudents];
//         String[] subjects = {"math","Science","english"};
//         int length = subjects.length;

//         for(int i = 0; i < numStudents; i++) {
//             System.out.print("Enter name of student " + (i+1) + ": ");
//             names[i] = scanner.next();
//             System.out.print("Enter section of student " + (i+1) + ": ");
//             sections[i] = scanner.next().charAt(0);
//             for(int j =0; j<length; i++){
//                 System.out.print("Enter marks of student " + (i+1) + " in " +subjects[i]+ ": ");
//                 marks[i] = scanner.nextInt();
//             }
//         }

//         for(int i = 0; i < names.length; i++) {
//             System.out.println(names[i] + " in section " + sections[i] + " got " + marks[i] + " marks.");
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class StudentsMarks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int numStudents = scanner.nextInt();

    String[] studentNames = new String[numStudents];
    int[][] subjectMarks = new int[numStudents][3];

    for (int i = 0; i < numStudents; i++) {
      System.out.println("Enter details for student " + (i + 1));

      System.out.print("Name: ");
      studentNames[i] = scanner.next();

      System.out.print("Subject 1: ");
      subjectMarks[i][0] = scanner.nextInt();

      System.out.print("Subject 2: ");
      subjectMarks[i][1] = scanner.nextInt();

      System.out.print("Subject 3: ");
      subjectMarks[i][2] = scanner.nextInt();
    }

    System.out.println("\nStudent Details:");
    for (int i = 0; i < numStudents; i++) {
      System.out.println(studentNames[i] + ":");
      System.out.println("Subject 1: " + subjectMarks[i][0]);
      System.out.println("Subject 2: " + subjectMarks[i][1]);
      System.out.println("Subject 3: " + subjectMarks[i][2]);
    }

    scanner.close();
  }
}