### Dict 
- dict.pop(k): remove key k **O(1)**
- dict.clear(): clear **O(1)**
- popitem(): `randomly` remove an item 

### List 
- append(): Add an element to the end of list **O(1)**
- extend(list): add all elements of a lists to another list **O(len(list))**
- pop(): removes and returns the last element **O(1)**
- pop(idx): remove and returns at given index  **O(n)**
- remove(elem): remove the element **O(n)**
- insert(idx, value) **O(1)**
- clear(): empty the entire lists **O(1)**
- slicing() **O(n)**
    - [a:b] slide the array from a to b-1 => [a]
    - [-a:-b]
    - [::-1] reverse
- sort() **O(nlogn)**
- min() / max() **O(n)**
- reverse() **O(n)**
- copy() **O(n)**
```python

List = [1,2,3,4] 
print("Initial List: ") 
print(List) 
  
# Addition of Element at  
# specific Position 
# (using Insert Method) 
List.insert(3, 12) 
List.insert(0, 'Geeks') 
print("\nList after performing Insert Operation: ") 
print(List) 

'''
Initial List: 
[1, 2, 3, 4]

List after performing Insert Operation: 
['Geeks', 1, 2, 3, 12, 4]
'''

List = [1,2,3,4] 
print("Initial List: ") 
print(List) 
  
# Addition of multiple elements 
# to the List at the end 
# (using Extend Method) 
List.extend([8, 'Geeks', 'Always']) 
print("\nList after performing Extend Operation: ") 
print(List) 

'''
Initial List: 
[1, 2, 3, 4]

List after performing Extend Operation: 
[1, 2, 3, 4, 8, 'Geeks', 'Always']
'''



List = [1,2,3,4,5] 
  
# Removing element from the  
# Set using the pop() method 
List.pop() 
print("\nList after popping an element: ") 
print(List) 
  
# Removing element at a  
# specific location from the  
# Set using the pop() method 
List.pop(2) 
print("\nList after popping a specific element: ") 
print(List) 

'''
List after popping an element: 
[1, 2, 3, 4]

List after popping a specific element: 
[1, 2, 4]
'''

Sliced_List = List[::-1] 
print("\nPrinting List in reverse: ") 
print(Sliced_List) 


'''
Initial List: 
['G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S']

Printing List in reverse: 
['S', 'K', 'E', 'E', 'G', 'R', 'O', 'F', 'S', 'K', 'E', 'E', 'G']
'''
```

### random 
- randint(start, end): generate a random number from [start, end], Python3 only 
- choince(container): generate 1 random number from the container 

- randrange(begin, end, step): generate random number from begin to end with steps 

- random.shuffle(list): shuffle the list, in placeß

```python

import random 

# generate random int between a and b 

# randint() is inclusive, but range() is exclusive 
# generate random number from 0 to 10, inclusive
r1 = random.randint(0,10)


print ("A random number from list is : ",end="") 
print (random.choice([1, 4, 8, 10, 3])) 
  
# using randrange() to generate in range from 20 
# to 50. The last parameter 3 is step size to skip 
# three numbers when selecting. 
print ("A random number from range is : ",end="") 
print (random.randrange(20, 50, 3)) 


li = [1, 4, 5, 10, 2] 
  
# Printing list before shuffling 
print ("The list before shuffling is : ", end="") 
for i in range(0, len(li)): 
    print (li[i], end=" ") 
print("\r") 
  
# using shuffle() to shuffle the list 
random.shuffle(li) 

##
```

### Python Custom Comparator
```python 
#remove element 
# language set
language = {'English', 'French', 'German'}

# 'German' element is removed
language.remove('German')

#if element did not exist, keyError exception will rise 
language.remove('China')

#remove element on index 

```
### heap 
- Notice that when you push, the first element in tuple is used to compare, then second, then third and etc
- api
    -  heappushpop(heap, ele) :
        - push first, then pop 
    -  heapreplace(heap, ele) :
        - pop first, then pop
```python
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        for num in nums:
            freq_map[num] = freq_map.get(num, 0) + 1
        
        import heapq 
        heap = [] #heapify an empty array 
        heapq.heapify(heap) #does not return anything, use it in place
        res = []
        for elem, freq in freq_map.items():
            #In push(), first argument is heap, second argument is the elment to insert
            heapq.heappush(heap, (freq, elem)) 
            
            #In push()
            if len(heap) > k:
                heapq.heappop(heap)
                
        for elem in heap:
            res.append(elem[1])
    
        return res


```
- Comparator method, need to override the `__lt__`, `__eq__`, `__gt__` method 
```python 
class FreqWord(object):
    def __init__(self, freq, word):
        self.word = word
        self.freq = freq 
    
    def __lt__(self, other):
        if self.freq != other.freq:
            return self.freq < other.freq
        else:
            return self.word > other.word
    
    def __eq__(self, other):
        return self.freq == other.freq and self.word == other.word
        
class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        word_freq = {word : 0 for word in words}
        for word in words:
            word_freq[word] = word_freq[word] + 1
        
        import heapq
        
        #use min heap 
        heap = []
        heapq.heapify(heap)
        
        for word,freq in word_freq.items():
            elem = FreqWord(freq, word)
            heapq.heappush(heap,elem)
            if len(heap) > k:
                heapq.heappop(heap)
        res = []
        for _ in range(k):
            res.append(heapq.heappop(heap).word)
            
        return reversed(res)
```


### deque
- from collections, not in place 
- need to use the assginment
- api
    - append(): insert value to right end 
    - appendleft(): insert value to left end 
    - pop(): delete an element from right end of deque 
    - popleft(): delete an element from left end of the queue

    ```python
    # Python code to demonstrate working of  
    # append(), appendleft(), pop(), and popleft() 
    
    # importing "collections" for deque operations 
    import collections 
    
    # initializing deque 
    de = collections.deque([1,2,3]) 
    
    # using append() to insert element at right end  
    # inserts 4 at the end of deque 
    de.append(4) 
    
    # printing modified deque 
    print ("The deque after appending at right is : ") 
    print (de) 
    
    # using appendleft() to insert element at right end  
    # inserts 6 at the beginning of deque 
    de.appendleft(6) 
    
    # printing modified deque 
    print ("The deque after appending at left is : ") 
    print (de) 
    
    # using pop() to delete element from right end  
    # deletes 4 from the right end of deque 
    de.pop() 
    
    # printing modified deque 
    print ("The deque after deleting from right is : ") 
    print (de) 
    
    # using popleft() to delete element from left end  
    # deletes 6 from the left end of deque 
    de.popleft() 
    
    # printing modified deque 
    print ("The deque after deleting from left is : ") 
    print (de) 
    ``` 

### Stack
- Stack is implemented with list, 
- pop() will remove the last one, just as stack
```python
def calculate(self, s):
    res, num, sign, stack = 0, 0, 1, []
    for ss in s:
        if ss.isdigit():
            num = 10*num + int(ss)
        elif ss in ["-", "+"]:
            res += sign*num
            num = 0
            sign = [-1, 1][ss=="+"]
        elif ss == "(":
            stack.append(res)
            stack.append(sign)
            sign, res = 1, 0
        elif ss == ")":
            res += sign*num
            res *= stack.pop()
            res += stack.pop()
            num = 0
    return res + num*sign
```

### Set
- add(element): **O(1)**
- ele in set: **O(1)**
- remove(element): **O(1)**
- clear(element): **O(1)**
- pop(): popped value `randomly`



### OOP
- inheritance 
- poly
- static 

### scope 
- "global" keyword 

### string and char
- compare char ignore case 
- ord('a'), prints the Unicode for 'a''
- str.isalnum(), checks all the characters in a given string (str) is alphanumeric or not. i.e. "abc123".isalnum() -> true 

- API
    - ch.isdigit() 
    - ch.isspace()
    - ch.sialnum()
    - ord(ch): return unicode of ch, if ch is a string with len of 1 
    - chr(num): return string whose unicode point is num
```python 
name = "M234onica"
print(name.isalnum()) #True

# contains whitespace
name = "M3onica Gell22er " #False
print(name.isalnum())

name = "Mo3nicaGell22er" #True
print(name.isalnum())

name = "133" #Trueß
print(name.isalnum())

```