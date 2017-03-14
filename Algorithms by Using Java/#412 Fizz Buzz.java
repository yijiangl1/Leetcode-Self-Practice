public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);
            if(fizz && buzz){
                answer.add("FizzBuzz");
            } else if(fizz){
                answer.add("Fizz");
            } else if(buzz){
                answer.add("Buzz");
            } else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}