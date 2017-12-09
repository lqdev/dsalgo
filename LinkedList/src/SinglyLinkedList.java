public class SinglyLinkedList implements IReverse {

    public Node _head;

    public SinglyLinkedList(int data) {
        _head = new Node(data);
    }

    public void add(int data) {
        if(_head == null) {
            _head = new Node(data);
        } else {
            Node node = _head;
            while(node._next != null) {
                node = node._next;
            }
            node._next = new Node(data);
        }
    }

    void printList(Node node) {
        Node ptr = node;
        String list = "";
        while(ptr != null) {
            list += ptr._data + "->";
            ptr = ptr._next;
        }
        list += "NULL";
        System.out.println(list);
    }

    public Node reverse(Node start) {
        Node prev = null;
        Node curr = start;
        Node next = null;
        while(curr != null) {
            //printList(prev);
            next = curr._next;
            curr._next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
        return start;
    }
}