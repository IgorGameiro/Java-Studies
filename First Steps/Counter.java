import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first parameter:");
    int firstParameter = scanner.nextInt();
    System.out.println("Enter the second parameter:");
    int secondParameter = scanner.nextInt();

    try {
      count(firstParameter, secondParameter);
    } catch (InvalidParametersException exception) {
      System.out.println(exception.getMessage());
    }

    scanner.close();
  }

  static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
    if (firstParameter > secondParameter) {
      throw new InvalidParametersException("The second parameter must be greater than the first.");
    }

    int count = secondParameter - firstParameter;
    for (int i = 1; i <= count; i++) {
      System.out.println("Printing number " + i);
    }
  }
}
