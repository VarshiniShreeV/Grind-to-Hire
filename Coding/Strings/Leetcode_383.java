public class Leetcode_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for(char s : magazine.toCharArray()){
            letters[s-'a']++;
        }
        for(char s : ransomNote.toCharArray()){
            letters[s-'a']--;
            if(letters[s-'a']<0){
                return false;
            }
        }
        return true;
    }

}