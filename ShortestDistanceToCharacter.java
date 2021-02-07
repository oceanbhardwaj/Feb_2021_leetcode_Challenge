class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> aa=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                aa.add(i);
        }
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        { int min=Integer.MAX_VALUE;
            for(int e:aa)
            {
               min=Math.min(min,Math.abs(i-e)); 
            }
         arr[i]=min;
        }
        return arr;
    }
}