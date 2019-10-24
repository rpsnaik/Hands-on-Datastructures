class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class CustomStacks{
    Node top;
    Node bottom;
    int size;
    void push(CustomStacks stack, Node node){
        if(stack.size == 0){
            stack.top = node;
            stack.bottom = node;
            stack.size++;
        }else{
            Node holdingPointer = stack.top;
            stack.top = node;
            node.next = holdingPointer;
            stack.size++;
        }
    }
    Node pop(CustomStacks stack){
        Node popPointer = stack.top;
        if(stack.size > 0){
            stack.top = stack.top.next;
            stack.size--;
        }else{
            System.out.println("Empty Stack");
        }
        return popPointer;
        
    }

    Node peek(CustomStacks stack){
        return stack.top;
    }
}

class Stacks{
    public static void main(String[] args) {
        CustomStacks stack = new CustomStacks();

        stack.push(stack, new Node(1));
        stack.push(stack, new Node(2));
        stack.push(stack, new Node(3));
        stack.push(stack, new Node(4));
        stack.push(stack, new Node(5));
        stack.push(stack, new Node(6));

        System.out.println("Peek : "+stack.peek(stack).data);

        while(stack.size > 0){
            System.out.print(stack.pop(stack).data+"->");
        }
        System.out.println("null");
    }
}