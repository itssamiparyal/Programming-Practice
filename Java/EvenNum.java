public class EvenNum{
public static void main(String[] args){
    int[] even = new int[50];
    int index = 0;
    for(int i = 1; i<=100; i++){
        if(i%2==0){
            even[index] = i;
            index++;
        }    
    }

}
}