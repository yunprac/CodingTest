class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int n = 0;
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                n++;
            }
        }
        answer[0] = n;
        answer[1] = num_list.length - n;
        return answer;
    }
}