Table of Content
================

* [Table of Contents](#table-of-contens)
* [Array](#Array)
    * [Points to think](#Points\ to\ think)
    * [Two Pointer Problem](#Pointer\ Problems)
        * [Read/Write](#Read-Write\ Pointer)
        * [Same Direction](#Same\ Direction\ Pointer)
             * [Window Problem](#Window\ Problem)
             * [Fast/Slow](#Fast-Slow\ Pointer)
             * [Other](#Other\ SAME\ Direction)
        * [Opposite Direction](#Opposite\ Direction)
             * [Palindrome](#Palindrome)
             * [N Sum Problem](#N\ Sum\ Problem)
             * [Reverse String](#Reverse\ String)
             * [Partition](#Partion\ Array  )
        * [Other](#Other\ Pointer)
            * [Rainbow Sort](#Rainbow\ Sort)
            * [Two Dimension Traversal](#Two\ Dimension\ Traversal)
    * [Matrix](#Matrix)
        * [Tricks](#Matrix\ Tricks)

* [Binary Search](#Binary\ Search)
    * [Things to Consider](#Binary\ Search\ Traps) 
    * [First/Last Position](#First\ Last\ Position\ in\ Binary\ Search)
    * [Min/Max](#Min\ Max\ in\ Binary\ Search)

* [Stack](#stack)
    * [Temporary Storage](#Temporary\ Example)
    * [Reverse with Stack](#Reverse\ Stack)
    * [MonoStack](#MonoStack)
    * [Parsing](#Parsing)
    * [RecToIter](#Recursion\ to\ Iteration)
    * [StackToQueue](#Queue\ To\ Stack)
* [Queue](#Queue)
    * [MonoQueue](#MonoQueue)
    * [QueueToStack](#Queue\ To\ Stack)
    * [Queue\ Implementation](#Queue\ Implmentation)
    * [Details\ Queue](#Queue\ Details) 
* [Heap](#Heap) 
    * [Stream](#Stream)
        * [Something in Stream](#Something\ in\ Stream)

* [DP](#DP)
    * [Type](#Type)
    * [Identify](#判断)
    * [Types of Problems](#步骤)
    * [Steps:](#Steps)
        * [Define State](#确定状态)
        * [State Transfer](#转移方程)
        * [Init/Edge](#初始条件边界情况)
        * [CalculationOrder](#计算顺序)
    * [Interval DP](#Interval\ DP)
    * [Two-D DP](#Two\ Dimension\ DP)
    * [One-D DP](#One\ Dimension\ DP)

* [Greedy](#Greedy)
    * [Interval](#Interval)

* [Graph](#Graph)
    * [Presentation](#Presentation)
        * [Adj Matrix](#Adj\ Matrix)
        * [Implicit Graph](#Implicit\ Graph)
    * [Traversal](#Traversal)
        * [DFS](#DFS)
        * [BFS](#BFS)
        * [Level Order](#Level\ Order)
    * [Cycle](#Cycle)
        * [Check Cycle](#Check\ Cycle)
    * [Reachability](#Reachability)
        * [Check Connected](#Check\ If\ Connected)
    * [Distance](#Distance)
        * [Optimal Distance](#Optimal\ Distance)

* [LinkedList](#LinkedList)
    * [Common Technique](#Common\ Technique)
        * [Fast/Slow](#Fast\ Slow\ Pointer)
        * [Operation](#LinkedList\ Operation)
        * [DummyNode](#Dummy\ Node)
    


* [Tree](#Tree)
    * [Generation](#Tree\ Generation)
    * [Search](#Tree\ Generation)
    * [Path](#Path)
    * [Property](#Property)
    * [BST](#Binary\ Search\ Tree)
    * [Traversal](#Tree\ Traversal)
        * [Recursive](#Recursive\ Traversal)
        * [Iterative](#Iterative\ Traversal)
        * [Level](#Level\ Order\ Traversal)
    * [DivideAndConqueuer](#Divide\ and\ Conquer)
    * [HybridMethod](#Hybrid)
* [DFS](#DFS)
    * [Combination Base](#DFS\ Combination\ Base)
    * [Permutation Base](#DFS\ Permutation\ Base)
    * [Graph Base](#DFS\ Graph\ Base)
    * [Backtrack](#Backtrack)
        * [Permutation](#Permutation)
        * [Combination](#Combination)
        * [Subset](#Subset)
        * [PalindromPartition](#PalindromPartition)
        * [Remove Duplicate](#Remove\ Duplicate)
    * [Matrix DFS](#Matrix\ DFS)
        * [Matrix Trick](#Matrix\ Trick)
* [BFS](#BFS) 
    * [When to use](#When\ to\ Use\ BFS)
    * [What to solve](#What\ to\ Solve\ BFS)
    * [Key Point](#BFS\ Key\ Point)
* [Trie](#Trie)
    * [Template](#Trie\ Template)
    * [Prefix](#Trie)
    * [AutoComplete](#Auto\ Complete)
* [Bit Manipulation](#Bit\ Manipulation)
    * [Find Missing Number](#Find\ Missing\ Number)
* [UnionFind](#Union\ Find)
    * [Template](#Union\ Find\ Template)
* [Common Api](#Common\ API)
    * [String](#String\ API)
        * [Substring Problem](#Substring\ Problem)
    * [Map](#Map\ API)
        * [Hash Trick](#Hash\ Trick)
    * [Set](#Set\ API)
    * [Comparator](#Comparator\ API)


# DP
## Type
### Interval DP
### Backpage DP
### Memo DP
### Matching DP 
### Space Optimization
### How to select dimension of DP ? 
- The dimention is determined by the limiting condiction, for example: 
    - K Sum, use three dimension
    - 0-1 backpack, use two dimension with dummy
    - Matching, two dimension with dummy 




## 判断
- count: Calculate how many, 
- min / max 
- Possiblity, and / or / true / false 
- from recursive to dp, from bottom up to top down 
- `Under lots of senario, top-down DFS + memo = bottom-up DP`

## 步骤:
- 确定状态
- 转移方程
- 初始条件/边界情况
- 计算顺序

#### 确定状态
- 最后一步: 遍历最后一步可以取的情况
- 化成子问题: 切掉最后一块, 剩下的问题跟原问题应该是一样的

#### 转移方程
- 数学表达式来判断 dp[x]的结果

- 纸面上工作结束

#### 初始条件/边界情况
- 非常重要, 必须有初始条件, 才可以让dp计算出正确结果.

#### 计算顺序
- 递推: 从小到大, 从 dp[0], dp[1] 开始
- 记忆化: 从大到小, 先算一遍 dp[n-1], 然后记录下来

## 基本原理
- 加法原理 -> 无重复，无泄漏
- dp = new [n] or dp = new [n + 1] ? 看角标是否表示坐标, 还是前i items的状态

### Interval DP
##### 性质
- 要么砍头, 要么砍尾
- `dp[i][j] 表示 [i~j]之间的状态, i, j 都是index!`
- 求一段区间的解: max/min/count
- 转移方程通过区间更新: len = x
- 从大到小的更新
##### 特点
- 给定一个序列/字符串, 进行操作
- 最右一步会把 序列/字符串 去头/去尾
- 剩下的是一个区间 [i, j]
- 状态自然定义为dp[i][j], `表示面对子序列 [i, ....., j]时的最优性质`
- 坐标型的下标模式
- 切割后的三种情况: 首字母不相关, 末尾字母不相干, 首字母和末尾字母都相干.

##### 三把斧
- 中间劈开
- 砍断首或尾
- Range区间作为iteration的根本

##### 难点
- 计算顺序: 不能按照i的顺序去算!!! 掐头/去尾的时候, 有 [i+1], 也有[i], 所以不能按照i
- 应该: 按照 **区间长度从小到大** 的顺序去算:
- 按照区间: `长度, 长度, 长度`!
```
for (len = ..; len <= n; len++) {
	for (int i = 0; i <= n; i++) {
		int j = i + len - 1;
		...
		...
	}
}
```


Strange example 
```java

/*
    head is default to be 0;
    tail is changing, both tail and head matter
    as head is always 0, then 2d matrix can be down to 1d 

*/
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null || wordDict.size() == 0) {
            return false; 
        }
        
        /*
            dp[i], whether s[0...i] can be broken into words in dict 
            dp[i], dp[i-k] && wordDict.contains(substr)
            
            e.g. s = "applepenapple", wordDict = ["apple", "pen"]
            
            wb("leetcode") = wb("") && inDict("leetcode")
                          || wb("l") && inDict("eetcode")
                          || wb("le") && inDict("etcode")
                          || wb("lee") && inDict("tcode")
                          || wb("leet") && inDict("code")

          wb("leet") = wb("") && inDicr("leet") -> return true
                    || wb("l") && inDicr("eet")
        */
        boolean[] dp = new boolean[s.length() + 1];
        //init: ""empty string is always the in the dict
        //dp[0] -> empty string is a solution in wordDict
        dp[0] = true;
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i < len; i++) {
                String subStr = s.substring(i, len); 
                if (dp[i] == true && wordDict.contains(subStr)) {
                    dp[len] = true; 
                    break;
                }
            }
        }
        
        return dp[dp.length-1];  
        
    }
}

```


# Array
## Points to think
- Observation: 
    - Sorted: Use pointers (same dir or opposite dir)
    - Unsorted: Use some kind of collections of data structure (set, map, stack, queue)
- "Missing Number in Continous Problem": 
    - Use sum array formula  
    - (1 + n) * n / 2 

- Tricks for traversaling substring
    - Use len from 1 to len(string) as outerloop 
    - Use (i = 0; i < len(string) && i < i + len; i++)
    - 
- Dragger/Marker Technique
    -  "Drag" method, one move, the other one does not, or both move, 
    - normally the slow one is used as `Marker` for comparison and etc
    - If the fast one (read) is good for some condicion, the slow and fast are aligned, (slow = fast) or the slow one is increment depending a certain conditions

- Update first or modify first? 
```java
    /*
        Modify first, based on pre
    */
    int curState; 
    for (int i = 0; i < arr.length; i++) {
        compute based on curState()
        update preState to next state()
    }

    /*
        update first, compute on the current state

    */

    int preState; 
    for (int i = 0; i < arr.length; i++) {
        update preState to current state()
        compute based on current s sate()
    }

    /*
        Be careful about the indexes ofstart and end 
        a)if needs comparing with the previous -> start: 1, 
        end: len(arr) - 1
        b)if needs comparing with the next one -> start at 0, 
        end: len(arr) - 2
    */



```

- Check Boundary 
    - Any time you read based on idx, check the boundary
    - while loop ends at the `1st` that fail to meet the condition
```java
   static String compressString(String str) {
        if (str == null || str.length() == 0) return str;

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < str.length()) {
            int count = 1;
            while (idx + 1 < str.length() && str.charAt(idx) == str.charAt(idx + 1)) {
                count++;
                idx++;
            }

            sb.append(str.charAt(idx)).append(count);
            idx++;
        }

        return sb.toString();
    }      
```
## Pointer Problems
- Same Direction 
    - Fast and Slow
    - Windows Problem
- 
### Read-Write Pointer
1. Read and Write Pointer -> ` In place replacement, remove duplicated`
    - If you found the undesired number, keep the write pointer here, until you read a valid one, replace it, then increment write

    - Normailly, the problem comes with some kind of `Parititioning`
    
``` java
/*
给一个inputintegerarray,remove掉其中evenindice上的evennumber. e.g.{0,1,2,3,5}=>{1,3,5}  

TC: O(n)
SC: O(1)
*/

//The write pointer always pointed a pos, any number before write is valid number 
    static int[] removeEvenIndiceEvenNum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 == 0) {
                continue;
            } else { //
                nums[count++] = nums[i];
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

/*
    LC 26, remove duplicated 
    The count pointer is write, pointer, always any number before count is valid

    any number equal to the last number of the valid area, will be ignored

    [0,0,1,1,1,2,2,3,3,4],


    TC: O(n)
    SC: O(1)
*/


class Solution {
    public int removeDuplicates(int[] nums) {
        /* 
        exampple    
        [0,1,2,3,4,2,2,3,3,4]],
     cou           ^ 
       i                   ^          
         
         
         result 
        [0,1, 2, 3,4]
     idx           ^
        
        
        */
        if (nums == null) return 0; 
        if (nums.length < 2) return nums.length; 
        
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count-1] != nums[i]) {
                nums[count] = nums[i]; 
                count++;
            }
        }
        return count; 
    }
}


//LC 80 
/*
    Remove Duplicates from Sorted Array II
    Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Example 1:

    Given nums = [1,1,1,2,2,3],

    Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

    It doesn't matter what you leave beyond the returned length.
*/

    /*
                [0,0,1,1,2,2,3,3,3,3],
        count                    ^                         
            i                        ^          
            
                
        count              ^                                    
            i              ^                      
            
*/

/*
    Idea: sample concept,you can have two duplicated number, so just check the the last but one of the valid area 


*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0; 
        }
        
        if (nums.length <= 2) {
            return nums.length; 
        }
        

        int count = 2; 
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count-2]) { //always read the desired one, placed the write pointer, and return write with desire one
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

/*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Example:

    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]

            [1, 3, 12, 0, 0]
        r    0  1  2  3   4 
        w    0  1  2  3

*/



public void moveZeroes(int[] nums) {
        int write = 0; 
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read]  = temp; 
                write++;
            }
        }
    }


```
# Same Direction Pointer
- Daggling Model
    1. One stops due to certain condiction

- Example: 
    1. Merge Two Array / LinedList 
    2. Intersection of two arrays <- Select this alternatively
    3. Sum of two large number 
``` Java
/*
    349. Intersection of Two Arrays

    Given two arrays, write a function to compute their intersection.

    Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]

    Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]

    Note:
        Each element in the result must be unique.
        The result can be in any order.

*/


/*
    Two pointer
    If the result cannot contain duplicated, use set 
    If the result accept duplciated, use List
    Sort + two pointer will work both ways
*/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}


/*
    Merge Two Sorted Array, In-place 
    Use three pointer, i -> i arr, j-> j arr, k -> sum arr
    nums2 is longer than nums1
*/

class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1; 
            int j = n - 1; 
            int k = m + n - 1; 
            while (j >= 0 && i >= 0) {
                if (nums1[i] >= nums2[j]) { 
                    nums1[k--] = nums1[i--]; 
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
            
            while (j >=0) {
                nums1[k--] = nums2[j--]; 
            }
        }
    }


/*
    Merge twos sorted linkedList
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2; 
        }
        if (l2 == null) {
            return l1; 
        }
        
        ListNode l1Ptr = l1; 
        ListNode l2Ptr = l2; 
        ListNode dummy = new ListNode(-1);
        ListNode pointer = dummy; 
        while (l1Ptr != null && l2Ptr != null) {
            if (l1Ptr.val <= l2Ptr.val) {
                pointer.next = l1Ptr;
                pointer = pointer.next;
                l1Ptr = l1Ptr.next; 
            } else {
                pointer.next = l2Ptr;
                pointer = pointer.next;
                l2Ptr = l2Ptr.next; 
            }
        }
        
        if (l1Ptr != null) {
            pointer.next = l1Ptr; 
        }
        
        if (l2Ptr != null) {
            pointer.next = l2Ptr; 
        }
        
        return dummy.next; 
    }
}
/*
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example:

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
*/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}

/*
    You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Follow up:
    What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

    Example:

    Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 8 -> 0 -> 7
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>(); 
        Stack<Integer> stack2 = new Stack<>(); 
        
        while(l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode list = new ListNode(0);
        //int sum = 0; 
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                list.val += stack1.pop(); 
            } 
            
            if (!stack2.isEmpty()) {
                list.val += stack2.pop(); 
            } 
            
            int sum = list.val;
            list.val = sum % 10;
            ListNode carry = new ListNode(sum / 10);
            carry.next = list; 
            list = carry; 
        }
        
        return list.val == 1 ? list : list.next;
    }
}

```

### Fast-Slow Pointer
- 两根指针一前一后，直到前面的指针走过头
- TC: O(n)
- Usage: 
    - Get in the middle of the ll
    - get the kth from the tail of the ll 
    - Check Cycle

### Check Cycle
```Java 

/*
Check if there is cycle 
    fast -> hop 2 step
    slow -> hop 1 step

    check: fast.next != null && fast.next.next != null
*/ 




public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false; 
        
        ListNode slow = head;
        ListNode fast = head; 
        
        while (fast.next != null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next; 
            if(slow == fast) return true; 
        }
        
        
        return false; 
        
    }
}

```
### Other Same Direction 
- Fancy trick in LinkedList, connected one tail to the head of the other linkedlist 
```java

/*
    Other Same Direction, 
    When shorter list is done, connect it to the head of the longer one 

    When the longer list is done, connect it to the head of the shorter one
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;         
        ListNode ptrA = headA; 
        ListNode ptrB = headB; 
        
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next; 
            ptrB = (ptrB == null) ? headA : ptrB.next; 
        }
        
        return ptrA; 
    }
}
```



### Opposite Direction 
- Usege:
    - N - SUM 
    - Palindrome 

# String
## Substring Problem
Problems:
    if goes up tp input.length() instead of input.length()-1
    leftStr = input.substring(0, input.length()) -> entire String 
    if this is in recursion ,it caused stackoverflow  
    
```java
        for (int i = 0; i < input.length()-1; i++) {
            String leftStr = input.substring(0,i+1); 
            String rightStr = input.substring(i+1);
            List<String> leftRes = helper(leftStr, map, numCharMap);
            List<String> rightRes = helper(rightStr, map, numCharMap);
            for (String left : leftRes) {
                for (String right : rightRes) {
                    set.add(left + right); 
                }
            }
        }
```

- Validate two string , return true 
```java
String t and String s 
        if (s == null || t == null) {
            return s == t;
        }
```



# Binary Search
- Reason
    - Shrink the range of search
    - Need sorted before pefroming operation 
    - Use template lp + 1

- `Conclusion:` 
    - use (lp + 1 < rp) { lp = mid}
    - use (lp <= rp) {lp = mid -1}


```java
    Arrays.sort(nums);
    while (lp + 1 < rp) {
        //Prevent integer overflow 
        int mid = lp + (rp - lp) / 2; 
        if (nums[mid] < target) {
            lp = mid;
        } else if (nums[mid] > target) {
            rp = mid; 
        } else if (nums[mid] == target) {
            rp = mid;
        }
    }

    if (nums[lp] == target) {
        return lp;
    }


    if (nums[rp] == target) {
        return rp;
    }

```
### Binary Search Traps
```java
    /*
    why not use (lp < rp)
    */

    /*
    e.g. find the last index of target using while (lp < rp) <- as mid is always (0+1)/2 = 0 
    lp = mid = 0, it becomes inf loop

    input [1,1], find 2

          1, 1
    lp    ^
    rp       ^
    mid:  0  
    lp    0
    */
    while (lp <= rp) {
        int mid = lp + (rp - lp) / 2; //
        if (nums[mid] < target) {
            lp = mid;
        } else if (nums[mid] > target) {
            rp = mid; 
        } else if (nums[mid] == target) {
            rp = mid;
        }
    }

    if (nums[lp] == target) {
        return lp;
    }


    if (nums[rp] == target) {
        return rp;
    }

```

```java
/*
    81. 
    Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

    (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

    You are given a target value to search. If found in the array return true, otherwise return false.

    Example 1:

    Input: nums = [2,5,6,0,0,1,2], target = 0
    Output: true

    Example 2:

    Input: nums = [2,5,6,0,0,1,2], target = 3
    Output: false

    Follow up:
        This is a follow up problem to Search in Rotated Sorted Array, where nums may contain duplicates.
        Would this affect the run-time complexity? How and why?
    
    E.G. 

    with duplicated number 

    _/  _ 
       /

    at this point, the nums[mid] == nums[lp] == nums[rp]
    you can simply change the start pointer, move it to the right 
    or you can move the right poiner, move it back to left 
    either way, the mid will get smaller and eventually back to normal 
    binary search method

    TC: O(n)
    SC: O(1)
*/
class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false; 
        }
        
        int lp = 0; 
        int rp = nums.length - 1;
        while (lp + 1 < rp) {
            int mid = lp + (rp - lp) /2; 
            if (nums[mid] > nums[lp]) { //left is sorted, the other is rotated
                if (nums[lp] <= target && nums[mid] >= target) {
                    rp = mid; 
                } else {
                    lp = mid;
                }
            } else if (nums[mid] < nums[lp]) {
                if (nums[mid] <= target && nums[rp] >= target) {
                    lp = mid; 
                } else {
                    rp = mid; 
                }
            } else { //This where the difference is when you have duplicated number
                lp++; 
            }
        }
        
        return (nums[lp] == target || nums[rp] == target); 
    }
}

/*
    33. 

    /  
        /

    In this case, there will be no nums[left] = nums[mid] = nums[right]
    TC: O(logn)
    SC: O(1)
*/

public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1; 
        }
        
        int lp = 0;
        int rp = nums.length - 1; 
        /*   l     m      r
            [4,5,6,7,0,1,2], target =0
            lp: 0
            rp: 6
           mid: 3 
        */
        while(lp + 1 < rp) {
            int mid = lp + (rp - lp) / 2; 
            if (nums[mid] < nums[rp]) { //left: rotated sorted array, right: sorted 
                if (nums[mid] <= target && nums[rp] >= target) {
                    lp = mid; 
                } else {
                    rp = mid; 
                }
            } else if (nums[mid] > nums[lp]) { //left side is sorted, right is rotated 
                //
                if (nums[mid] >= target && nums[lp] <= target ) {
                    rp = mid; 
                } else {
                    lp = mid;
                }
            } 
        }
        
        if (nums[rp] == target) {
            return rp; 
        }
        
        if (nums[lp] == target) {
            return lp; 
        }
        
        return -1; 
    
}
```

### First and Last Position in Binary Search 
- Find First: nums[mid] >= target {rp = mid} else {lp = mid}; 
- Find Last: nums[mid] <= target {lp = mid} else {rp = mid};
### Min Max in Rotate Sorted Search 
- Min: find nums[mid-1] > nums[mid] && nums[mid + 1] > nums[mid]
- Max: find nums[mid-1] < nums[mid] && nums[mid + 1] < nums[mid]


- If there is no duplication, think of them as
    - Find Min == finding the first one that is less than the end of the rotated array, e.g. nums[nums.length-1]
           == find the fistst element that is smaller than start of the rotated array, e.g. nums[nums[0]]
                (`Note: this required checking if the array is sorted or rotated sorted, if it is sorted, this cannot find the answer`)
    - Find Max == Find the last number that is larger than the start of the rotated array, e.g. nums[nums[0]]
           == Find the first number that is larger than start part of the rotation
```java

/*

*/
class Solution {
    /*
        find the fistst element that is smaller than start of the rotated array, e.g. nums[nums[0]]
        ***Note: this required checking if the array is sorted or rotated sorted, if it is sorted, this cannot find the answer***
    */
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; 
        }

        /*  
              0 1 2 3 4 5 6
             [4,5,6,7,0,1,2]).
        */
        int lp = 0; 
        int rp = nums.length - 1; 
        int last = nums[rp];
        int first = nums[lp];
        //No rotation 
        if (first < last) {
            return first; 
        }
        
        //If there is rotation 
        while (lp + 1 < rp) {
            int mid = lp + (rp - lp) / 2; 
            if (nums[mid] >= first) {
                lp = mid; 
            } else {
                rp = mid;
            }
        }
        
        return Math.min(nums[lp], nums[rp]); 
    }


    public int findMinV2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; 
        }

        /*  
              0 1 2 3 4 5 6
             [4,5,6,7,0,1,2]).
        */
        int lp = 0; 
        int rp = nums.length - 1; 
        int last = nums[rp];
        int first = nums[lp];

        while (lp + 1 < rp) {
            int mid = lp + (rp - lp) / 2; 
            if (nums[mid] <= last) {
                rp = mid;
            } else {
                lp = mid; 
            }
        }

        return Math.min(nms[lp], nums[rp]);
    }


    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; 
        }

        int lp = 0;
        int rp = nums.length - 1; 
        int first = nums[lp];
        int last = nums[rp]; 

        while (lp + 1 < rp) {
            int mid = lp + (rp - lp) / 2; 
            if (nums[mid] >= first) {
                lp = mid; 
            } else {
                rp = mid; 
            }
        }

        return Math.max(nums[lp], nums[rp]);
    }
}


```


### N sum problem 

Three sum problems, 
- Sort first, 
- Use two pointer to find the sum from the rest of the array to calculate the sum 

How to remove the duplicate??
- Sort first, so that the smallest number of triplet is is always in the front 
- To remove duplicate -> make sure that triplet did not start with the `same smallest number`, thats why you see `if (i >0 && nums[i] == nums[i-1]) continue;` in outer for loop 
- Within the two sum for loop, do the same thing for left pointer and right pointer, so that the `'min' value (pointer by lp)`  and the `'max' value` will not be the same for other tuples. 

```java
/*
    TC: O(n^2)
    SC: O(1)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i >0 && nums[i] == nums[i-1]) continue;
            int lp = i + 1; 
            int rp = nums.length - 1; 
            int sum = - nums[i];
            while (lp < rp) {
                if (nums[lp] + nums[rp] == sum) {
                    res.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                    //move the pointer the last one of the duplicated valie
                    while (lp < rp && nums[lp] == nums[lp+1]) lp++;
                    while (lp < rp && nums[rp] == nums[rp-1]) rp--;
                    lp++; 
                    rp--; 
                } else if (nums[lp] + nums[rp] < sum) {
                    lp++;
                } else {
                    rp--; 
                }
            }
        }
        return res;
    }
}
```
### Fast Slow Pointer
1. Determine whether LL has cycle 
2. Find the point where LL cycle starts/ Find Missing Number 
3. Get to the middle of the LL
4. Get to a certain position of LL 

```java
/*
    Determine whether LL has cycle
    Notice, you only need to check the fast one 
*/
public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    //
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}

    Use two pointers, walker and runner.
    walker moves step by step. runner moves two steps at time.
    if the Linked List has a cycle walker and runner will meet at some
    point.


/*
    Given a linked list, remove the n-th node from the end of list and return its head.
    Example:

    Given linked list: 1->2->3->4->5, and n = 2.

    After removing the second node from the end, the linked list becomes 1->2->3->5.

    Note:

    Given n will always be valid.

    Follow up:
    Could you do this in one pass?
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//This Solution fp and sp starts with dummy, so that the slow can stoped at most *LAST BUT ONE* position to prevent null pointer (slow.next = slow.next.next)
class Solution {
    /*
       d->1->2->3->4->5, and n = 2.
    fp                  ^               
    sp          ^
    c  3 
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fp = dummy;
        ListNode sp = dummy;
        int count = 0; 
        while (fp != null && count != n+1) {
            fp = fp.next; 
            count++; 
        }
        
        while (fp != null) {
            fp = fp.next;
            sp = sp.next;
        }
        //removal
        sp.next =sp.next.next;
        return dummy.next;
    }
}
```

### Same Direction Pointer


### Window Problem
Basic Idea: 
    1. Add one 
    2. Subtract one 
Useage: 
    1. Window [e.g. same size]
    2. Dynamic Size [e.g. log file]

Implementation 
    1. queue
    2. list + map 
    3. 
```java
/*
    Given a string, find the length of the longest substring without repeating characters.

    Example 1:

    Input: "abcabcbb"
    Output: 3 
    Explanation: The answer is "abc", with the length of 3. 

    Example 2:

    Input: "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:

    Input: "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3. 
                Note that the answer must be a substring, "pwke" is a subsequence
    
    Solution: 
    Use two pointer i and j, i = left side of the window, 
    j = right of window 

    use one j for entire iteration of i , use hashmap or array to store the char seen by j, if repeated occur, stop the current i, and remove the current i noticed that if duplicated happended, the i (the leftmost char pointed by i) will be the first duplicate, this can be proved by contradicion
*/

 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0; 
        }
        
        int right = 0;
        int[] window = new int[256]; //store the char in the window 
        int max = 1; 
        
        for (int left = 0; left < s.length(); left++) {
            while (right < s.length() && window[s.charAt(right)] == 0) {
                window[s.charAt(right)]++; 
                max = Math.max(max, right - left + 1); 
                right++; 
            }   
            //remove the duplicate 
            window[s.charAt(left)] = 0; 
        }
        return max; 
    }
}


/*
Design a hit counter which counts the number of hits received in the past 5 minutes.

Each function accepts a timestamp parameter (in seconds granularity) and you may assume that calls are being made to the system in chronological order (ie, the timestamp is monotonically increasing). You may assume that the earliest timestamp starts at 1.

It is possible that several hits arrive roughly at the same time.


Solution: Very Similar to Window problems, use queue to maintain such thay 
    the current time as input - the top of the queue is < 300

    intput (time)
    while (!queue.isEmpty && time - queue.peek() <= 300) {
        queue.pop(); 
    }
*/

class HitCounter {
    Queue<Integer> queue; 
    /** Initialize your data structure here. */
    public HitCounter() {
        queue = new LinkedList<>(); 
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        queue.offer(timestamp); 
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (!queue.isEmpty() && timestamp - queue.peek() >=300) {
            queue.poll(); 
        }
        /*
            queue: 1, 2, 3, 300, 
        */
        return queue.size(); 
    }
}

```
# Greedy 
## Sweep Line 

## Interval 
Idea: Greedy 
- Whether a meeting can start without overlapping is depend on the `Earliest` ending root

Tricks: 
- Normally, start with sorting by the start time 
- Sort by the end time if it is necessary, 
- Always keep track of the `current earliest end time`, this can be done by pre-sort the array by end time 
- 

Swipe Line: 
- Use a line, denoting as t, to swipe through the intervals.
- Pre-sort the start time and end time 
- e.g. Counting the number of airplance in the air,  

Example: 


Merge Interval Steps: 
- Normally, 
    1. sort the intervals by `start time`, 
    2. keep track of an `endTime` to keep track of the `earliest end time`
    3. Use an `startTime` with `endTime` to keep track of the interval `ahead` of the current visiting interval

- if the start time of `current interval` is less than the endTime, 
    - update the endTime to max (endTime, current.end)
- else 
    - update the start time to start time of `current interval`
    - update the end time to end time of the `current interval`

Meeting Room: 
- Keep track of `the earliest ended idx` of the meeting room, the next meeeting will always look for the earliest ending idx of the meeting room. 

- Increment number of room when a meeting starts， decrement when the meeting ends (`Sweep line`)



- Examples:
    - Merge Intervals
    - Find non-overlap Intervals 
    - Meeting Rooms 
    - Find empty subinterval within a large interval 
    - Insert Interval


- Follow up: 
    - Output all the meeting

- Tips and Trikcs:
    - When you sorted the array, the orig index is lost, wrap this point in a class with val and orig idx, sort the new class 

    - Wrap some data into a class, e.g. i nnumber of airline, wrap time and on(True) and time (off) in a class 

    - write comparator for custom class 
    - `TreeMap` for dynamic adding, the key could be start time 

# Follow-Up Trick
- Prefix Sum 
    - Subarray Sum
# Common API
### String API
- Methods: (str <- instance, String <- class)
	1. String[] lists = str. split(RegEx regEx) 
	2. length() <- a method 
	3. str. toCharArray() 
	4. str.substring(I, J) ,  I included, J excluded 
	5. str.toLowerCase(); 
	6. str.toUpperCase() ;
    7. str.startsWith(anotherStr, offset); 
    8. 

- Sorting String:
	1. Char[] charArr = str.toCharArray();
	2. Arrays.sort(charArr) 
	3. String sortedStr = new String(charArr) 

- Storing String
    1. array of 26 Characters(Letters Only)
    2. array of 256 Characters(ASCII )

### Set Api
- Methods 
- Common Task
    - Convert int[] array to set 
    ```java
    Set<T> mySet = new HashSet<T>(Arrays.asList(someArray));
    ```

- StringBuilder() <- Use Builder Pattern, so all operation return object itself
    1. Serial Appending 
        ```java
            StringBuilder sb 
            sb.append("something").append("something")
        ```
    2. insert(idx, element)
        ```
            public StringBuilder insert(int offset, char c)
        ```

### Array/ArrayList Api
- Methods 
    - Arrays.sort()
    - Arrays.fill()

# DFS 
## DFS Combination Base
- 问题模型:求出所有满足条件的“组合”。 
- 判断条件:组合中的元素是顺序无关的。 
- 时间复杂度:与 `2^n` 或者 `n!` 相关
## DFS Permutation Base

## Backtrack
- Core: Add one before next layer of recursion, remove the newly added one after recursion

- If it is passed by reference, then remember to do the following:
    - Peform the core 
    - Deep Copy 
- If it is passed by valuem then no need to do so:
    - E.g. integer, string

### Permutation
1. W/O Duplicated
2. W Duplicated
```java
//W/O duplicated

/*
    Permutation: 
    def: the permutation starting with current set 
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>(); 
        if (nums == null || nums.length == 0) {
            return lists;
        }
        
        Set<Integer> set = new LinkedHashSet<>(); 
        backtrack(nums, set, lists);
        return lists; 
    }
    
    private void backtrack(int[] nums, Set<Integer> set, List<List<Integer>> lists) {
        if (set.size() == nums.length) {
            lists.add(new ArrayList<Integer>(set)); 
            return; 
        }
        
        
        for (int i = 0; i < nums.length; i++)  {
            if (set.contains(nums[i])) continue; 
            set.add(nums[i]);
            backtrack(nums,set, lists); 
            set.remove(nums[i]);
        }
    }
}
```

**Removing the duplication
Use an extra boolean array " boolean[] used" to indicate whether the value is added to list.

Sort the array "int[] nums" to make sure we can skip the same value.

when a number has the same value with its previous, we can use this number only if his previous is used

```
    e.g. 

        1    1' 2 3 
        /    /
    {1,1'} {1',1}
    {1,2}  {1',2}
    {1,3}  {1',3}

    Two sets are identical, when a number has the same value with its previous, we can use this number only if his previous is used

    so that when finish finding all the combinatipo the 1s and backtrack, the 1s is not used (e.g. used[0] = false) and therefore 1' can not use 1s and entire 1' will be skipped
```

```java
//W duplicated 

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        //base case
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
            dfs(nums,used,list,res);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
}
```

### Subset
    
1. W/O Duplicate
2. W Duplicate

```
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```

```java
/*
    Start paramer here indicated the level (idx)
    determing whether the current idx is using or not
    
              []
          /        \
    0   [   ]       [1]
        /    \       /    \
    1  []    [2]     [1] [1,2]
      / \    /  \      /\   /\
    2[] [3] [2] [2.3] 
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return lists; 
        }
        
        backtrack(0, nums, new ArrayList<Integer>(), lists);
        return lists; 
    }
    
    //Start indicate which layer you are working on 
    private void backtrack(int start, int[] nums, List<Integer> list, List<List<Integer>> lists) {
        if (start == nums.length){
            lists.add(new ArrayList<>(list)); 
            return; 
        }
        
        //Without the current number 
        backtrack(start + 1, nums, list, lists);
        //With the current number 
        list.add(nums[start]);
        backtrack(start + 1, nums, list, lists);
        list.remove(list.size()-1); 
    }

    //Another way of writing it 
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return lists; 
        }
        
        //Arrays.sort(nums); 
        List<Integer> list = new ArrayList<>(); 
        dfs(0, nums, list, lists); 
        return lists;
    }
    
    private void dfs(int start, int[] nums, List<Integer> list, List<List<Integer>> lists) {
        lists.add(new ArrayList<>(list)); 
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(i+1, nums, list, lists);
            list.remove(list.size() -1); 
        }
    }
}

```


```java
/*
    Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

    Note: The solution set must not contain duplicate subsets.

    Example:

    Input: [1,2,2]
    Output:
    [
    [2],
    [1],
    [1,2,2],
    [2,2],
    [1,2],
    []
    ]

*/
public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
} 
```

### Palindrome 

- Palindrome 
```java
/*
    Given a string s, partition s such that every substring of the partition is a palindrome.

    Return all possible palindrome partitioning of s.

    Example:

    Input: "aab"
    Output:
    [
    ["aa","b"],
    ["a","a","b"]
    ]
*/  

```


### Matrix DFS
- Matrix/2D dfs 
    - Check boundary inBound()
    - marked visited[m][n] <- m = row, n = col
```java
/*

Each dfs, recording the start point
has the  xDiff (col - startCol) and yDiff (row - startRow) using 
2 * (yDiff) * colLen + xDiff, as the  yDiff can be positive and negative, times 2 will help prevent mapping to the same indexx 

*/
class Solution {
    int[] dy = new int[]{0, 0, 1,-1};
    int[] dx = new int[]{1, -1, 0,0};
    
    public int numDistinctIslands(int[][] grid) {
        
        if (grid == null || grid.length == 0) {
            return 0; 
        }
        
        
        if (grid[0] == null || grid[0].length == 0) {
            return 0 ;
        }
        
        int m = grid.length; 
        int n = grid[0].length; 
        boolean[][] visited = new boolean[m][n];
        Set<Integer> shape = new HashSet<>(); 
        Set<Set<Integer>> shapes = new HashSet<>(); 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || grid[i][j] == 0) continue; 
                shape = new HashSet<>();
                dfs(i, j, i,j,grid, visited, shape); 
                shapes.add(shape);
            }
        }
        
        return shapes.size(); 
    }
    
    private void dfs(int row, int col, int sRow, int sCol, int [][] grid, boolean[][] visited, Set<Integer> shape) {
        /*
        if (!inBound(row, col, grid) || visited[row][col] || grid[row][col] == 0){
            return; 
        } 
        */
        visited[row][col] = true;
        shape.add(2 * (row - sRow) * grid[0].length + (col - sCol));
        for (int i = 0; i < dx.length; i++) {
            int xDiff = dx[i];
            int yDiff = dy[i];
            int xNext = col + xDiff;
            int yNext = row + yDiff;
            
            if (!inBound(yNext, xNext, grid) || visited[yNext][xNext] || grid[yNext][xNext] == 0) {
                continue;
            } 
            
            dfs(row + yDiff, col + xDiff, sRow, sCol, grid, visited, shape);
        }
    }
    
    private boolean inBound(int row, int col, int[][] grid) {
        int m = grid.length;
        int n = grid[0].length; 
        
        return (row >= 0 && row < m) && (col >= 0 && col < n);
    }
}
```
# Tree
### Level Order Traversal
- SC: O(1) with pointers to next leve l
- SC: O(n) with Queue

```java
    /*
        LC 117
    */
    public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return; 
        }
        
        //same level 
        while (root != null) {
            //pointers for next level 
            TreeLinkNode nextDummy = new TreeLinkNode(-1); 
            TreeLinkNode nextPtr = nextDummy; 
            
            //Traverse in the same level 
            while (root != null) {
                if (root.left != null) {
                    nextPtr.next = root.left; 
                    nextPtr = nextPtr.next; 
                }
                
                if (root.right != null) {
                    nextPtr.next = root.right; 
                    nextPtr = nextPtr.next; 
                }
                
                root = root.next; 
            }
            
            root = nextDummy.next; 
        }
    }

    /*

    */
}
```
### Iterative Traversal
- in a binary search tree (BST), use a stack for iterative traveral, 
- `For the current root`, The next smallest number is on top of stack 

```Java

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

    /**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    TreeNode curr; 
    Stack<TreeNode>stack;
    public BSTIterator(TreeNode root) {
        curr = root; 
        stack = new Stack<>(); 
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (!stack.isEmpty() || curr != null) {
            return true;
        }
        return false; 
    }

    /** @return the next smallest number */

    //
    public int next() {
        //in order traversal 
        while (curr != null) {
            stack.push(curr);
            curr = curr.left; 
        }
        
        curr = stack.pop(); 
        int val = curr.val; 
        curr = curr.right; 
        return val;
    }
}

/*
    In Order Iterative Traversal 
*/

 public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root; 
        while (current != null || !stack.isEmpty()) {
            //push left child to the stack
            while (current != null) {
                stack.push(current); 
                current = current.left; 
            }
            
            //all the left child are in stack, check the root 
            current = stack.pop();
            list.add(current.val); 
            current = current.right; 
        }
        
        return list;
    }

/*
    Pre-order Iterative 
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>(); 
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list; 
        }
        
        stack.push(root); 
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            list.add(current.val); 
            if (current.right != null) {
                stack.push(current.right); 
            }
            
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        
        return list; 
    }
}

```
### Divide and Conquer
- Think of it as post - order 
- Return result during the traversaling (post order)
- result can be wrapper in ResultType class for more information

```java
```



## Trie

### Trie Template

```java

/*
    The children can be done in HashMap as well. 
    Usually, hashmap is faster if the children is sparse. 
    The array is faster if the array is densed
*/
class Trie {
    TrieNode root; 
    Trie() {
        root = new TrieNode();
    }

    public void insert(String aStr) {
        TrieNode pointer = root; 
        for (int i = 0; i < aStr.length(); i++) {
            char ch = aStr.charAt(i);
            if (pointer.children[ch-'a'] == null) {
                pointer.children[ch-'a'] = new TrieNode(ch); 
            }
            pointer = pointer.children[ch-'a']; 
            if (i == aStr.length() - 1) {
                pointer.isWord = true;
            }
        }
       
    }
    
    public TrieNode search(String prefix) {
        TrieNode pointer = root;
        TrieNode[] children = pointer.children; 
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (children[ch - 'a'] == null) {
                return null;
            }
            pointer = children[ch-'a'];
            children = pointer.children; 
        }
        return pointer; 
    }

    public List<String> getSuggestions(String prefix, int k) {
        List<String> list = new ArrayList<>(); 
        TrieNode prefixNode = search(prefix);
        if (prefixNode == null) {
            return list; 
        }
        //preorder traversal 
        return getSuggestionHelper(prefixNode,k, prefix);
    }
```


### Auto Complete
On top on the Trie Class, autocomplete essentially does a preorder traversal, the k here is the limiting the number of returning result.
```Java
    private List<String> getSuggestionHelper(TrieNode root, int k, String prefix) {
        List<String> result = new ArrayList<>(); 
        //preorder traversal
        //base case
        if (root.isWord) {
            result.add(prefix); 
            k--;
        }

        //visit children
        TrieNode[] children = root.children;  
        for (int i = 0; i < children.length; i++) {
            if (children[i] != null) {
                result.addAll(getSuggestionHelper(children[i], k,prefix + String.valueOf(children[i].ch)));
            }
            if (result.size() >= k) {
                break; 
            }
        }
        //Trim to size
        if (result.size() >= k) {
            result.subList(k, result.size()).clear();
        }
        return result; 
    }
   
}
```

#### Hash Trick 
If you want to use a pair as key, for numebrs, e.g. (1,2) as key, mapping to some value, e.g. val = 2 , use `Matrix` to do it. 

```java
    dp[1][2] = 2;
    
```

Hashing the relative location based on matrix[i][j]
```java

```
## BFS 
### When to Use BFS

- Traversal in Graph
    - Level Order Traversal 
    - Connected Component(点到面)
    - Topological Sorting 

- Shorted Path in Simple Graph
    - Simple Graph: `Undirected`,  `Unweighted`, `No graph loop`, `no multiple edge connecting two verticis`

- Iterative solution for all possible results 

### BFS Usage
- Binary Tree
    - Matrix 
    - Graph
        - What's differnce between travesal on tree and graph? 
            - more children node 
            - contains circle
            - TC: O(M + N) (M: # of edges, N: # of nodes)  
                worst case M = O(N^2)
            - SC: O(N)
    - Topological Sort
### BFS Key Point
- Usage Queue <- can be done in Stack as well 
- Level order ?? <- If yes, then get the size, and do 
    
    ```java
        for (int i = 0; i < queue.size(); i++) {

        }
    ```
### Topo Sort 
- If there is a circle, the vertice in circle will not be included in the topological sort 

- Usage:    
    - 求任意1个拓扑序(Topological Order)
        - DFS (one node with 0 indegree is provided, nothing else)
        - BFS (with Queue and `known graph (known indegree)`)
    - 问是否存在拓扑序(是否可以被拓扑排序) <- (Check size of tological sort vs # of vertice)
    - 求所有的拓扑序 
        (Needs DFS)
    - 求是否存在且仅存在一个拓扑序 (Queue中最多同时只有1个节点) 

- Implementation:
    - BFS with Queue and known graph (known indegree and outdegree)
    - DFS with explicit stack `Once all the nodes are visited, then put the curren node to stack`, print the stack in `REVERSE` order

- Course Schedule <- Kahm's Algo 
    - Example of testing if it is topological sortable
    ```Java

        Queue queue = new LinkedList();
        //Find all the ingree == 0 
        for(int i = 0; i < degree.length; i++){
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
        
        //Check each node, remove the edges, decrement the indgree to its children,
        int count = 0;
        while(!queue.isEmpty()){
            int course = (int)queue.poll();
            //Increment the count when you see one with 0 indegree
            count ++;
            int n = edges[course].size();
            for(int i = 0; i < n; i++){
                int pointer = (int)edges[course].get(i);
                degree[pointer]--;
                if (degree[pointer] == 0) {
                    queue.add(pointer);
                }
            }
        }
    ```


- Topological 

# Optimal Distancce
- Shortest Graph
    - Simple Graph
        - BFS
    - Complex Graph
        - Dijkstra,

- Longest Distance
    - 可分层 
        - DP
    - 不可分层
        - DFS


# Stack 
- Usage 
    - Parsing / Decoding / Calculator 
    - Tempory Storage 
    -   MonoStack
    - Recursive to Iterative
    - Reverse

- Implementation
    - LinkedList

## Parsing 
```Java
/*

Use stack to store the previous left side char such as '(', '[' and '{'. 

if the current one is the right side, ')', ']' , '}' then check the previous one stored in top of the stack


*/
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true; 
        }
    
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (key == '(' || key == '[' || key == '{') {
                stack.push(key); 
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                
                char top = stack.peek(); 
                if ((key == ')' && top != '(') || (key == ']' && top != '[') || (key == '}' && top != '{')) {
                    return false; 
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty(); 
    }
}

```

## MonoStack
Idea: 
- Use a stack to store the `previous` information
- The stack will be an increasing or decresing sequence (monotone)
- e.g. a decreasing monostack <- Whenever you see a number larger than top of the stack, pop the stack until top of the stack is less than current number 
- Next Greater <- mono descrement stack 
- Next Smaller <- mono increment stack\ 
```java
class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[findNums.length]; 
        for (int i = 0; i < nums.length; i++) {
            //pop any number that is less than the current nums; 
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                map.put(stack.pop(), nums[i]); 
            }
            
            stack.push(nums[i]); 
        }
        
        for (int i = 0; i < findNums.length;i++) {
            res[i] = map.getOrDefault(findNums[i], -1); 
        }
        
        return res; 
    }
}

```

# Queue
## Queue Problem
    - Windows 
    - BFS
    - Level Order Traversal
    - Mono Queue

## Queue Implmentation
## Queue Details

# Heap

## When to use Heap
- 见到需要维护一个集合的最小值/最大值的时候要想到用堆 (看到Min/Max就要想到heap)
- 看到median 想到heap
- 第k小的元素，Heap用来维护当前候选集合
- 如果给出的数组没有排序, 先排序, 然后用heap.

## Heap example
exmaple: Stream problem 
```java

```

# LinkedList
- Type:
    1. Singly
    2. Doubly

- Pros and Cons: 
    1. Doubly can delete much easier, as `prev` pointer is built in 
    2. Singly needs a prev pointer to delete 

- Common Problems;
    1. Delete Cycle I and II
    2. Intersection of nodes 
    3. Combo with Hashmap for fast retrieve 

## Doubly Linked List
- insert
- Delete 
- Searchg
- Change

# Bit Manipulation 

### Bit Hacks
- Bit OR |, AND &, XOR ^
- Bit shift: <<, >>; the result of shift has to be stored : a = a >> 1;
- A << 1: binary of A shifted left for 1 bit, which result in value x 2
- A >> 1: divide by integer 2. Note: decimals are ignored in the result.
- bit shift is a lot faster than reqular 'times' operation.
- 32 bit number: leading bit = 1, negative numbjer; leading bit = 0, positive number.
- '>>' add leading '1' if the 32 bit number originally has leading '1'.
- Java/python: logical shift >>>, always add leading '0' regardless of the sign of the 32-bit number. That is, it may turn a negative number to positive, if the leading bit is originally '1'
- Because with '( )', make sure to surround the desired operation
    & 0000 = clean up; | ABC = assign ABC
- A^B=C, then A = B^C
- bits可以用来表示不同的状态, 比如2bit可以表示4种状态: 00, 01, 10, 11
- Math.pow(2, h) = 2 << (h - 1); 2 << 1就是把所有bits往左移动一位, 也就是 * 2
- Also, 1 << h = 2 ^ h; 1 << h 就是 2 * 2 * 2* ....乘h次.
- bit operation should be in parentheses

## Bit Example
### Find the missing number 
One bit hack is XOR, assuming the A3 is missing 
    target = 0 ^ A1 ^ A2 ^ A3
    actual = 0 ^ A1 ^ A3 

    target ^ actual = A2 
```java
/*
    Use the bit han
*/
class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int targetSum = 0; 
        for (int i = 1; i <n+1; i++) {
            targetSum ^= i;
        }
        
        int actualSum = nums[0];
        for (int i = 1; i <n; i++) {
            actualSum ^= nums[i]; 
        }
        
        return targetSum ^ actualSum; 
    }
}
```

### Count numebr of 1 bits
```java 
// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            //check state
            count += n & 1; 
            n = n >>> 1; //unsigned 
                        //signed shift 
            
        }
        return count; 
    }
```

# Recursion 
## Recursing scenario 
- Key Point: Same problem happens recursively, normally dynamic
    - Pointers + recursion 

    
``` java
/*
    字符消消乐，删除3个及以上的连续字符。​ "aabbbbac" -> "c", "aaabb" -> "bb" 可以用 stack 解决，也可用指针 recursion 做。

    
    aa(bbbb)ac -> aaac -> c 

    TC: O(n^2) => T(n) = T(n-3) + O(n)
    SC: O(1) heap, O(n) stack
*/
public class RemoveThree {
    public static String removeConsecutive(String s)            
        for (int i=0,j=0; j<s.length(); j++) {
            // increment j until we sedifferent char
            if (s.charAt(i) == s.charAt(j)) continue;
            // delete the repeatsequence with more than3 chars
            if (j-i >= 3) {
                    return removeConsecutive(s.substring(0,i)+s.substring(j));
            }
            else {
                    // search repetitfor a new cha
                    i = j;
            }
        }
        return s;
    }

    /*
        Use Stack
        TC: O(n)
        SC: O(n) heap
    */

    public static String removeConsecutiveStack(String s) {
        Stack<Character> stack = new Stack<>(); 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.size() < 2) {
                stack.push(ch); 
                continue; 
            }

            char prev = stack.pop();
            char prevPrev = stack.pop();
            if (ch == prev && ch == prevPrev) {
                continue; 
            }
            stack.push(prevPrev);
            stack.push(prev);
            stack.push(char); 
        }

        StringBuilder sb = new StringBuilder(); 
        while (!stack.isEmpty()) {
            sb.append(stack.pop()); 
        }

        return sb.reverse().toString(); 
    }    
}

```


