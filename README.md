<h1 align="middle">Bridge Athletic Internship</h1>
Technical assignment required by bridge athlectic

## ⚠ Attention:
The first method will take a lot of time to compute large numbers.<br>
The second will take a fraction of a second to compute large numbers.
<br><br>
To avoid stack overflow when running a number like 10000, kindly expand the limit of the stack so it will not overflow:
```shell
java -Xss10m Main
```
By running this line after compiling the file

## Features
- Make sure the user enters a positive integer      

## Methods description
### *Recursive* method calling
- Time Complexity: `O(2^n)`<br>
The time complexity can be explained by the double recursive call on each iteration

- Space Complexity: `O(n)`<br>
The space complexity can be explained by the recursive stack call that holds at maximum n/2 hence O(n)

### *Optimized* recursive calling

Relies on memoization to avoid recomputation of previously computed numbers

- Time Complexity: `O(n)`<br>
The time complexity can be explained by the fact that each number from 0 to n will be computed just once

- Space Complexity: `O(n)`<br>
The space complexity can be explained by the fact that the hashmap will hold every fibonacci number from 2 to n

-------------------------
