class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int i=0; i<arr.length; i++) {
            answer += String.valueOf(arr[i]).repeat(n);
        }
        return answer;
    }
}