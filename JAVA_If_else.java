import java.util.Scanner;
public class JAVA_If_else {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N%2!=0)
        {
            System.out.println("Weird");
        }
        if (N%2==0 && 2<=N && N<=5 )
        {
            System.out.println("Not Weird");
        }
        if (N%2==0 && 6<=N && N<=20)
        {
            System.out.println("Weird");
        }
        if (N%2==0 && N>20)
        {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
