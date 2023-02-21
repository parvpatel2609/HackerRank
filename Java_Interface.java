import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int total_sum = 0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                total_sum = total_sum + i;
            }
        }
        return total_sum;
    }
}

public class Java_Interface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
