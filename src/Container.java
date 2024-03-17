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
        boolean isFound = false;
        while (currentElement != null){
            if (check.isEqual(currentElement.element)){
                isFound = true;
                System.out.print(currentElement.element + " ");
            }
            currentElement = currentElement.next;
        }
        if (!isFound){
            System.out.println("There are no appropriate elements");
        }
        System.out.println();
    }
    public void Delete(int element){
        Node currentElement = head;
        while(currentElement != null){
            if(currentElement.next != null && currentElement.next.element == element){
                currentElement.next = currentElement.next.next;
            }
            if (head.element == element){
                head = currentElement.next;
            }
            currentElement = currentElement.next;
        }
    }
    public void Print(){
        Node currentElement = head;
        if(head == null){
            System.out.println("Container is empty");
        }
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