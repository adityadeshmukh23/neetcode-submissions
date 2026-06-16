class Solution {

    public static boolean pair(char curr,Stack<Character> st){
        if(st.isEmpty()) {
            return false;
        }
        if(st.peek() == '(' && curr == ')'){
            return true;
        }
        if(st.peek() == '{' && curr == '}'){
            return true;
        }
        if(st.peek() == '[' && curr == ']'){
            return true;
        }

        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i= 0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                st.push(curr);
            }
            if(curr == ')' || curr == '}' || curr == ']'){
                if(pair(curr,st)){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}