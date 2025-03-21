package org.example;

import java.util.HashMap;
import java.util.Map;

public class DivideArray {
    public boolean run(int[] nums) {
        Map<Integer, Integer> occur = new HashMap<>();
        for (int num: nums) {
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }
        for (int count : occur.values())
            if (count % 2 != 0) {
                return false;
            }
        return true;
    }
}
