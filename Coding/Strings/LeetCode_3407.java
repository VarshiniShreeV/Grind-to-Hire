class LeetCode_3407 {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');
        String prefix = p.substring(0, star);
        String suffix = p.substring(star + 1);

        int i = s.indexOf(prefix);
        if (i == -1) return false;

        int afterPrefix = i + prefix.length();
        if (s.indexOf(suffix, afterPrefix) == -1) {
            return false;
        }

        return true;
    }
}
