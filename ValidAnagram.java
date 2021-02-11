/*class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1,ch2);
        
    }
}*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-97]++;
        }
         for(int i=0;i<t.length();i++)
        {
            count[t.charAt(i)-97]--;
        }
         for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
        
        
    }
}