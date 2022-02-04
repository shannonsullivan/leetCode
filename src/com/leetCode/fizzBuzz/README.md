## 412. Fizz Buzz

Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.\
answer[i] == "Fizz" if i is divisible by 3.\
answer[i] == "Buzz" if i is divisible by 5.\
answer[i] == i (as a string) if none of the above conditions are true.


### Example 1:

Input: n = 3\
Output: ["1","2","Fizz"]

### Example 2:

Input: n = 5\
Output: ["1","2","Fizz","4","Buzz"]

### Example 3:

Input: n = 15\
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


### Constraints:

1 <= n <= 10<sup>4</sup>

### Pseudocode:

1. Instantiate new array list for output
2. Iterate through input 1 - n
3. If i mod 3 equals 0
4. Then add Fizz to list
5. Else if i mod 5 equals 0
6. Then add Buzz to list
7. Else if i mod 3 and i mod 5 equals 0
8. Then add FizzBuzz
9. Else add Integer to string
10. Return list