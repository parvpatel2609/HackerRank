import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Java_Abstract_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());              //title name : A tale of two cities
        sc.close();
    }
}
