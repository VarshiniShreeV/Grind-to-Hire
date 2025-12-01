public class Main{
    public static void main(String[] args){
        BST b = new BST();
        b.add(10);
        b.add(7);
        b.add(5);
        b.add(11);
        b.add(8);
        //b.inOrderTraversal();
        //b.preOrderTraversal();
        //b.postOrderTraversal();
        b.remove(5);
        b.inOrderTraversal();
    }
}