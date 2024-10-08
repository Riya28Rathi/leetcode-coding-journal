/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // =============method1=======================================
    // public int maxLevelSum(TreeNode root) {
    //     if(root == null){
    //         return -1;
    //     }
        
    //     int max=Integer.MIN_VALUE;
    //     int maxKey=0;
    //     // HashMap<Integer, Integer> maxMap=new HashMap<>();
    //     int count=1;
        
    //     Stack<TreeNode> parent = new Stack<>();
    //     Stack<TreeNode> child = new Stack<>();

    //     parent.push(root);

    //     while(!parent.isEmpty() || !child.isEmpty()){

    //         if(parent.isEmpty()){
    //             parent.addAll(child); // Copy all elements

    //             // Clear the original stack
    //             child.clear();

    //         } 

    //         int temp=0;
    //         while(!parent.isEmpty()){

    //             TreeNode node=parent.pop();
    //             temp+=node.val;
    //             if(node.left != null){
    //                 child.push(node.left);
    //             }
    //             if(node.right != null){
    //                 child.push(node.right);
    //             }
                

    //         }
    //         // max=Math.max(max, temp);
    //         System.out.println("max:  "+ max);
    //         System.out.println("temp:  "+ temp);
    //         if(temp> max){
    //             max=temp;
    //             maxKey=count;
    //         }
    //         // maxMap.put(count,temp);
    //         count++;

    //     }



    //     return maxKey;

        
    // }


    // public int maxLevelSum(TreeNode root) {
    //     if(root == null){
    //         return -1;
    //     }
        

    //         int max=Integer.MIN_VALUE;
    //         int maxKey=0;
    //         // HashMap<Integer, Integer> maxMap=new HashMap<>();
    //         int count=1;
            
    //         Queue<TreeNode> parent = new LinkedList();
    //         Queue<TreeNode> child = new LinkedList();

    //         parent.add(root);

    //         while(!parent.isEmpty() || !child.isEmpty()){

    //             if(parent.isEmpty()){
    //                 parent.addAll(child); // Copy all elements

    //                 // Clear the original stack
    //                 child.clear();

    //             } 

    //             int temp=0;
    //             while(!parent.isEmpty()){

    //                 TreeNode node=parent.poll();
    //                 temp+=node.val;
    //                 if(node.left != null){
    //                     child.add(node.left);
    //                 }
    //                 if(node.right != null){
    //                     child.add(node.right);
    //                 }
                    

    //             }
    //             // max=Math.max(max, temp);
    //             System.out.println("max:  "+ max);
    //             System.out.println("temp:  "+ temp);
    //             if(temp> max){
    //                 max=temp;
    //                 maxKey=count;
    //             }
    //             // maxMap.put(count,temp);
    //             count++;

    //         }



    //         return maxKey;
        

        
    // }


        public int maxLevelSum(TreeNode root) {
            if(root == null){
                return -1;
            }
            

            
            int maxKey=0;
            // HashMap<Integer, Integer> maxMap=new HashMap<>();
            int count=1;

            
            Queue<TreeNode> parent = new LinkedList();
           int result=Integer.MIN_VALUE;

            parent.add(root);

            while(!parent.isEmpty()){

                int size=parent.size();
                int currSum=0;
                while(size>0){
                    TreeNode node=parent.poll();

                    currSum+=node.val;
                    if(node.left != null){
                        parent.add(node.left);
                    }
                    if(node.right != null){
                        parent.add(node.right);
                    }

                    size--;

                }

                if(currSum > result){
                    result=currSum;
                    maxKey=count;
                }

                count++;
            }


            return maxKey;

        

        
    }
}