/* Split a String in Balanced Strings */

class LTCODE053 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int ch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R'){
                ch++;
            }else{
                ch--;
            }
            if (ch==0){
                count++;
            }
        }
        return count;
    }
}