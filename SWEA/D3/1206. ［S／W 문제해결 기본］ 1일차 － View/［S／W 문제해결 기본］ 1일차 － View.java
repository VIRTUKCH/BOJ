import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
    public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 1; i <= 10; i++) {
            int howMushBuildings = Integer.parseInt(br.readLine());
 
            st = new StringTokenizer(br.readLine());
            int[] building = new int[1000];
 
            int j = 0;
            while (st.hasMoreTokens()) {
                building[j] = Integer.parseInt(st.nextToken());
                j++;
            }
 
//            System.out.println("Arrays.toString(building) = " + Arrays.toString(building));
//            여기까지 정상 확인했음.
 
            int result = 0;
            for (int k = 2; k < 1000 - 2; k++) {
                int heightOfLeftBuildings = Math.max(building[k-2], building[k-1]);
                int heightOfThisBuilding = building[k];
                int heightOfRightBuildings = Math.max(building[k+1], building[k+2]);
 
                if (heightOfLeftBuildings > heightOfThisBuilding || heightOfRightBuildings > heightOfThisBuilding) {
                    continue;
                } else {
                    result += heightOfThisBuilding - Math.max(heightOfLeftBuildings, heightOfRightBuildings);
                }
            }
            System.out.println("#" + i + " "+ result);
        }
    }
}