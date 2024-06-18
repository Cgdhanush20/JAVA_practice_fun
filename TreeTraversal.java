import java.util.*;
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) 
    {
        this.val = val;
    }
}
public class TreeTraversal 
{
    public void inorderTraversal(TreeNode root) 
    {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        System.out.println("Inorder traversal: " + result); 
    }
    public void helper(TreeNode node, List<Integer> result) 
    {
       if(node!=null){
        helper(node.left, result); 
        result.add(node.val);  
        helper(node.right, result); 
       }
    }
    public void preordertraversal(TreeNode root)
    {
        List<Integer> r=new ArrayList<>();
        helper2(root,r);
        System.out.println("Preorder traversal: " + r); 
    }
    public void helper2(TreeNode n,List<Integer> r)
    {
        if(n!=null)
        {
            r.add(n.val);
            helper2(n.left,r);
            helper2(n.right,r);
        }
    }
    public void postordertraversal(TreeNode root)
    {
        List<Integer> r1=new ArrayList<>();
        helper3(root,r1);
        System.out.println("Postorder traversal: " + r1); 
    }
    public void helper3(TreeNode n,List<Integer> r)
    {
        if(n!=null)
        {
            helper3(n.left,r);
            helper3(n.right,r);
            r.add(n.val);
        }
    }
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        TreeTraversal tree = new TreeTraversal();
        tree.inorderTraversal(root);
        tree.preordertraversal(root);
        tree.postordertraversal(root);
    }
}
