import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Type your name: ");
      String name = scanner.next();

      System.out.println("Type your surname: ");
      String surname = scanner.next();

      System.out.println("Type your age: ");
      int age = scanner.nextInt();

      System.out.println("Type your height: ");
      double height = scanner.nextDouble();

      System.out.println("Hello, my name is: " + name.toUpperCase() + " " + surname);
      System.out.println("I'm " + age + "years old");
      System.out.println("My height is:" + height);
      scanner.close();
    } catch (InputMismatchException e) {
      System.out.println("The age and height fields must be numeric.");
    }
  }
}