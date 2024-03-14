import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Point) {
            if(this.x > ((Point)o).x) {
                return 1;
            } else if (this.x < ((Point)o).x) {
                return -1;
            } else {
                if(this.y > ((Point)o).y) {
                    return 1;
                } else if (this.y < ((Point)o).y) {
                    return -1;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];

        StringTokenizer st;

        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        StringBuilder sb = new StringBuilder();
        for (Point p: points) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        System.out.println(sb);
    }
}