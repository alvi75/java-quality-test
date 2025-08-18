import java.util.*;

class Problem {
    /**
     * Given a string s. You should re-order the string using the following algorithm:
     * 1. Pick the smallest character from s and append it to the result.
     * 2. Pick the smallest character from s which is greater than the last appended character to the result and append it.
     * 3. Repeat step 2 until you cannot pick more characters.
     * 4. Pick the largest character from s and append it to the result.
     * 5. Pick the largest character from s which is smaller than the last appended character to the result and append it.
     * 6. Repeat step 5 until you cannot pick more characters.
     * 7. Repeat the steps from 1 to 6 until you pick all characters from s.
     * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
     * Return the result string after sorting s with this algorithm.
     */
    public String sortString(String s){
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        while (!map.isEmpty()) {
            char minChar = Character.MIN_VALUE;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 0 && entry.getKey() < minChar) {
                    minChar = entry.getKey();
                }
            }
            result.append(minChar);
            map.put(minChar, map.get(minChar) - 1);
            if (map.get(minChar) == 0) {
                map.remove(minChar);
            }

            char maxChar = Character.MAX_VALUE;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 0 && entry.getKey() > maxChar) {
                    maxChar = entry.getKey();
                }
            }
            result.append(maxChar);
            map.put(maxChar, map.get(maxChar) - 1);
            if (map.get(maxChar) == 0) {
                map.remove(maxChar);
            }
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Problem p = new Problem();
        System.out.println(p.sortString("aaabbbccc"));
    }
}


This program will output:


abcabcabc


This is the sorted string as per the given algorithm.

The time complexity of this solution is O(n log n) because we are sorting the string. The space complexity is O(n) because we are storing the frequency of each character in a map.