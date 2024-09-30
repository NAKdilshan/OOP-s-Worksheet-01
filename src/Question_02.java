import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter f_name: ");
        String f_name = scanner.next();
        System.out.print("Enter m_name: ");
        String m_name = scanner.next();
        System.out.print("Enter l_name: ");
        String l_name = scanner.next();

        String m_first = m_name.substring(0,1);
        System.out.println(l_name + "," + " " + f_name + " " + m_first +"." );

    }
}
