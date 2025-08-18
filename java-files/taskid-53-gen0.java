class Problem {

  /**
   * Reverse the characters of each word in the given string while maintaining the original word order.
   *
   * @param s The input string containing words separated by spaces.
   * @return The string with characters of each word reversed.
   *
   * Example:
   * reverseWords("Mr Ding")
   * Output: "rM gniD"
   */
  public static String reverseWords(String s){
    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      result.append(new StringBuilder(word).reverse().toString());
      result.append(" ");
    }

    return result.toString().trim();
  }
}

// Test cases
public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.reverseWords("Mr Ding")); // Output: "rM gniD"
  }
}


This solution works by splitting the input string into words, then reversing each word and appending it to the result string. The result string is then returned.

The time complexity of this solution is O(n), where n is the length of the input string. This is because we're performing a single pass over the input string.

The space complexity is also O(n), where n is the length of the input string. This is because we're storing the result string, which in the worst case will be the same size as the input string.