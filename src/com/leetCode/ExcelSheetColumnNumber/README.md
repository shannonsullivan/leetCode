#171. Excel Sheet Column Number
Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

#For example:
A -> 1\
B -> 2\
C -> 3\
...\
Z -> 26\
AA -> 27\
AB -> 28\
...

#Example 1:
Input: columnTitle = "A"\
Output: 1

#Example 2:
Input: columnTitle = "AB"\
Output: 28

#Example 3:
Input: columnTitle = "ZY"\
Output: 701

#Constraints:
- 1 <= columnTitle.length <= 7
- columnTitle consists only of uppercase English letters.
- columnTitle is in the range ["A", "FXSHRXW"].

#Pseudocode:
1. Initialize result to 0
2. Iterate through characters in input string
3. Set result equal to result multiplied 26 plus ith position minus char A plus 1
4. 26 characters in english alphabet plus the position in string minus the  char A which is the value in the ascii table
5. Return results
