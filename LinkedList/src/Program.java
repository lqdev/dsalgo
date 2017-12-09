public class Program {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        System.out.println("Original");
        sll.printList(sll._head);

        Node newHead = sll.reverse(sll._head);
        System.out.println("Reversed");
        sll.printList(newHead);
    }
}