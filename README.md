# Timing-Algorithms
Basic programs to introduce the concept of big O time and amounts of work.

Cubic
- Scan the input for the numbers a, b, and c such that all three numbers are different, a + b = c, and the value of c is maximized.

Quadratic
- Implement a quadratic time version of the cubic time algorithm above by doing some preprocessing:  before iterating over a and b, 
create a lookup HashSet that remembers which values of c have been seen.  Instead of iterating over c, 
check whether a+b is in the HashSet.

Exponential
- For this problem, treat the input as one big number, ignoring newlines. ou will try to find numbers that divide this target 
number N using brute force:  check whether all numbers between 2 and N-1 evenly divide your number, and print the number 
if it does.  If you make it through all these numbers with no divisors, print “prime.”
