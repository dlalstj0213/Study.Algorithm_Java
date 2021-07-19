package _00_codingTest.programmers.level1.solution36;

public class Solution1 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' '){
                idx = 0;
                answer.append(c);
                continue;
            }else{
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                }else{
                    answer.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("  try  hello  world  "));
    }
}
