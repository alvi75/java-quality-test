class Problem {
    /**
     * Given an integer array `gain` representing the net gain in altitude between consecutive points, return the highest altitude reached.
     *
     * Example:
     * >>> highestAltitude([-5,1,5,0,-7])
     * 1
     * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest altitude reached is 1.
     *
     * >>> highestAltitude([-4,-3,-2,-1,4,3,2])
     * 0
     * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest altitude reached is 0.
     *
     * Constraints:
     * - The length of the `gain` array is between 1 and 100, inclusive.
     * - Each element in the `gain` array is between -100 and 100, inclusive.
     */
    public int highestAltitude(int[] gain){
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int gainValue : gain) {
            currentAltitude += gainValue;
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        return highestAltitude;
    }
}


This solution works by iterating over the `gain` array and updating the `currentAltitude` variable by adding the value of the current gain. If the current altitude is higher than the `highestAltitude`, it updates `highestAltitude`. At the end of the iteration, it returns the `highestAltitude`.

The time complexity of this solution is O(n), where n is the length of the `gain` array, because it only needs to iterate over the `gain` array once. The space complexity is O(1), because it only uses a constant amount of space to store the `currentAltitude` and `highestAltitude` variables.