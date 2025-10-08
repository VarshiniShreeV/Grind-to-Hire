public class LeetCode_3438 {
    public String findValidPair(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            if (a == b) continue;

            int countA = map.get(a);
            int countB = map.get(b);

            if (countA == (a - '0') && countB == (b - '0')) {
                return "" + a + b; 
            }
        }

        return "";
    }
}