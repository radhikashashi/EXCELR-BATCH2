import java.util.*;

public class LTCODE012 {
    public static List<Integer> findWordIndices(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) { 
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        System.out.println(findWordIndices(words1, x1)); 

        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        System.out.println(findWordIndices(words2, x2)); 

        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        System.out.println(findWordIndices(words3, x3)); 
    }
}
