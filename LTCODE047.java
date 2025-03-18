/*Minimum Moves to Convert String*/

class LTCODE047 {
    public int minimumMoves(String s) {
        int count = 0;
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
                continue;
            }
            i++;
        }
        return count;
    }
}