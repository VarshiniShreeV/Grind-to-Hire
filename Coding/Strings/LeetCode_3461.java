public class LeetCode_3461 {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            s = mod(s);
        }
        if(s.charAt(0)==s.charAt(1)) return true;
        return false;
    }
    public String mod(String s){
        StringBuilder num = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int rem = ((s.charAt(i) - '0') + (s.charAt(i+1) - '0')) %10;
            num.append(rem);
        }
        return num.toString();
    }
    
}