public class For {
  public static void main(String[] args) {
    String students[] = { "John", "Igor", "Guilherme", "Giovanna" };

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i]);
    }

    String teachers[] = { "Vanessa", "Michael", "Mel" };
    for (String teacher : teachers) {
      System.out.println("Teacher's name: " + teacher);
    }
  }
}
