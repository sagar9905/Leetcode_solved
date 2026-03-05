import java.util.*;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = citations[i];
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(a[j] >= i + 1){
                    count++;
                }
            }

            if(count >= i + 1){
                max = i + 1;
            }
        }

        return max;
    }
}