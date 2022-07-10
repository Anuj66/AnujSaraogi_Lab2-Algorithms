package Problem1;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of transaction array");
    int size = sc.nextInt();

    int[] transactions = new int[size];
    System.out.println("Enter the values of the array");
    for (int i = 0; i < size; i++) {
      transactions[i] = sc.nextInt();
    }

    System.out.println("Enter the total no of targets that needs to be achieved");
    int totalTargets = sc.nextInt();

    for(int i=0; i<totalTargets; i++) {
      System.out.println("Enter the value of target");
      int target = sc.nextInt();
      int sum = 0;
      for(int j=0;j<size;j++) {
        sum = sum + transactions[j];
        if (sum >= target) {
          int k = j+1;
          System.out.println("Target achieved after " + k + " transactions");
          break;
        }
      }
      if (sum < target) System.out.println("Given target is not achieved");
    }

  }
}
