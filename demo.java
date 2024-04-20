import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    int age = sc.nextInt();

    // Output input by the user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

    // Close the Scanner to avoid resource leak
    sc.close();
  }
}
