package hackerrank;

import java.util.List;

public class Main {
	public static void main(String[] args) {

	}

	public static int getMinMaxLatency(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight,int k) {
		
		int n = gNodes;
        int m = gFrom.size();
        
        int minLatency = Integer.MAX_VALUE;
        int maxLatency = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int latency = gWeight.get(i);
            minLatency = Math.min(minLatency, latency);
            maxLatency = Math.max(maxLatency, latency);
        }
        
        int lo = minLatency;
        int hi = maxLatency;
        int ans = -1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            int[] regions = new int[n];
            int numRegions = 0;
            for (int i = 0; i < m && numRegions < k; i++) {
                int from = gFrom.get(i) - 1;
                int to = gTo.get(i) - 1;
                int latency = gWeight.get(i);
                if (latency > mid) {
                    continue; // Skip edges with latency greater than mid
                }
                if (regions[from] == 0 && regions[to] == 0) {
                    numRegions++;
                    regions[from] = numRegions;
                    regions[to] = numRegions;
                } else if (regions[from] == 0) {
                    regions[from] = regions[to];
                } else if (regions[to] == 0) {
                    regions[to] = regions[from];
                } else if (regions[from] != regions[to]) {
                    // Merge regions with the same maximum latency
                    int oldRegion = regions[to];
                    for (int j = 0; j < n; j++) {
                        if (regions[j] == oldRegion) {
                            regions[j] = regions[from];
                        }
                    }
                    numRegions--;
                }
            }
            
            if (numRegions <= k) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        
        return ans;
		
		
		
		
	}
}
