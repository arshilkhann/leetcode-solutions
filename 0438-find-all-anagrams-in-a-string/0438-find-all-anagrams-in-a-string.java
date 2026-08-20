class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] pFreq = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }
            if (i >= k - 1 && Arrays.equals(pFreq, window)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}