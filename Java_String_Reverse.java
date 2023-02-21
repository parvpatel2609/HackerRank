import java.util.Scanner;

public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();       //take a string from user
        String B = "";
        int length = A.length();

        for ( int i=length-1 ; i>=0 ; i--){
            B =B + A.charAt(i);
        }

        if(A.equalsIgnoreCase(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
