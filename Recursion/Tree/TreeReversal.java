package Tree;

import javax.swing.tree.TreeNode;

public class TreeReversal {
    public static void preorder(TreeNode node) {
    if (node == null) {
      return;
    }

    System.out.println(node.data);
    preorder(node.left);
    preorder(node.right);
  }

  public static void inorder(TreeNode node) {
    if (node == null) {
      return;
    }

    inorder(node.left);
    System.out.println(node.data);
    inorder(node.right);
  }

  public static void postorder(TreeNode node) {
    if (node == null) {
      return;
    }

    postorder(node.left);
    postorder(node.right);
    System.out.println(node.data);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode
}
