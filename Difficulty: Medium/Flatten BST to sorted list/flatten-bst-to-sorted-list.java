// User function Template for Java
class Solution {
    public Node flattenBST(Node root) {
        // Code here
        if (root == null)
        return null;
        Node head = flattenBST(root.left);
        root.left = null;
        root.right = flattenBST(root.right);
        if (head != null) {
            Node temp = head;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = root;
        }
        else {
            head = root;
        }
        return head;
    }
}
