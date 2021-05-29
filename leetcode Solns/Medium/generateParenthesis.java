class Solution {
    void generate(String bp, int o, int c, ArrayList<String> list){
        if(o == 0 && c == 0){
            list.add(bp);
            return;
        }    
        if(o!= 0){
            generate(bp+"(", o-1, c, list);
        }
        if(o < c ){
            generate(bp+")", o, c-1, list);
        }
    }
    
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list =  new ArrayList<>();
        generate("", n, n, list);
        return list;
    }
}