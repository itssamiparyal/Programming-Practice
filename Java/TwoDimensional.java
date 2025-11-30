public class TwoDimensional{
    public static void main(String[] args){
        int[][] numbers = new int[3][2];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<2; j++){
                numbers[i][j] = (i+1) * (j+1);
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<2; j++){
                System.out.print(numbers[i][j]);
                System.out.print("  ");
                if(j == 1){
                    System.out.println("");
                }
            }
        }
        
    }
}