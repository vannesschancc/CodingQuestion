* [Table of Contents](#table-of-contens)
* [Date](#Date)
    * [10/11/2018](#10/11/2018)
    * [03/31/2019](#03/31/2019)

## 10/11/2018
Question Completed:
1. 114
    - recursive 
        - reverse post order, the prev will always point to the head of flatten right subtree
        - the current node will connect right node to the prev, then cur.right = cur.left, 

    ```java

    ```
    - iterative 

    ```java
        class Solution {
            public void flatten(TreeNode root) {
            if (root == null) {
                return; 
            }
            
            TreeNode cur = root; 
            while (cur != null) {
                if (cur.left != null) {
                    TreeNode prev = cur.left;
                    while (prev.right != null) {
                        prev = prev.right; 
                    }
                    
                    //right most on the left subtree
                    prev.right = cur.right;
                    cur.right = cur.left;
                    cur.left = null; 
                }
                
                cur = cur.right;
            }
        }
    }
    ```

## 03/31/2019
- 560.
- 561. 
- 974. 
- 523. 