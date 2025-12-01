public class BST{
    Node root;
    BST(){
        root = null;
    }
    void add(int val){
        Node newNode = new Node(val);
        if(root == null) root = newNode;
        else{
            Node temp = root;
            while(true){
            if(val<temp.data){
                if(temp.left==null){
                    temp.left = newNode;
                    break;
                }
                else temp = temp.left;
            }
            else if(val>temp.data){
                if(temp.right==null){
                    temp.right = newNode;
                    break;
                }
                else temp = temp.right;
            }
            }
        }
    }
    void inOrderTraversal(){
        if(root == null) System.out.println("Empty BST");
        else inOrder(root);
    }
    void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    void preOrderTraversal(){
        if(root == null) System.out.println("Empty BST");
        else{
            preOrder(root);
        }
    }
    void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    void postOrderTraversal(){
        if(root == null) System.out.println("Empty BST");
        else{
            postOrder(root);
        }
    }
    void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    void remove(int val){
        root = removal(root, val);
    }

    private Node removal(Node node, int val){
        if(node==null) return null;
        if(val<node.data) node.left = removal(node.left, val);
        else if(val>node.data) node.right = removal(node.right, val);
        else{
            if(node.left==null && node.right==null) return null;
            if(node.left==null) return node.right;
            if(node.right==null) return node.left;
            else{
                Node successor = findMin(node.right);
                node.data = successor.data;
                node.right = removal(node.right, successor.data);
            }
        }
        return node;
    }
    private Node findMin(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }
}