class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int mind = Integer.MAX_VALUE;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {

                int forward = (i - startIndex + n) % n;
                int backward = (startIndex - i + n) % n;

                int dist = Math.min(forward, backward);

                mind = Math.min(mind, dist);
            }
        }

        return mind == Integer.MAX_VALUE ? -1 : mind;
    }
}