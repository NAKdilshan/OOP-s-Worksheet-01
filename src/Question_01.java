import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name ;
        name = scanner.next();
        System.out.println(name.length());
        int letters = name.length() / 2;
        if(!(name.length() / 2 == 0) ){
            System.out.println("The word center charactor is " + name.substring((letters),(letters+1)) );


        }
        else
            System.out.println("It's not a odd characters of letter");
    }
}
