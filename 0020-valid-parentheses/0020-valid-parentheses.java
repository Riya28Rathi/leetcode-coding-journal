class Solution {

    // Time Exceeded Solution================================
    // public boolean isValid(String s) {

    //     Stack<Character> stack=new Stack();

    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(stack.isEmpty()){
    //             stack.push(ch);
    //         }
    //         else if(
    //                  (ch==')' && stack.peek()=='(')
                    
    //                 || (ch=='}' && stack.peek()=='{') 
                    
    //                 || (ch==']' && stack.peek()=='[')){
    //             stack.pop();
    //         }
    //         else{
    //             stack.push(ch);
    //         }
    //         System.out.println("======================");
    //         for(char c: stack){
    //             System.out.println("character stack: "+ c);
    //         }
    //     }

    //     if(stack.isEmpty()){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
        
    // }


    public boolean isValid(String s) {

        Stack<Character> stack=new Stack();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(
                     (ch==')' && stack.peek()=='(')
                    
                    || (ch=='}' && stack.peek()=='{') 
                    
                    || (ch==']' && stack.peek()=='[')){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            // System.out.println("======================");
            // for(char c: stack){
            //     System.out.println("character stack: "+ c);
            // }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}