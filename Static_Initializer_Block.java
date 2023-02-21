import java.util.Scanner;

public class Static_Initializer_Block {
    public static void main(String[] args) {
        int breadth,height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth : ");
        breadth = sc.nextInt();
        System.out.print("Enter the height : ");
        height = sc.nextInt();
        if(breadth>0 && height>0){
            double area = breadth*height;
            System.out.println((int) area);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
