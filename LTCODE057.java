/* Number of Strings That Appear as Substrings in Word */

class LTCODE057 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String ele : patterns){
            if(word.contains(ele)) count++;
        }
        return count;
    }
}