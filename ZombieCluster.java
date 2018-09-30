class Result {

    /*
     * Complete the 'zombieCluster' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY zombies as parameter.
     */

    public static int zombieCluster(List<String> zombies) {
     // Write your code here
        //Use Union Find
        if (zombies == null || zombies.size() < 2) {
            return 0;
        }
        
        int len = zombies.size(); 
        //Father array
        int[] cluster = new int[len]; 
        for (int i = 0; i < cluster.length; i++) {
            cluster[i] = i; 
        }
        
        //union all connected zombie
        for (int i = 0; i < len; i++) {
            String current = zombies.get(i);
            for (int j = 0; j < current.length(); j++) {
                if (current.charAt(j) == '1') {
                    union(cluster, i, j); 
                }
            }
        }
        
        //Union completed, count the unique one 
        Arrays.sort(cluster); 
        
        int count = 0; 
        int current = cluster[0];
        
        for (Integer aNum : cluster) {
            System.out.println(aNum); 
        }
        for (int i = 1; i < cluster.length; i++) {
            if (current != cluster[i]) {
                count++; 
                current = cluster[i]; 
            }
        }
        
        //Do not skip the last one
        if (current != cluster[cluster.length-2]) {
            count++;
        }
        
        return count; 
    }
    
    private static void union(int[] a, int i, int j) {
        int iRoot = find(a, a[i]);
        int jRoot = find(a, a[j]); 
        
        if (iRoot != jRoot) {
           a[j] = a[i]; 
        }
    }
    
    private static int find(int[] a, int target) {
        if (a[target] == target) {
            return target; 
        }
        
        return find(a, a[target]); 
    }

}

