/*
 * 1342. Number of Steps to Reduce a Number to Zero — https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * Pattern:  simulation (halving → logarithmic)
 * Approach: while num > 0: halve if even, subtract 1 if odd; count steps
 * Time: O(log num)   Space: O(1)
 * Date: 2026-11-25   Assisted: no
 */

package warmups;

public class NumberOfSteps {
    class Solution {
        public int numberOfSteps(int num) {
            int steps = 0;
            while(num>0){
                if(num % 2 == 0)
                    num = num/2;
                else
                    num = num - 1;
                steps++;
            }
            return steps;
        }
    }
}
