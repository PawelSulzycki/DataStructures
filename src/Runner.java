public class Runner {

    public static void main(String[] args) {
/*        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(2);
        stack.display();*/

        Queue queue = new Queue(5);
        queue.push(3);
        queue.display();
        queue.pop();
        queue.display();
    }
}
