class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0,maxi=0;
        String out="";
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
            if((end-start+1) > maxi){
                maxi=end-start+1;
                out=s.substring(start,end+1);
            }
        }
        System.out.println(out);
        return maxi;
    }
}
Console
