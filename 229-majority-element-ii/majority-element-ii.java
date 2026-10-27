class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int val = nums.length/3;
        for(int i:hm.keySet()){
            if(hm.get(i) > val){
                ans.add(i);
            }
        }
        return ans;
    }
}