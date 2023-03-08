public class Main {
    public static void main(String[] args) {
//        Array arr = new Array();
//        arr.add(60);
//        arr.add(80);
//        arr.remove(2);

        SinglyLinkedList list = new SinglyLinkedList();
        list.pushFront(20);
        list.pushFront(40);
        list.pushFront(60);
        list.printList();
        list.topFront();
        list.pushBack(80);
        list.pushBack(90);
        list.topBack();
        list.popFront();
        list.findNode(100);
        list.popBack();
        list.pushFront(100);
        list.pushFront(110);
        list.pushFront(120);
        list.printList();
        list.reverse();
    }
}