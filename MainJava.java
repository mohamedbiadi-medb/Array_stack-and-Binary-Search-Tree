    public static void main(String[] args) {
        // === Array-Based Stack Testing ===
        System.out.println("=== Array-Based Stack ===");
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        stack.peek();
        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println();

        // === Binary Search Tree Testing ===
        System.out.println("=== Binary Search Tree ===");
        BinarySearchTree bst = new BinarySearchTree();

        int[] keys = {50, 30, 70, 20, 40, 60, 80};
        for (int key : keys) {
            bst.insert(key);
        }
        System.out.println("Inserted: 50, 30, 70, 20, 40, 60, 80");

        System.out.print("In-order Traversal (Sorted): ");
        bst.inorder();

        System.out.print("Pre-order Traversal: ");
        bst.preorder();

        System.out.print("Post-order Traversal: ");
        bst.postorder();

        System.out.println("Search for key 40: " + (bst.search(40) ? "Found" : "Not Found"));
        System.out.println("Search for key 99: " + (bst.search(99) ? "Found" : "Not Found"));

        System.out.println("Minimum value in BST: " + bst.findMin());
        System.out.println("Maximum value in BST: " + bst.findMax());
    }
}