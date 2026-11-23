/*
 * 412. Fizz Buzz — https://leetcode.com/problems/fizz-buzz/
 * Pattern:  simulation
 * Approach: <your one-line approach>
 * Time: O(?)   Space: O(?)
 * Date: 2026-11-23   Assisted: no
 */

package warmups;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if((i+1)%15 == 0){
                arr.add("FizzBuzz");
            }else if((i+1)%5 == 0){
                arr.add("Buzz");
            }else if((i+1)%3 == 0){
                arr.add("Fizz");
            }else{
                arr.add(""+(1+i));
            }
        }
        return arr;
    }
}