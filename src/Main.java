public class Main {
    public static void main(String[] args) {
//        Array arr = new Array();
//        arr.add(60);
//        arr.add(80);
//        arr.remove(2);

//        SinglyLinkedList list = new SinglyLinkedList();
//        list.pushFront(20);
//        list.pushFront(40);
//        list.pushFront(60);
//        list.printList();
//        list.topFront();
//        list.pushBack(80);
//        list.pushBack(90);
//        list.topBack();
//        list.popFront();
//        list.findNode(100);
//        list.popBack();
//        list.pushFront(100);
//        list.pushFront(110);
//        list.pushFront(120);
//        list.printList();
//        list.reverse();

//        DoublyLinkedList list= new DoublyLinkedList();
//        list.pushBack(20);
//        list.pushBack(30);
//        list.pushBack(40);
//        list.pushBack(50);
//        list.pushFront(60);
//        list.pushFront(70);
//        list.pushFront(80);
//        list.pushFront(90);
//        list.getTheLastNode();
//        list.topFront();
//        list.popFront();
//        list.popBack();
//        list.findNode(30);
//        list.reverse();
//        list.printReverseList();

//        Stack stack = new Stack();
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.top();
//        stack.pop();
//        stack.empty();

//        Queue queue = new Queue();
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(60);
//        queue.enqueue(80);
//        queue.enqueue(100);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.pushBack(1);
        dynamicArray.pushBack(2);
        dynamicArray.pushBack(3);
        dynamicArray.pushBack(4);
        dynamicArray.pushBack(5);
        dynamicArray.get(1);
        dynamicArray.get(5);
        dynamicArray.get(3);
        dynamicArray.set(1, 5);
        dynamicArray.set(3, 10);
        dynamicArray.printList();
        dynamicArray.remove(1);
        dynamicArray.remove(2);
        dynamicArray.printList();
        dynamicArray.size();
    }
}