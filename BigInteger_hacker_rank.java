import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_hacker_rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1, num2;
        num1 = sc.nextBigInteger();
        num2 = sc.nextBigInteger();

        System.out.println("Sum of BigInteger numbers is : " + num1.add(num2));
        System.out.println("Multiplication of BigInteger numbers is : " + num1.multiply(num2));
    }
}
