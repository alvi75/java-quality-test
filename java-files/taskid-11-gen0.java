import java.util.*;

class Problem {
    /**
     * The approximate value is calculated by counting the number of common letters
     * and dividing it by the sum of the lengths of the two words.
     *
     * @param word1 The first word.
     * @param word2 The second word.
     * @return The approximate value as a reduced fraction.
     *
     * >>> appx("CAR", "CART")
     * "appx(CAR, CART) = 6/7"
     * >>> appx("TURKEY", "CHICKEN")
     * "appx(TURKEY, CHICKEN) = 4/13"
     * >>> appx("MONEY", "POVERTY")
     * "appx(MONEY, POVERTY) = 1/3"
     * >>> appx("ROUGH", "PESKY")
     * "appx(ROUGH, PESKY) = 0"
     * >>> appx("A", "A")
     * "appx(A, A) = 1"
     */
    public static String appx(String word1, String word2){
        int commonLetters = 0;
        for (int i = 0; i < word1.length() && i < word2.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                commonLetters++;
            }
        }

        int totalLength = word1.length() + word2.length();
        if (totalLength == 0) {
            return "appx(" + word1 + ", " + word2 + ") = 0";
        }

        return "appx(" + word1 + ", " + word2 + ") = " + commonLetters + "/" + totalLength;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Problem.appx("CAR", "CART"));
        System.out.println(Problem.appx("TURKEY", "CHICKEN"));
        System.out.println(Problem.appx("MONEY", "POVERTY"));
        System.out.println(Problem.appx("ROUGH", "PESKY"));
        System.out.println(Problem.appx("A", "A"));
    }
}


This program defines a function `appx` that calculates the approximate value of a word by counting the number of common letters and dividing it by the sum of the lengths of the two words. The function is then used to calculate the approximate value of the words "CAR", "CART", "TURKEY", "CHICKEN", "MONEY", "POVERTY", "ROUGH", and "PESKY", and prints the results.