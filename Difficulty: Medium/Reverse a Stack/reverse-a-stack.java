
class Solution {
    static void reverse(Stack<Integer> St) {
        // code here
        
        // Approach-1 (Using O(n) Auxiliary Space (we took extra one temp stack))
        // Simply write a story like recursion and trust it
        // Time : O(n^2)
        // Space : O(n) Auxiliary Space (we took extra one temp stack)
        if (St.isEmpty()) return;
        int top = St.pop();
        reverse(St);
        Stack<Integer> temp = new Stack();
        while (!St.isEmpty()) {
            temp.push(St.pop());
        }
        St.push(top);
        while (!temp.isEmpty()) {
            St.push(temp.pop());
        }
    }
}