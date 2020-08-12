class GenerateTree{

    class Node{
        Node left, right;
        int data;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        Node head = null;
        GenerateTree obj = new GenerateTree();
        head = obj.genTree(arr, head, 0);
        System.out.println("Inorder: ");
        obj.inOrder(head);
    }

    Node genTree(int arr[], Node root, int i){

        if(i<arr.length){
            Node temp = new Node(arr[i]);
            root = temp;

            // Left
            root.left = genTree(arr, root.left, 2*i+1);

            // Right
            root.right = genTree(arr, root.right, 2*i+2);
        }

        return root;
    }

    void inOrder(Node root) 
    { 
        if (root != null) { 
            inOrder(root.left); 
            System.out.print(root.data + " "); 
            inOrder(root.right); 
        } 
    } 
}