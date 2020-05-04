# Google Foobar Challenge
## Level 1
### Simplified Problem Statement
Your are given a string and you need to divide the string into maximum equal substrings such that no extra characters are left.
### Example Test Cases
Input: "abcabcabcabc"
Output: 4

Input: "abbcaabbca"
Output: 2

### Similar Edge Test Cases (Hidden)
Input: "abbcaaaacbba"
Output: 2

Input: "aaaaaa"
Output: 6

### My Approach
My approach was kinda quite straightforward. For every substring of length x I checked if 
it is equal to the substring starting from index x+1 to x+x+1. If not equal then check if reverse is equal. If any of these conditions
satisfied I looped this index over the whole string by incrementing it by x and checking if either substring is equal (reverse or normal).
If any of the substrings is not equal; break. If whole loop is executed ans: s.length()/x.

### Solution
Link to Solution: [the-cake-is-not-a-lie.java](https://github.com/AbhilashRath/Google_Foobar_Challenge_-Secret-Hiring-/blob/master/the_cake_is_not_a_lie)

My Solution passed all testcases.

## Level 2 (0-50%)
### Simplified Problem Statement
Your are given a string of characters '>','-','<' where '>' denotes right soldier, '<' denotes left soldier and, '-' denotes hallway. If '<' passes '>' then they salute each other. Calculate the total number of salutes given a string. The string contains atleast one character.
### Example Test Cases
Input: "--->-><-><-->-"
Output: 10

Input: "<<>><"
Output: 2

Input: ">-----<"
Output: 2

### My Approach
Initialise 2 variables storing the number of right soldiers and number of salutes. If right soldier appears increments its count, else if left soldier appears increment salute count by double of right soldiers' count. 

### Solution
Link to Solution: [en-route-salute.java](https://github.com/AbhilashRath/Google_Foobar_Challenge_-Secret-Hiring-Challenge-/blob/master/en-route-salute.java)

My Solution passed all the testcases.

## Level 2 (50-100%)
### Simplified Problem Statement
You are given a height h which represents the height of a perfect binary tree. The postorder traversal of the tree prints {1,2,....(2^h-1)}. You are given a list of integers which are present in the tree and you have to find their root node's value. If root node's value is given then return -1.
For example perfect binary tree of height 3 with the required postorder traversal would be:
      7
  3       6
1   2   4   5
and for q={3,4,7} output is {7,6,-1}.
### Example Test Cases
Input: h=2,q={1,2,3}
Output: {-1,1,1}

Input: h=3,q={7,1,5,2}
Output: {-1,3,6,3}

### My Approach
Knowing the fact that its postorder traversal the last element is always the root. It's a perfect binary tree so the concept is somewhat similar to bst from postorder traversal. Then traversing through the tree searching for the respective elements' roots.

### Solution
Link to Solution: [ion-flux-relabelling.java](https://github.com/AbhilashRath/Google_Foobar_Challenge_-Secret-Hiring-Challenge-/blob/master/ion-flux-relabelling.java)

My Solution passed all the testcases.
