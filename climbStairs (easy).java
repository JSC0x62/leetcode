/*
https://leetcode.com/problems/climbing-stairs/submissions/
https://www.youtube.com/watch?v=Y0lT9Fck7qI&list=PLot-Xpze53ldVwtstag2TL4HQhAnC8ATf&index=11
This is a fast O(n-1) solution.
The way of thinking is we know that for the last two steps, its always going to be 1 step. 
For example for n = 5 you have 0[1 2 3 4 5]
5 and 4 are both = 1 because it takes 1 step to reach 5. No other possibility. 

Variables one and two are pointers to the previous two steps. We can shift these using a tmp variable to get the result.

So the flow is:

tmp = one (1)
one = one + two (2)
two = tmp (1)

tmp = one (2)
one = one + two (3)
two = tmp (2)

tmp = one (3)
one = one + two (5)
two = tmp (3)

tmp = one (5)
one = one + two (8) //the answer
two = tmp (5)

Since its n-1, if n = 1 the loop never starts and it just returns 1.

*/

class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        int tmp = 0;
       for(int i = 0; i < n - 1; i++){
           tmp = one;
           one = one + two;
           two = tmp;
       }
        return one;
    }
}
