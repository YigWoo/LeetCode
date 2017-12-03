package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lc349Intersection {
    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> num2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        num1Set.retainAll(num2Set);

        List<Integer> collect = new ArrayList<>(num1Set);

        int[] result = new int[num1Set.size()];

        for (int i = 0; i < num1Set.size(); i++) {
            result[i] = collect.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

}
