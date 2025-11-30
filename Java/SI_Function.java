import java.util.Scanner;
class SI_Function{
    public static void main(String[] args){
        float principle, time, rate;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        principle = object.nextFloat();
        System.out.println("Enter Time: ");
        time = object.nextFloat();        
        System.out.println("Enter rate: ");
        rate = object.nextFloat();
        System.out.println("Simple interest = "+ si(principle,time,rate));
        object.close();
    }
    static float si(float p,float t,float r){
        return (p*t*r)/100;
    }
}