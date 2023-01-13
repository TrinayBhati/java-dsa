class Solution { 

// might not work for some cases like "([}}])"

    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
            }
        Stack<Character> myStack = new Stack();
                     //char[] charArray = s.toCharArray(); similar for loop
                     //for(int i=0;i<charArray.length;i++){}
                     // char c = charArray[i];}
        for(char c : s.toCharArray()){
            if(c ==  '(' || c=='{' || c=='[' ){
                myStack.push(c);
            }
            else if(c == ')' && !myStack.isEmpty() && myStack.peek() == '('){
                myStack.pop();
            }
            else if(c == ']' && !myStack.isEmpty() && myStack.peek() == '['){
                myStack.pop();
            }
            else if(c == '}' && !myStack.isEmpty() && myStack.peek() == '{'){
                myStack.pop();
            }
            
        }
        return myStack.isEmpty();
             
    }
}
//===============================================================================

// solution using switch case

class Solution {
    public boolean isValid(String s) {


        // Create a new stack to store the characters.
        Stack<Character> stack = new Stack<>();


        // convert string into char array and access the characters using for each loop.
        for(char ch: s.toCharArray())
        {
            // check ch
            switch (ch)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                        // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        if(stack.isEmpty())
            return true;
        else
            return false;
        
    }
}

//==============================================================================

// solution using if else 

class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack();
        for (char c : s.toCharArray()) {
            if(c == '('){
                myStack.push(')');
            }
            else if(c == '['){
                myStack.push(']');
            }
            else if(c == '{'){
                myStack.push('}');
            }
            else if(myStack.isEmpty() || myStack.pop() != c){
                return false;
            }
        }
        return myStack.isEmpty();
    }
}