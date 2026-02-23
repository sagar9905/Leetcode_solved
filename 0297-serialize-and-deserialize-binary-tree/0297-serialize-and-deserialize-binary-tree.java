/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       if(root==null) return "N"; 
      return  root.val+","+serialize(root.left)+","+serialize(root.right);
        
    }

int i=0;
 public TreeNode build(String[]arr){
    if(i>=arr.length) return null;
    if(arr[i].equals("N")){
        i++;
        return null;
    }
    TreeNode root = new TreeNode(Integer.parseInt(arr[i++]));
    root.left = build(arr);
    root.right= build(arr);
    return root;

 }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      String arr[]= data.trim().split(",");
      return build(arr);
       
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));