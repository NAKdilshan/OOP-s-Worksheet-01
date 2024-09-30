// Question 05

import java.util.Scanner;
    class Circle{
        float ri;
        float ro;
        public void setRadius(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the inner radius: ");
            ri = scanner.nextFloat();
            System.out.print("Enter the outer radius: ");
            ro = scanner.nextFloat();

        }
        public void computeArea(){
            double inner_area = 3.14 * ri * ri;
            double outer_area = 3.14 * ro * ro;
            double circular_region = outer_area - inner_area;
            System.out.println("The more circular region: " + circular_region);
        }
        public void computeCircumference(){
            double inner_circumference = 2 * 3.14 * ri;
            double outer_circumference = 2 * 3.14 * ro;
            System.out.printf("The circumference of inner circle: " + "%.2f%n",inner_circumference);
            System.out.printf("The circumference of outer circle: " + "%.2f%n",outer_circumference);
        }
}
public class Main {

            public static void main(String[] args) {
            Circle detail = new Circle();
            detail.setRadius();
            detail.computeArea();
            detail.computeCircumference();
        }
}




