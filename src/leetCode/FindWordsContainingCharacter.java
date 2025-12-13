package leetCode;

// https://leetcode.com/problems/find-words-containing-character/

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> occurrences = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1) occurrences.add(i);
        }
        return occurrences;
    }

    public static void main(String[] args) {
        System.out.println("[0, 1] == " +
                findWordsContaining(new String[]{"leet","code"}, 'e'));
        System.out.println("[0, 2] == " +
                findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
        System.out.println("[] == " +
                findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'z'));
    }
}
