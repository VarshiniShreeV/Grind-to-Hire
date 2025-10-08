public class LeetCode_3456 {
    public boolean hasSpecialSubstring(String s, int k) {
        
        boolean valid = true;
        if(s.length()==k){
            for(int i=1;i<k;i++){
                if(s.charAt(0)!=s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        for(int i=0;i+k<=s.length();i++){
            valid = true;
            for(int j=i+1;j<i+k;j++){
                if(s.charAt(i)!=s.charAt(j)){
                    valid = false;
                    break;
                }
            }
            if(!valid) continue;
            if ( (i == 0 || s.charAt(i - 1) != s.charAt(i)) &&
                (i + k == s.length() || s.charAt(i + k) != s.charAt(i))) return true;
        }
        return false;
    }
}