class Solution {
    public StringBuilder solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] arr = cipher.split("");
        for (int i=0; i<arr.length; i++) {
            if (i % code == (code-1))
            answer.append(arr[i]);
        }
        return answer;
    }
}