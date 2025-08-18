class Problem {
    /**
     * Given a list of logs representing folder operations,
     * return the minimum number of steps required to return to the main folder.
     *
     * Example:
     * Input: logs = ["d1/","d2/","../","d21/","./"]
     * Output: 2
     * Explanation: Perform the "../" operation twice to return to the main folder.
     *
     * Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
     * Output: 3
     *
     * Input: logs = ["d1/","../","../","../"]
     * Output: 0
     */
  public int minOperations(String[] logs){
        int depth = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    break;
                case "../":
                    depth = Math.max(0, depth - 1);
                    break;
                default:
                    depth++;
                    break;
            }
        }
        return depth;
    }
}


This solution works by iterating over the logs. If the log is "./", it means we are in the same level as before, so we do nothing. If the log is "../", it means we are going up one level, so we decrement the depth. If the log is anything else, it means we are going down one level, so we increment the depth. The final depth is the minimum number of steps to return to the main folder.