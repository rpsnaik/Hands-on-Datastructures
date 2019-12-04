class Node {
    Node left;
    Node right;
    Node parent;
    int data;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}

class BinaryTree{
    Node root = new Node(10);

    void iterateAndAdd(Node currNode, int data){
        if(data < currNode.data){
            if(currNode.left == null){
                Node temp = new Node(data);
                temp.parent = currNode;
                currNode.left = temp;
                System.out.println("Added "+data+" to parent "+currNode.data);
            }else{
                iterateAndAdd(currNode.left, data);
            }
        }else{
            if(currNode.right == null){
                Node temp = new Node(data);
                temp.parent = currNode;
                currNode.right = temp;
                System.out.println("Added "+data+" to parent "+currNode.data);
            }else{
                iterateAndAdd(currNode.right, data);
            }
        }
    }

    void addNode(int data){
        Node currNode = root;
        iterateAndAdd(root, data);
    }
}

class BinarySearchTree{
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(12);
        binaryTree.addNode(2);
        binaryTree.addNode(20);
        binaryTree.addNode(3);
    }
}