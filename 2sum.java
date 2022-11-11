class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] a=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                a[0]=i;
                a[1]=map.get(val);
                break;
            }
        }
        return a;
    }
}
