import java.util.Scanner;
public class Solution3{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enetr your num");
        int num=input.nextInt();
        double num2=input.nextDouble();
        input.nextLine();
        System.out.println("enetr you name");
        String name=input.nextLine();
        System.out.println("String: "+name);
        System.out.println("Double: "+num2);
        System.out.println("Int: "+ num);
    }
}