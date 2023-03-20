import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    // The maximum length palindrome found so far
    int maxLength = 1;

    // Check all possible substrings of the input string
    for (int i = 0; i < s.length(); i++) {
      // Check odd-length palindromes with center at i
      int length = checkPalindrome(s, i, i);
      if (length > maxLength) {
        maxLength = length;
      }

      // Check even-length palindromes with center between i and i+1
      length = checkPalindrome(s, i, i+1);
      if (length > maxLength) {
        maxLength = length;
      }
    }

    // Print the result
    System.out.println(maxLength);
  }

  // Check the palindrome centered at l and r
  private static int checkPalindrome(String s, int l, int r) {
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
      l--;
      r++;
    }
    return r - l - 1;
  }
}
