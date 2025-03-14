class Solution {
public:
    int countPalindromicSubsequence(string s) {
        int n = s.size();
        // record the characters on the left/right (starting from the index `1`)
        unordered_map<char, int> left, right;
        left[s[0]]++;
        for (int i = 2; i < n; i++) right[s[i]]++;

        int result = 0;
        unordered_set<string> visited;
        for (int i = 1; i < (n - 1); i++) {
            // generate length-3 palindromes
            for (char c = 'a'; c <= 'z'; c++) {
                if (left.count(c) == 0) continue;
                if (right.count(c) == 0) continue;
                const string palindrome = {c, s[i], c};
                if (visited.count(palindrome) != 0) continue;
                visited.insert(palindrome);
                result++;
            }
            // update `left` and `right`
            left[s[i]]++;
            if ((--right[s[i + 1]]) == 0) right.erase(s[i + 1]);
        }
        return result;
    }
};