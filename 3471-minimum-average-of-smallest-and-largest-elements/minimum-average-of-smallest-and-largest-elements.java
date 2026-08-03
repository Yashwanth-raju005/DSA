class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        List<Double> f_arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        int traverse=nums.length/2;
        while(traverse!=0){
            int max=Collections.max(arr);
            int min=Collections.min(arr);

        if(!arr.isEmpty()){
            double val=(double)(min+max)/2;
            f_arr.add(val);
        }

            arr.remove(Integer.valueOf(max));
            arr.remove(Integer.valueOf(min));
            traverse--;
        }
        Collections.sort(f_arr);
        return f_arr.get(0);
    }
}