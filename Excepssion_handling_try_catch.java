import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepssion_handling_try_catch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            int num1,num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1/num2);
        }
        catch(ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            if(e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
    }
}
