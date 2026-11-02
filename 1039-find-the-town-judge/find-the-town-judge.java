class Solution {
    public int findJudge(int n, int[][] trust) {
    
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        for (int[] i : trust) {
            int k = i[1];
            int l = i[0];
            indegree[k]++;
            outdegree[l]++;
        }

        System.out.println(Arrays.toString(outdegree));

        for (int i = 1; i <= n; i++) {

                if(indegree[i] == n-1 && outdegree[i]==0 ){
                    return i;
                } 
           
        }

        return -1;

    }
}