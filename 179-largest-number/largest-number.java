class Solution {
    public String largestNumber(int[] nums) {
        String[] strNUm=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strNUm[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strNUm,(a,b)->(b+a).compareTo(a+b));
        if(strNUm[0].equals("0")){
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String str : strNUm) {
            result.append(str);
        }
        
        return result.toString();
    }
}