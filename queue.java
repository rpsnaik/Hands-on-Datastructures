//Queues can be performed using LinkedList's and Arrays
//But it's not recomended to perform by using Arrays
//For instance if we remove the first element from the array we need
//shift the entire array forward... like the item in 2nd position need to shit 
//to 1st position and 3rd position need to shit at 2nd position
//which takes O(n) time complexity...
//So, it's not recomended by using Array's, that's why we implemented using LinkedList down in the program....

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class CustomQueue{
    Node start;
    Node end;
    int size;

    void push(CustomQueue queue, Node node){
        if(queue.size == 0){
            queue.start = node;
            queue.end = node;
            queue.size++;
        }else{
            Node holdingNode = queue.end;
            queue.end = node;
            holdingNode.next = queue.end;
            queue.size++;
        }
    }

    Node pop(CustomQueue queue){
        Node holdingPointer = queue.start;
        if(queue.size > 0){
            queue.start = queue.start.next;
            queue.size--;
        }else{
            System.out.println("Empty Queue!");
        }

        return holdingPointer;
    }

    Node peek(CustomQueue queue){
        return queue.start;
    }
}

class Queues{
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.push(queue, new Node(1));
        queue.push(queue, new Node(2));
        queue.push(queue, new Node(3));
        queue.push(queue, new Node(4));
        queue.push(queue, new Node(5));

        System.out.println("Peek : "+queue.peek(queue).data);

        while(queue.size > 0){
            System.out.print(queue.pop(queue).data + "->");
        }
        System.out.println("null");

    }
}