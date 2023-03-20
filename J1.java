import java.util.Scanner;

/*
*
* Author: Deon Jerom
*
*/

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); // consume the newline character
    String[] names1 = sc.nextLine().split(" ");
    String[] names2 = sc.nextLine().split(" ");

    // Check if the arrangement is consistent
    boolean isConsistent = true;
    for (int i = 0; i < n; i++) {
      if (!names1[i].equals(names2[i]) && !names1[i].equals(names2[getIndex(names1, names2[i])])
          || names1[i].equals(names2[i])) {
        isConsistent = false;
        break;
      }
    }

    // Print the result
    if (isConsistent) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
  }

  // Returns the index of the given name in the given array
  private static int getIndex(String[] names, String name) {
    for (int i = 0; i < names.length; i++) {
      if (names[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }
}
