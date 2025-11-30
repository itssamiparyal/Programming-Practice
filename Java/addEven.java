public class addEven{
    public static void main(String[] args){
        int[] even = new int[50];
        int index = 0;
        for(int i=1; i<=100; i++){
            if (i%2==0){
                even[index]=i;
                index++;
            }
        }
        for (int i=0; i<50; i++){
            System.out.println(even[i]);
        }
    }
}