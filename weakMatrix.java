class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[]=new int[k];
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer> aa=new ArrayList<>();
        for(int i=0;i<n;i++)
        { int count=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                    count++;
            }
         aa.add(count);
        }
        int index=0;
       int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=i;
            a[i][1]=aa.get(i);
        }
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a1[],int a2[])
            {
                if(a1[1]==a2[1])
                    return a1[0]-a1[0];
                return a1[1]-a2[1];
            }
        };
        Arrays.sort(a,co);
        for(int i=0;i<k;i++)
        {
            arr[index++]=a[i][0];
        }
        return arr;
    }
}