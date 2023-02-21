import java.util.Scanner;

public class Substring_comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length()-k;

        for(int j=0 ; j<s.length() ; j++){
            char character = s.charAt(length);
            largest += character;
            length++;
        }

        System.out.println(largest);

        for(int i=0 ; i<k ; i++){
            char character = s.charAt(i);
            smallest += character;
        }
        System.out.println(smallest);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
