class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> op=new Stack<>();
        Stack<Character> exp=new Stack<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='|' || expression.charAt(i)=='&' || expression.charAt(i)=='!' ) 
            op.push(expression.charAt(i));
            else if(expression.charAt(i)=='(' || expression.charAt(i)=='t' || expression.charAt(i)=='f')
            exp.push(expression.charAt(i));
            else if(expression.charAt(i)==','){

            }else{
                evaluate(op , exp);
            }

        }
        return exp.peek() == 't'; 
    }

    void evaluate(Stack<Character> optr, Stack<Character> operand) {
        char op = optr.pop();
        boolean ans=false;

        if (op == '|') {
            ans = false;
            while (operand.peek() != '(') {
                ans |= (operand.pop() == 't');
            }
            operand.pop(); 
        } 
        else if (op == '&') {
            ans = true;
            while (operand.peek() != '(') {
                ans &= (operand.pop() == 't');
            }
            operand.pop(); 
        } 
        else if (op == '!') {
            ans = (operand.pop() == 't');
            ans = !ans;  
            operand.pop();
        }

        if (ans==true) {
            operand.push('t'); 
        } else {
            operand.push('f');  
        }
    }
}