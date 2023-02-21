import java.util.Scanner;

public class Java_output_formatting {
    public static void printsp(int len){

        for(int i=0; i<len; i++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String x1 = Integer.toString(x);
            //Complete this line
            System.out.print(s1);
            printsp(15-s1.length());

            if(x1.length() == 3){
                System.out.println(x1);
            }
            else if(x1.length() == 2){
                System.out.println("0"+x1);
            }
            else if(x1.length() == 1){
                System.out.println("00"+x1);
            }
        }
        System.out.println("================================");
    }
}
