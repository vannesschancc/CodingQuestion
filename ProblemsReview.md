# 241. Different Ways to Add Parentheses

Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.

```
Example 1:
Input: "2-1-1"
Output: [0, 2]
Explanation: 
((2-1)-1) = 0 
(2-(1-1)) = 2

Example 2:

Input: "2*3-4*5"
Output: [-34, -14, -10, -10, 10]
Explanation: 
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
```

Thoughts:
```
Divide and C is the key to the problem
(2 * 3 - 4 * 5) can be broken down such as 2 * (problem (3-4 * 5)), (2 * 4 - problem(4 * 5))

The return type for each recursion is the combination of two array, leftArr and right Arr, each time size(leftArr) * size (rightArr) is generated. 

This can be optimazed by storing the 

```
Complexity
```
SC: O(n^3) for stack 
Space: call stack is O(log2_n). For every node, we generate two lists of O(n), so total complexity is O(log2_n + n^2 * n) = O(n^3).

By referring this post
len is the number of valid number in string

   1        1
   2        T(1) + T(1)                                    = 2
   3        (T(1) + T(2)) + (T(2) + T(1))                  = 6
   4        (T(1) + T(3)) + (T(2) + T(2)) + (T(3) + T(1))  = 18 

We can find that T(len) = 3 * T(len - 1), it should be O(3^n).
Since the exponential growths much faster than polynomial, we don't to care about n^3.
```



Code
```
public class Solution {
    /**
     * @param input: a string
     * @return: return List[int]
     */
    public List<Integer> diffWaysToCompute(String input) {
        // write your code here
        Map<String, List<Integer>> map = new HashMap<>(); 
        List<Integer> result = helper(input, map); 
        return result; 
    }
    
    public List<Integer> helper(String input, Map<String, List<Integer>> map) {
        if (map.containsKey(input)) {
            return map.get(input); 
        }
        
        List<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                String leftStr = input.substring(0, i); 
                String rightStr = input.substring(i+1); 
                List<Integer> leftRes = helper(leftStr, map);
                List<Integer> rightRes = helper(rightStr, map);
                for (Integer left : leftRes) {
                    for (Integer right : rightRes) {
                        int aResult = 0; 
                        switch(input.charAt(i)) {
                            case '+':
                                aResult = left + right; 
                                break;
                            case '-':
                                aResult = left - right; 
                                break;
                            case '*':
                                aResult = left * right; 
                                break;
                        }
                        list.add(aResult); 
                    }
                }      
            }  
        }
        //This is good 
        if (list.size() == 0) {
            list.add(Integer.parseInt(input)); 
        }
        map.put(input, list); 
        return list;
    }
}
```



# Meeting Room IIi 
Informally, it works because:
- No two meetings can overlap, and no meetings can be removed. Therefore whenever two meetings overlap and there is no available meeting room, a new meeting room MUST be created

- To minimize meeting rooms, we need to `minimize the amount of time wasted` (a.k.a. the time that the meeting room is not being used and is free). Therefore, we sort the meeting rooms by their end time (`so that we can get the earliest available meeting room`) and `sort the upcoming meetings by their start time` (so we can get the earliest meeting that can occupy that meeting room). If there is no meeting room available, then we must create a new one for that meeting.

We maximize the use of the existing meeting rooms and therefore we minimize the number of meeting rooms created.
