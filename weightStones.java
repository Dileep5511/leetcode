class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            a.add(stones[i]);
        }
        while(a.size()>1){
            int val1=Collections.max(a);
            a.remove(Integer.valueOf(val1));
            int val2=Collections.max(a);
            a.remove(Integer.valueOf(val2));
            if(val1!=val2){
                a.add(val1-val2);
            }
        }
        if(a.size()==0){
            return 0;
        }
        return a.get(0);
    }
}
