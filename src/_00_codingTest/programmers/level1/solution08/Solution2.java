package _00_codingTest.programmers.level1.solution08;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        int[] answers1 = {1,2,3,4,5};
        int[] result = solution1.solution(answers1);
        System.out.println(Arrays.toString(result));
        int[] answers2 = {1,3,2,4,2};
        result = solution1.solution(answers2);
        System.out.println(Arrays.toString(result));
    }
}
