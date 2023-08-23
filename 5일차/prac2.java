import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (Character.isDigit(arr[i])==true)
                answer += Character.getNumericValue(arr[i]);
        }
        return answer;
    }
}