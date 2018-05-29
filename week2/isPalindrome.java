public class Solution {
    public int isPalindrome(String A) {
        String lowerA = A.toLowerCase().replaceAll("\\s+","");
        int left = 0;
        int right = lowerA.length() - 1;
        while (left < right) {
            if (lowerA.charAt(left) == lowerA.charAt(right)) {
                left++;
                right--;
            } else {
                if (!isSpecialChar(lowerA.charAt(left)) && !isSpecialChar(lowerA.charAt(right))) {
                    return 0;
                }
                if (isSpecialChar(lowerA.charAt(left))) {
                    left++;
                }
                if (isSpecialChar(lowerA.charAt(right))) {
                     right--;
                }
            }
        }
        return 1;
    }
    private boolean isSpecialChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return false;
        }
        return true;
    }
}
