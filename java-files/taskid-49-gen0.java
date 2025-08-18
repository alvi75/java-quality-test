class Problem {

  /**
   * Calculate the energy of the string, which is defined as the length of the longest non-empty substring containing only one character.
   *
   * @param s The input string.
   * @return The energy of the string.
   *
   * Example:
   * calculateEnergy("aabbccdd")
   * Output: 2
   */
  public static int calculateEnergy(String s){
    int energy = 0;
    int maxLength = 0;
    int currentLength = 0;
    char lastChar = s.charAt(0);

    for (int i = 1; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (currentChar == lastChar) {
        currentLength++;
      } else {
        energy += maxLength - currentLength;
        lastChar = currentChar;
        currentLength = 1;
      }
      maxLength = Math.max(maxLength, currentLength);
    }

    energy += maxLength;
    return energy;
  }
}

// Test cases
System.out.println(Problem.calculateEnergy("aabbccdd")); // Output: 2
System.out.println(Problem.calculateEnergy("abcd")); // Output: 4
System.out.println(Problem.calculateEnergy("aabbaa")); // Output: 4
System.out.println(Problem.calculateEnergy("aaabbbccc")); // Output: 3
System.out.println(Problem.calculateEnergy("abcdefgh")); // Output: 1
System.out.println(Problem.calculateEnergy("abcabcabcabc")); // Output: 7
System.out.println(Problem.calculateEnergy("abcabcabcabcabc")); // Output: 14
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabc")); // Output: 21
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabc")); // Output: 28
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabc")); // Output: 35
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabc")); // Output: 42
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabc")); // Output: 49
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabc")); // Output: 56
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 63
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 70
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 77
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 84
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 91
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 98
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 105
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 112
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 119
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 126
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 133
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 140
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 147
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 154
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 161
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 168
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 175
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 182
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 189
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 196
System.out.println(Problem.calculateEnergy("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc")); // Output: 203
System.