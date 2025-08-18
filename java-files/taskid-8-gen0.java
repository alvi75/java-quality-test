import java.util.*;

class Problem {

    /**
     * Count the number of words in the given word list that have the given prefix.
     * 
     * @param wordList: a list of words
     * @param prefix: the prefix string
     * @return the number of words with the given prefix
     * 
     * Example:
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "ba")
     * 2
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "b")
     * 3
     * 
     * >>> countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "band")
     * 1
     */
    public static int countPrefixWords(List<String> wordList, String prefix){
        int count = 0;
        for (String word : wordList) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }
}

// Test cases
public static void main(String[] args) {
    System.out.println(Problem.countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "ba")); // 2
    System.out.println(Problem.countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "b")); // 3
    System.out.println(Problem.countPrefixWords(Arrays.asList("banana", "band", "bee", "absolute", "acm"), "band")); // 1
}

// Solution explanation
The function countPrefixWords takes a list of words and a prefix as input. It then iterates over the list, checking each word to see if it starts with the given prefix. If it does, it increments a counter. At the end of the function, it returns the counter, which represents the number of words in the list that start with the given prefix.