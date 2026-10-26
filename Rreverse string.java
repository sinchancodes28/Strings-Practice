class Solution {
    public void reverseString(char[] s) {
        // swapping using char
        int i = 0;
        int j = s.length - 1;
        while ( i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;         
        }
        // remember for arrays  of character accessing character :  s[i];
        // for strings : s.charAt(i);
    }
}
