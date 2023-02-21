import java.util.Scanner;

class Node_Stack{
    String value;
    Node_Stack next;

    public Node_Stack(String value) {
        this.value = value;
    }
}

class Stacks {
    Node_Stack top;
    int length_stack=0;

    public void push(Stacks s1, String element){
        Node_Stack n1 = new Node_Stack(element);

        if(top==null){
            top=n1;
//            s1.disp(s1);
            length_stack++;
//            System.out.println("After adding if condition : " + "Length : " + s1.length_stack);
        }

        else {
            n1.next=top;
            top = n1;
//            s1.disp(s1);
            length_stack++;
//            System.out.println("After adding if condition : Length : " + s1.length_stack);
        }
    }

    public boolean isEmpty(Stacks s2){
        if(s2.top == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int length(Stacks s3){
        return length_stack;
    }

    public void pop(Stacks s5){

        if(length_stack==0){
//            System.out.println("Stack is empty...");
//            System.out.println("After popping if : " + "Lenght of the stack : " + s5.length_stack);
        }
        else{
            top = top.next;
//            s5.disp(s5);
            length_stack--;
//            System.out.println("After popping else : Lenght of the stack : " + s5.length_stack);
        }
    }

    public String peek(Stacks s1){
        return top.value;
    }

    public void disp(Stacks s4){
        Node_Stack temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}


public class Stacks_main {

    public static boolean isBalanced(String str){
        boolean flag = false;
        String top_string;
        char top_char = '0';

        Stacks s1 = new Stacks();

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s1.push(s1, String.valueOf(str.charAt(i)));
            }

            if(str.charAt(i)==')'){
                if(s1.length_stack!=0){
                    top_string = s1.top.value;
                    top_char = top_string.charAt(0);
                    if(top_char == '('){
                        s1.pop(s1);
                    }
                }
                else{
                    s1.push(s1,String.valueOf(str.charAt(i)));
                }
            }

            if(str.charAt(i)=='}' ){
                if(s1.length_stack!=0){
                    top_string = s1.top.value;
                    top_char = top_string.charAt(0);
                    if(top_char =='{'){
                        s1.pop(s1);
                    }
                }
                else{
                    s1.push(s1,String.valueOf(str.charAt(i)));
                }
            }

            if(str.charAt(i)==']'){
                if(s1.length_stack!=0){
                    top_string = s1.top.value;
                    top_char = top_string.charAt(0);
                    if(top_char =='['){
                        s1.pop(s1);
                    }
                }
                else{
                    s1.push(s1,String.valueOf(str.charAt(i)));
                }
            }
        }

        if(s1.isEmpty(s1)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str;
        while(sc.hasNextLine()){
            str = sc.next();
            System.out.println(isBalanced(str));
        }

    }
}
