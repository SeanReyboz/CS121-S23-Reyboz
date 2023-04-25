package applicationOfKnowledge;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatedNumber
{
    /**
     * Finds the repeated number in an array of integers, if any
     *
     * @summary My initial thinking was that since we want to find one number that is stored in an array of integers, we
     * will need to loop over each element in the array and check whether it already appeared or not.
     * To be able to do that, we need be able to somehow keep track of the numbers that already appeared in the array.
     * I thought about two data types to store such information: a HashMap or a HashSet.
     * Since we only want to find the (first) repeated number and don't care about how many times it appeared in the
     * array, I chose to use the HashSet.
     * Now, what the logic would look like?
     * Well, first, we create our Integer HashSet. Then, we go through each element in the array and check whether our
     * HashSet already contains the current number. If it does, success! We simply return that number and we're done.
     * If the HashSet doesn't contain the current number, we add it to the HashSet and move on the next number in the
     * array.
     * I also used another variable names `repeatedNumber` that would be initialized with -1 to denote that no number in
     * the array is repeated. When we find that a number is already stored in the HashSet (i.e. it is repeated in the
     * array), we update the `repeatedNumber` value to which of the repeated number.
     * Once we're done looping over each element of the array, we return the value of that variable which is either
     * -1 (i.e. no element in the array is repeated), or the value of the repeated number in the array.
     *
     * It didn't take me very long to come up with this solution, and I would say that on a scale from 1 to 10, solving
     * this problem would be a 3/10.
     *
     * @param nums An array of positive integers
     * @return -1 if no integer in the array is repeated; the repeated number otherwise
     */
    public int find(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        int repeatedNumber = -1;

        for (int num: nums) {
            if (store.contains(num)) repeatedNumber = num;
            else store.add(num);
        }

        return repeatedNumber;
    }
}
