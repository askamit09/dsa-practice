/*
 * 1672. Richest Customer Wealth — https://leetcode.com/problems/richest-customer-wealth/
 * Pattern:  2D array traversal (row sums)
 * Approach: sum each customer's row, track the maximum sum
 * Time: O(m · n)   Space: O(1)   (m customers, n banks)
 * Date: 2026-11-25   Assisted: no
 */

package warmups;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
