class Problem {

  /**
   * Given a non-negative integer num, repeatedly add all its digits until the result is a single digit. Return the result.
   *
   * @param num The non-negative integer to perform the operation on.
   * @return The single digit result after repeatedly adding all digits.
   *
   * Example:
   * addDigits(38)
   * Output: 2
   */
  public static int addDigits(int num){
    while (num >= 10) {
      num = num / 10 + num % 10;
    }
    return num;
  }
}

// Test the function
public static void main(String[] args) {
  System.out.println(addDigits(38));  // Output: 2
}


This function works by repeatedly adding the digits of the number until the result is a single digit. It does this by first dividing the number by 10 to get the first digit, then adding that to the remainder of the number divided by 10 to get the second digit. This process is repeated until the number is a single digit.

The time complexity of this function is O(1), which means it will always perform the same number of operations regardless of the size of the input. The space complexity is also O(1), as it uses a constant amount of space.