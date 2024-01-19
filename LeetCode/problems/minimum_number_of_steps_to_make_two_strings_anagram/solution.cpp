class Solution {
public:
    int minSteps(string s, string t) {
        vector<int>freqs(26,0);
        vector<int>freqt(26,0);
        int n=s.size();
        for(int i=0;i<n;i++){
            freqs[s[i]-'a']++;
            freqt[t[i]-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=abs(freqs[i]-freqt[i]);
        }
        return ans/2+ans%2;
    }
};