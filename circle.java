import java.util.Scanner;

public class circle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nPlease enter a diameter: ");
    double diameter = in.nextDouble();
    double area = Math.PI * Math.pow((diameter/2), 2);
    System.out.printf("\nThe area of a circle with a diameter of %.1f", diameter);
    System.out.printf(" is %.1f.\n", area);
    in.close();
  }
}
