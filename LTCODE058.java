/* Check If String Is a Prefix of Array */

class LTCODE058 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            sb.append(word);
            
            if(sb.length()==s.length() &&sb.toString().equals(s)) return true;
        }

        return false;
    }
}