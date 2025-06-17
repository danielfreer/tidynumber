# tidynumber
## Usage
```shell
git clone https://github.com/danielfreer/tidynumber.git
```

On Mac/Linux:
```shell
./gradlew run
```

## Problem Description:
A "tidy" number is a number where its digits are in non-decreasing order when 
written in base 10 with no leading zeros. For example, 8, 123, 555, and 224488 
are tidy numbers, whereas 20, 321, 495, and 999990 are not.

Count all positive integers in ascending order from 1 to N. What is the last 
tidy number counted given N?

## Data File Input Format:
The first line of the input gives the number of test cases, T. T lines follow. 
Each line describes a test case with a single integer N.

## Expected Output Format:
For each test case, output a line in the format: "Case #x: y", where x is the 
test case number (starting from 1) and y is the last tidy number counted.

## Problem Constraints:
1 ≤ T ≤ 100 (Number of test cases)  
1 ≤ N ≤ 1000 (End of the sequence of numbers)  

## Example Input Data File:
3  
132  
1000  
7  

## Example Output:
Case #1: 129  
Case #2: 999  
Case #3: 7  
