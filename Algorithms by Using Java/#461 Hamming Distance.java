public class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int num1, num2;
        while ((x > 0) || (y > 0)){
            num1 = (x > 0) ? (x % 2) : 0;
            num2 = (y > 0) ? (y % 2) : 0;
            if(num1 != num2){
                distance += 1;
            }
            x /= 2;
            y /= 2;
        }
        return distance;
    }
}