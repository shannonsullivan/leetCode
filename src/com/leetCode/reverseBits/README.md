## 190. Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

### Note:

- Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
- In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.

### Example 1:

Input: n = 00000010100101000001111010011100\
Output:    964176192 (00111001011110000010100101000000)\
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.

### Example 2:

Input: n = 11111111111111111111111111111101\
Output:   3221225471 (10111111111111111111111111111111)\
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.


### Constraints:

- The input must be a binary string of length 32

### Notes:

- For a signed 32bit integer the reverse is always a 2's complement
- 2's complement of number is obtained by adding 1 to the 1's complement
- Signed integer result = (result | 1) OR  (result + 1)

### Pseudocode:

Divide and conquer with bit masking
1. Apply mask to make one half 0 (1's to keep 0's to get rid of)
2. Perform AND operation on input with masks
3. Shift each side 16 bits 
4. Merge both outputs using OR operation
5. Perform same for 8, 4, 2, 1 bits
6. Find 16 bit mask with hexadecimal representation of 15 = oxf 
7. (16 bits) Mask1 = 0xffff0000 / Mask2 = 0x0000ffff
8. (8 bits) Mask1 = 0xff00ff00 / Mask2 = 0x00ff00ff
9. (4 bits) Mask1 = 0xf0f0f0f0 / Mask2 = 0x0f0f0f0f
10. (2 bits) Mask1 = 0xcccccccc / Mask2 = 0x33333333
11. (1 bits) Mask1 = 0xaaaaaaaa / Mask2 = 0x55555555
