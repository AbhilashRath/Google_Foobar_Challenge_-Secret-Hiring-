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

## Level 2
### Simplified Problem Statement
Your are given a string of characters '>','-','<' where '>' denotes right soldier, '<' denotes left soldier and, '-' denotes hallway. If '<' passes '>' then they salute each other. Calculate the total number of salutes given a string. The string contains atleast one character.
### Example Test Cases
Input: "--->-><-><-->-"
Output: 10

Input: "<<>><"
Output: 2

Input: ">-----<"

### My Approach
Initialise 2 variables storing the number of right soldiers and number of salutes. If right soldier appears increments its count, else if left soldier appears increment salute count by double of right soldiers' count. 

### Solution
Link to Solution: [en-route-salute.java](https://github.com/AbhilashRath/Google_Foobar_Challenge_-Secret-Hiring-Challenge-/blob/master/en-route-salute.java)

My Solution passed all the testcases.
