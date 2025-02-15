import java.util.HashSet;

public class LTCODE016 {
    private int dist(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> distances = new HashSet<>();
        int[][] points = {p1, p2, p3, p4};

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int d = dist(points[i], points[j]);
                if (d == 0) return false; 
                distances.add(d);
            }
        }
        return distances.size() == 2; 
    }

    public static void main(String[] args) {
        LTCODE016 sol = new LTCODE016();
        System.out.println(sol.validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,1})); 
        System.out.println(sol.validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,12}));
        System.out.println(sol.validSquare(new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1})); 
    }
}
