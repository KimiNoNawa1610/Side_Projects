package tree.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(60);
        root.right.left = new TreeNode(70);
        root.right.right = new TreeNode(80);
        
        root.left.left.left = new TreeNode(90);
        root.left.left.right = new TreeNode(100);
        
        root.left.right.left = new TreeNode(110);
        root.left.right.right = new TreeNode(120);
      
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
     
     Queue<TreeNode> queue = new LinkedList<TreeNode>();
     queue.offer(A);
     queue.offer(null);
     while(!queue.isEmpty())
     {
          TreeNode node = queue.poll();
          if(node==null)
             continue;
          ArrayList<Integer> levelResult = new ArrayList<Integer>();
          int index = 0;
          while(node!=null)
          {
             levelResult.add(node.val);
             if(node.left!=null)
                  queue.offer(node.left);
             if(node.right!=null)
                queue.offer(node.right);
             node = queue.poll();
          }
          result.add(levelResult);
          queue.add(null);
        
     }
    
    return result;
 }

}
