class Solution {
    public boolean isPalindrome(String s) {

        String empty = "";


        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                empty += Character.toLowerCase(ch);
            }
        }

        int left = 0;
        int right = empty.length() - 1;

        while(left < right){

            if(empty.charAt(left) != empty.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}