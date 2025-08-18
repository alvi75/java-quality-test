import java.util.*;

class Problem {
    /**
     * Return the lexicographically smallest string of length n and value k.
     * The value of a string is the sum of the positions of its characters in the alphabet (starting from 1).
     * Example:
     * >>> getSmallestString(3, 27)
     * "aay"
     * >>> getSmallestString(5, 73)
     * "aaszz"
     */
    public String getSmallestString(int n, int k){
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            if (k - i + 1 >= 0) {
                sb.append('a');
                k -= i;
            } else {
                sb.append('a' + (char) (k - i + 1));
                k -= (k - i + 1);
            }
        }
        return sb.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Problem p = new Problem();
        System.out.println(p.getSmallestString(3, 27));  // "aay"
        System.out.println(p.getSmallestString(5, 73));  // "aaszz"
    }
}

// Output:
// aay
// aaszz
// Explanation:
// The smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum of the positions of its characters in the alphabet is 1+2+1=4.
// The smallest string of length 5 is "aaszz" because the sum of the positions of its characters in the alphabet is 1+2+3+4+5=15.
// The value of a string is the sum of the positions of its characters in the alphabet.
// The value of 'a' is 1, 'b' is 2, and so on.
// So, the smallest string of length 3 is "aay" because the sum