package Problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of currency denominations");
    int size = sc.nextInt();

    System.out.println("Enter the currency denominations value");
    int[] currencyDenominations = new int[size];
    for (int i = 0; i < size; i++) {
      currencyDenominations[i] = sc.nextInt();
    }

    System.out.println("Enter the amount you want to pay");
    int amount = sc.nextInt();

    int[] countOfDenominations = new int[size];
    for (int i = 0; i < size; i++) countOfDenominations[i] = 0;

    Arrays.sort(currencyDenominations);
    for (int j = size - 1; j >= 0; j--) {
      if (amount == 0) break;
      int countOfNote = amount / currencyDenominations[j];
      amount = amount % currencyDenominations[j];
      countOfDenominations[j] = countOfNote;
    }

    System.out.println("Your payment approach in order to give min no of notes will be");
    for (int j = size - 1; j >= 0; j--) {
      if (countOfDenominations[j] != 0)
        System.out.println(currencyDenominations[j] + ":" + countOfDenominations[j]);
    }
  }
}
