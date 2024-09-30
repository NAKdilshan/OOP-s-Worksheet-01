import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        double cm_value = 0;
        int feet_value  ;
        float inches_value = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the centimeter value: ");
        cm_value = scanner.nextDouble();
        double inter_inch = (cm_value / 2.54);
        feet_value = (int)inter_inch / 12;
        inches_value = (float)inter_inch % 12;
        System.out.println(cm_value + " with feet " + feet_value);
        System.out.printf(cm_value + " with inches " + "%.2f%n" , inches_value);

    }
}
