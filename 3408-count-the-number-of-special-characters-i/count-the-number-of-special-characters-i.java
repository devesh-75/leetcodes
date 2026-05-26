class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<word.length(); i++)
        {
            if(Character.isLowerCase(word.charAt(i)))
            {
                set.add(word.charAt(i));
            }
        }
        for(int i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                char temp = Character.toLowerCase(word.charAt(i));
                if(set.contains(temp))
                {
                    count++;
                    set.remove(temp);
                }
            }
        }
    return count;
    }
}