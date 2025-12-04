public class LeetCode_3168 {
    public int minimumChairs(String s) {
        int max = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c=='E') count++;
            if(c=='L') count--;
            if(max<count) max = count;
        }
        return max;
    }
}