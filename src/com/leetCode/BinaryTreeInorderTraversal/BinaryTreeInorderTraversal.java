package com.leetCode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        return dfs(root, new ArrayList<>());
    }

    private List<Integer> dfs(TreeNode root, List<Integer> list) {

        if (root == null) return list;

        list = dfs(root.left, list);
        list.add(root.val);
        return dfs(root.right, list);
    }
}
