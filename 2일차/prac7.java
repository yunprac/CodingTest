class Solution {
    public String solution(String my_string) {
        String reversed = new StringBuffer(my_string).reverse().toString();
        return reversed;
    }
}

// 더 쉬운 풀이

// import java.util.*;

// class Solution {
//     public String solution(String my_string) {
//         StringBuilder sb = new StringBuilder();
//         sb.append(my_string);
//         sb.reverse();

//         return sb.toString();
//     }
// }