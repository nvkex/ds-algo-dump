class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0, curr=0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) == '(')
                curr++;
            else{
                curr--;
                if(s.charAt(i-1) == '(')
                    score += 1<<curr;
            }
        }
        return score;
    }
}