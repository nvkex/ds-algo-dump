class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<>();
        String keys[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        int comb = 1;
        // Calculate possible combinations
        for(int i =0;i<digits.length(); i++){
            String key =  keys[digits.charAt(i) - '0' -2];
            comb*= key.length();
        }
        int temp = comb;
        for(int i =0;i<digits.length(); i++){
            String key = keys[digits.charAt(i) - '0' -2];
            int s = key.length();
            int rep = temp/s;
            for(int j=0;j<comb;j++){
                String fnl = String.valueOf(key.charAt((j/rep)%s));
                if(j<ans.size()){
                    ans.set(j, ans.get(j)+fnl);   
                }
                else{
                    ans.add(j, fnl);    
                }
            }
            temp/=s;
        }
                                            
        return ans;
    }
}