import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Point implements Comparable {
    int x;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Point) {
            if (((Point) o).getY() < this.getY()) {
                return 1;
            } else if (((Point) o).getY() > this.getY()) {
                return -1;
            } else {
                if (((Point) o).getX() < this.getX()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        else {
            return Integer.MAX_VALUE;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x, y);
        }
        Arrays.sort(points);

        for (Point p : points) {
            System.out.println(p.getX() + " " + p.getY());
        }
    }
}