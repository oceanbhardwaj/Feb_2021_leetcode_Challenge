class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> aa=new ArrayList<>();
        if(root==null)
            return aa;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int d=q.size();
            for(int i=0;i<d;i++)
            {
               TreeNode q1=q.poll();
                if(i==d-1)
                    aa.add(q1.val);
                if(q1.left!=null)
                    q.add(q1.left);
                if(q1.right!=null)
                    q.add(q1.right);
            }
        }
        return aa;
        
    }
}