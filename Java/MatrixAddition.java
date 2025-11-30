import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args){
        int[][] matrix1 = new int[3][2];
        int[][] matrix2 = new int[3][2];
        int[][] matrix3 = new int[3][2];
        Scanner object = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2; k++){
                System.out.println("First matrix, a"+ i +k);
                matrix1[i][k] = object.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2; k++){
                System.out.println("Second matrix, a"+ i +k);
                matrix2[i][k] = object.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2; k++){
                matrix3[i][k] = matrix1[i][k] + matrix2[i][k] ;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2; k++){
                System.out.print(matrix3[i][k]+ " ");
                if(k==1){
                System.out.println("");
                }
            }
        }       
        object.close();

    }
}