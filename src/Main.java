public class Main {
    public static void main(String[] args) {
        Container container= new Container();
        container.AddPushBack(4);
        container.AddPushBack(5);
        container.AddPushBack(6);
        LambdaExpression check = (n) -> (n%2) != 0;
        container.Print();
        container.Find(check);
    }
}

interface LambdaExpression{
    boolean isEqual(int elem);
}