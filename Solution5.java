import java.util.Scanner;
public class Solution5{
    public static void main(String [] args){
        System.out.println("enetr your num");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i=1;i<=10;i++){
            int product=i*n;
            System.out.println(n + " x "+i+" = "+product);
        }
    }
}