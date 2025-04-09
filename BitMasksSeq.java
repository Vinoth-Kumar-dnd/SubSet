package package1;

import java.util.ArrayList;
import java.util.List;

public class BitMasksSeq {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3 };

        List<List<Integer>> seq = new ArrayList<>();

        for (int mask = 0; mask < (1 << nums.length); mask++) {

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {

                if ((mask & (1 << i)) != 0) {

                    arr.add(nums[i]);

                }
            }
            System.out.println();
            seq.add(arr);
        }

        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i).toString());
        }

    }

}