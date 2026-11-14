class Solution {
    static void func(int open, int close, int n, List<String> list, String str){
        //we have used all open and close of the string
        if(open==n && close==n){
            list.add(str);
            return;
        }
        //we can add an opening bracket as long as open<n
        if(open<n) func(open+1,close,n,list, str+"(");
        //we can add a closing bracket only when close<open; we never close an unopened bracket
        if(close<open) func(open,close+1,n,list, str+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
        func(0,0,n,list,"");
        return list;
    }
}