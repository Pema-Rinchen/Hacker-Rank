import java.util.Scanner;
public class JavaIfElse{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number%2==0){
            if (number>2 && number<=5){
                System.out.println("Not Weird");
            }
            else if(number>6 && number<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    }
}
