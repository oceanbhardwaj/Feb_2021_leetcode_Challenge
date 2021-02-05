class Solution {
    public int findLHS(int[] nums) {
        ArrayList<Integer> h=new ArrayList<>();
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(nums[i]))
            h.add(nums[i]);
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]+1))
            {
                max=Math.max(map.get(nums[i])+map.get(nums[i]+1),max);
            }
            
            
                
            
        }
        return max;
        
    }



///////////////////
class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<(1<<n);i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int count=0;
            for(int j=0;j<n;j++)
            {
                //if((i&(1<<j))!=0)
                if(((i>>j)&1)!=0)
                {
                    max=Math.max(nums[j],max);
                    min=Math.min(nums[j],min);
                    count++;
                }
                
            }
            if(Math.abs(max-min)==1)
                res=Math.max(res,count);
        }
        return res;
        
    }
}
}