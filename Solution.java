class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];

        int depth = 0;

        for (int i = 0; i < n; i++) {
            char ch = seq.charAt(i);

            if (ch == '(') {
                depth++;

                // Put current '(' into group based on depth
                ans[i] = depth % 2;
            } else {
                // For ')', use the current depth before decreasing
                ans[i] = depth % 2;

                depth--;
            }
        }

        return ans;
    }
}
