import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        String C = A.concat(B);
        int num = C.length();
        System.out.println(num);
        int greater = A.compareTo(B);
        if(greater>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}