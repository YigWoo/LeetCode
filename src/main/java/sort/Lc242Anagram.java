package sort;

import java.util.List;
import java.util.stream.Collectors;

public class Lc242Anagram {

    private static boolean isAnagram(String s, String t) {
        List<Integer> sList = s.chars().boxed().sorted().collect(Collectors.toList());
        List<Integer> tList = t.chars().boxed().sorted().collect(Collectors.toList());

        return sList.equals(tList);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println((isAnagram("rat", "car")));
        System.out.println(isAnagram("", ""));
    }

}
