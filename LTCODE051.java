/* Max Chunks To Make Sorted */

class LTCODE051 {
    public int maxChunksToSorted(int[] arr) {
        int max = 0, expectedSum = 0, chunks = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
            expectedSum += i;
            if (max == expectedSum) {
                chunks++;
            }
        }
        return chunks;
    }
}