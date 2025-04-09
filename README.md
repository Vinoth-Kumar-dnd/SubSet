# SubSet
Question :
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Solution 1 : Using recursion 

Solution 2 : using bit Masking { Logic : if length of array is 2 then subsets are 00,01,10,11}

Solution 3 : Using Iterative (BFS-style / Expanding)
{Logic : Start with just the empty subset: []

For each element in the array:

Take all existing subsets.

Make a copy and add the current element to each copy.

Add the new subsets to the result list. }
