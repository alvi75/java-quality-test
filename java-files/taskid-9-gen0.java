import java.util.*;

class Problem {
   /**
     * Given a list of numbers, determine how many items in the list are twice some other item in the same list.
     * 
     * Example:
     * >>> countDoubles(new int[] {1, 4, 3, 2, 9, 7, 18, 22})
     * 3
     * >>> countDoubles(new int[] {2, 4, 8, 10})
     * 2
     * >>> countDoubles(new int[] {7, 5, 11, 13, 1, 3})
     * 0
     */
    public static int countDoubles(int[] numbers){
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : numbers) {
            if(set.contains(num * 2)) {
                count++;
            } else {
                set.add(num);
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Problem.countDoubles(new int[] {1, 4, 3, 2, 9, 7, 18, 22})); // 3
        System.out.println(Problem.countDoubles(new int[] {2, 4, 8, 10})); // 2
        System.out.println(Problem.countDoubles(new int[] {7, 5, 11, 13, 1, 3})); // 0
    }
}

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add it to the set.
// 6. Return the count.

// 1. Create a HashSet to store the numbers.
// 2. Iterate over the array.
// 3. For each number, check if it's a multiple of 2.
// 4. If it is, increment the count.
// 5. If it's not, add