public class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<Character>();
        Set<Character> row2 = new HashSet<Character>();
        Set<Character> row3 = new HashSet<Character>();
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHJKLasdfghjkl";
        String s3 = "ZXCVBNMzxcvbnm";
        String[] find = new String[words.length];
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            row1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++){
            row2.add(s2.charAt(i));
        }
        for(int i = 0; i < s3.length(); i++){
            row3.add(s3.charAt(i));
        }
        for(int i = 0; i < words.length; i++){
            if(findRow(row1, words[i]) || findRow(row2, words[i]) || findRow(row3, words[i])){
                find[count] = words[i];
                count++;
            }
        }
        String[] answer = new String[count];
        for (int i = 0; i < count; i++){
            answer[i] = find[i];
        }
        return answer;
    }
    public boolean findRow(Set<Character> row, String word){
        for (int i = 0; i < word.length(); i++){
            if(!row.contains(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
}