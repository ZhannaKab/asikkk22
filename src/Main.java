public class Main {
    public static void main(String[] args) {
        // Проверка стека
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack pop: " + stack.pop());

        // Проверка очереди
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue dequeue: " + queue.dequeue());

        // Проверка кучи
        MyMinHeap heap = new MyMinHeap();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        System.out.println("MinHeap poll: " + heap.poll());
    }
}
