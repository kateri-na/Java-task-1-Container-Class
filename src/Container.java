public class Container {
    private Node head;
    public Container(){
        head = null;
    }
    public Container(int element){
        head = new Node(element);
    }
    public void add(int element){
        Node addedElement = new Node(element);
        if (head == null){
            head = addedElement;
        } else {
            Node current_element = head;
            while(current_element.next != null){
                current_element = current_element.next;
            }
            current_element.next = addedElement;
        }
    }
    public void Print(){
        Node current_element = head;
        while (current_element != null){
            System.out.print(current_element.element + ' ');
        }
    }
}

class Node {
    public int element;
    public Node next;
    public Node(int element){
        this.element = element;
        next = null;
    }
}