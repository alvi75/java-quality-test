import java.util.*;

class Problem {
    /**
     * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter,
     * return the number of different transformations among all words.
     *
     * Example:
     * uniqueMorseRepresentations(["gin","zen","gig","msg"]) -> 2
     * uniqueMorseRepresentations(["a"]) -> 1
     */
    public int uniqueMorseRepresentations(String[] words){
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-","-..",".","-.--","--.."};
        Set<String> uniqueMorse = new HashSet<>();
        for (String word : words) {
            String morseWord = "";
            for (char c : word.toCharArray()) {
                morseWord += morse[c - 'a'];
            }
            uniqueMorse.add(morseWord);
        }
        return uniqueMorse.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Problem p = new Problem();
        System.out.println(p.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
        System.out.println(p.uniqueMorseRepresentations(new String[]{"a"}));
    }
}


This solution works by creating a new set `uniqueMorse`. For each word in the input array, it converts the word to Morse code and adds it to the set. The size of the set is the number of unique Morse codes, as each word is unique in terms of Morse code.

The time complexity of this solution is O(n*m), where n is the number of words and m is the length of the longest word. This is because we are iterating over each character in each word. The space complexity is O(n), where n is the number of words, as we are storing the unique Morse codes in the set.