public class Solution {
    public int findComplement(int num) {
        int[] bin = new int[32];
        int count = 0 ,complement = 0;
        while(num > 0){
            bin[count] = 1 - (num % 2);
            count++;
            num /= 2;
        }
        for(int i = 0; i < count; i++){
            complement += bin[i] * Math.pow(2, i);
        }
        return complement;
    }
}