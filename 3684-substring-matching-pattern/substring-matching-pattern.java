class Solution {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');
        String prefix = p.substring(0, star);
        String suffix = p.substring(star + 1);

        int idx = s.indexOf(prefix);

        return idx != -1 && s.indexOf(suffix, idx + prefix.length()) != -1;
    }
}