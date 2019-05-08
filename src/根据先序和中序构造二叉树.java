import java.util.Arrays;

public class 根据先序和中序构造二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x; }
    }

    private TreeNode reConstructBinaryTree(int [] pre,int [] in){
        if(pre.length == 0){
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0] == in[i]){
                treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i-1));
                treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return treeNode;
    }
}
