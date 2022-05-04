# 49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

### Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]\
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

### Example 2:

Input: strs = [""]\
Output: [[""]]

### Example 3:

Input: strs = ["a"]\
Output: [["a"]]


### Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

### Pseudocode:

1. Initialize new hashMap with String and List of String
2. Iterate through input array
   1. Sort char in each string by initializing new char array
   2. Initialize string of sorted chars 
   3. Check if map contains the key from sorted char string
      1. Get key from map and add original string from array
   4. Else put sorted string in new array list
   5. Get key from map and add original string from array
3. Return new array list that returns a collection view of values