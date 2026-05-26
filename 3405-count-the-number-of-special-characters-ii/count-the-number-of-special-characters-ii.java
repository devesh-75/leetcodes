class Solution {
    public int numberOfSpecialChars(String w) {
        int big[] = new int[26];
        int count = 0;
        int sm [] = new int[26];
        for(int i =0; i< 26; i++) 
        {
            sm[i] = -1;
            big[i] = -1;
        }
        for(int i=0; i<w.length(); i++)
        {
            char ch = w.charAt(i);
            if(Character.isUpperCase(ch))
            {
                if(big[ch - 'A'] == -1)
                    big[ch - 'A'] = i;
            }
            else
            {
                sm[ch - 'a'] = i;
            }
        }
        for(int i=0; i<26; i++)
        {
            if(sm[i] != -1 && big[i] != -1)
            {
                if(sm[i] < big[i])
                {
                    count++;
                }
            }
        }
        return count;
    }
}