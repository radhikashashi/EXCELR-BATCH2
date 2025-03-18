/*Minimum Number of Moves to Seat Everyone*/

import java.util.Arrays;

class LTCODE046{
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for(int i = 0;i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
    return moves;
    }
}