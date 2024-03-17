public class Main {
    public static void main(String[] args) {
        Container container= new Container(6);
        container.AddPushBack(6);
        container.AddPushBack(4);
        container.AddPushBack(6);
        container.AddPushBack(5);
        container.AddPushBack(6);
        LambdaExpression check = (n) -> (n%2) != 0;
        System.out.println("Your container:");
        container.Print();
        System.out.println("Found elements:");
        container.Find(check);
        container.Delete(6);
        System.out.println("Container after deleting:");
        container.Print();
    }
}

interface LambdaExpression{
    boolean isEqual(int elem);
}