import java.beans.Expression;

public class Container {
    private Node head;
    public Container(){
        head = null;
    }
    public Container(int element){
        head = new Node(element);
    }
    public void AddPushBack(int element){
        Node addedElement = new Node(element);
        if (head == null){
            head = addedElement;
        } else {
            Node currentElement = head;
            while(currentElement.next != null){
                currentElement = currentElement.next;
            }
            currentElement.next = addedElement;
        }
    }

    public void Find(LambdaExpression check){
        Node currentElement = head;
        while (currentElement != null){
            if (check.isEqual(currentElement.element)){
                System.out.print(currentElement.element + " ");
            }
            currentElement = currentElement.next;
        }
        System.out.println();
    }
    public void Print(){
        Node currentElement = head;
        while (currentElement != null){
            System.out.print(currentElement.element + " ");
            currentElement = currentElement.next;
        }
        System.out.println();
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