import java.util.Scanner;

public class Java_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String str = S.substring(start,end);
        System.out.println(str);
    }
}
