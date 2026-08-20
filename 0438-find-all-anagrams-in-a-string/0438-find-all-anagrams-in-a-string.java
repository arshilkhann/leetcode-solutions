class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }
        int windowSize = p.length();

        for (int i = 0; i < windowSize; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pFreq, windowFreq)) {
            ans.add(0);
        }
        for (int i = windowSize; i < s.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
            
            windowFreq[s.charAt(i - windowSize) - 'a']--;
            if (Arrays.equals(pFreq, windowFreq)) {
                ans.add(i - windowSize + 1);
            }
        }

        return ans;
    }
}