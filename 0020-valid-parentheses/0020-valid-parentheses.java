class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' || c =='{' || c == '['){
                st.push(c);
            }else if(!st.isEmpty()){
                if(c == ')'){
                    if(st.peek() != '(') return false;
                    else st.pop();
                }
                else if(c == '}'){
                    if(st.peek() != '{') return false;
                    else st.pop();
                }else{
                    if(st.peek() != '[') return false;
                    else st.pop();
                }
            }else return false;
        }
        return st.isEmpty();
    }
}