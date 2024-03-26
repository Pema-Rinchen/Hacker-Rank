import java.util.Scanner;
public class JavaStdinAndStdout2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int integer=input.nextInt();
        double num=input.nextDouble();
        input.nextLine(); // to consume the newline character left in buffer by
        String str=input.nextLine();
        System.out.println("String: "+ str);
        System.out.println("Double: "+num);
        System.out.println("Int: "+integer);
        
    }
}
