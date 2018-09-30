Table of Content
================

* [Table of Contents](#table-of-contens)
* [Array](#array)
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
* [Heap](#Heap) 
    * [Stream](#Stream)
        * [Something in Stream](#Something\ in\ Stream)

* [DP](#DP)
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

* [LinedList](#LinkedList)
    * [Common Technique](#Common\ Technique)
        * [Fast/Slow](#Fast\ Slow\ Pointer)
        * [Operation](#LinkedList\ Operation)
        * [DummyNode](#Dummy\ Node)


* [Tree](#Tree)
    * [Tree Traversal](#Tree\ Traversal)
        * [Recursive](#Recursive\ Traversal)
        * [Iterative](#Iterative\ Traversal)
    * [Divide and Conqueuer](#Divide\ and\ Conquer)
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
    * [Queue](#Queue)
        * [Queue\ Implementation](#Queue\ Implmentation)
        * [Details\ Queue](#Queue\ Details) 
    * [When to use](#When\ to\ Use\ BFS)
    * [What to solve](#What\ to\ Solve\ BFS)
    * [Key Point](#BFS\ Key\ Point)
* [Trie](#Trie)
    * [Template](#Trie\ Template)
    * [Prefix](#Trie)
    * [AutoComplete](#Auto\ Complete)
* [Bit Manipulation](#Bit\ Hack)
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
## 判断
- count: Calculate how many, 
- min / max 
- Possiblity, and / or / true / false 
- from recursive to dp, from bottom up to top down 
- `Under lots of senario, top-down DFS + memp = bottom-up DP`

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
- 记忆化: 从大到小, 先算一遍 dp[n-1]


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
            
            wb("leetcode") = wb("") && inDicr("leetcode")
                          || wb("l") && inDicr("eetcode")
                          || wb("le") && inDicr("etcode")
                          || wb("lee") && inDicr("tcode")
                          || wb("leet") && inDicr("code")
          wb("leet") = wb("") && inDicr("leet") -> return true
                    || wb("l") && inDicr("eet")
            
        */
        boolean[] dp = new boolean[s.length() + 1];
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




## Pointer Problems

### Read-Write Pointer
1. Read and Write Pointer -> ` In place replacement, remove duplicated`
    - If you found the undesired number, keep the write pointer here, until you read a valid one, replace it, then increment write
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

- Usage: 
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

```Java 

/*
Check if there is cycle 
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
### Other Same Direction 

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
# Binary Search
- Reason
    - Shrink the range of search
    - Need sorted before pefroming operation 
    - Use template lp + 1

```java
    Arrays.sort(nums);
    while (lp + 1 < rp) {
        int mid = lp + (rp - lp) / 2; //Prevent integer overflow 
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

### Min Max in Rotate Sorted Search 

If there is no duplication, think of them as
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
    
*/

/*
    Solution: 
    Use two pointer i and j, i = left side of the window, 
    j = right of window 

    use one j for entire iteration of i , use hashmap or array to store the char seen by j, if repeated occur, stop the current i, and remove the current i 

    noticed that if duplicated happended, the i (the leftmost char pointed by i) will be the first duplicate, this can be proved by contradicion 
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

```
## Common API
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

#### Substring Problem
Problems:
    if goes up tp input.length() insteaf of input.length()-1
    leftStr = input.substring(0, input.length()) -> entire String 
    if this is in recursion ,it cased stackoverflow  
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
String t and Strign s 
        if (s == null || t == null) {
            return s == t;
        }
```


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


### Iterative Traversal
```Java
    /*
        In Order Iterative Traversal 
    */


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
        - BFS
    - 问是否存在拓扑序(是否可以被拓扑排序) <- (Check size of tological sort vs # of vertice)
    - 求所有的拓扑序 
        (Needs DFS)
    - 求是否存在且仅存在一个拓扑序 (Queue中最多同时只有1个节点) 

- Implementation:
    - 

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
# Bit Manipulation 
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
            count += n & 1; 
            n = n >>> 1; //unsigned 
                        //signed shift 
            
        }
        return count; 
    }
```


