import java.util.concurrent.ThreadLocalRandom;

public class WhileExample {
  public static void main(String[] args) {
    double allowence = 50.0;

    while (allowence > 0) {
      Double candyPrice = randomValue();

      if (candyPrice > allowence)
        candyPrice = allowence;

      System.out.println("Candy price: " + candyPrice);
      allowence = allowence - candyPrice;
    }
    System.out.println("Allowence" + allowence);
    System.out.println("John spent all your allowence.");

  }

  private static double randomValue() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}
