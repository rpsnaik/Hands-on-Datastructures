class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
    }
}

class CustomLinkedList{
    Node head;

    void add(CustomLinkedList list, Node node){
        if(list.head == null){
            list.head = node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    

    void showLinkedList(CustomLinkedList list){
        Node last = list.head;
        System.out.print(last.data+"-->");
        while(last.next != null){
            System.out.print(last.next.data + "-->");
            last = last.next;
        }
        System.out.println("null");
    }
}

class SinglyLinkedList {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        
        linkedList.add(linkedList, new Node(1));
        linkedList.add(linkedList, new Node(2));
        linkedList.add(linkedList, new Node(3));
        linkedList.add(linkedList, new Node(4));
        linkedList.add(linkedList, new Node(5));

        linkedList.showLinkedList(linkedList);
        

    }
}