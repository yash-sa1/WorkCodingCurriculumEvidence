public class CoreMethods {
        /*
    Create a node class and a linkedlist class. IMplement the core methods: append ( add to end ), preprnd ( add to start )
    and delete ( remove a specific value )

    add a reverse method to your linked list. This should not create a new list but manipulate the pointers
     */
    public void append( Node node, LinkedList linkedList) {
        if (linkedList.head == null) {
            linkedList.head = node;
            return;
        }

        Node current = linkedList.head;
        while ( current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void prepend ( Node node, LinkedList linkedList ) {
        node.next = linkedList.head;
        linkedList.head = node;

    }

    public void delete(int value, LinkedList linkedList) {
        if (linkedList.head == null) {
            return;
        }

        if (linkedList.head.value == value) {
            linkedList.head = linkedList.head.next;
            return;
        }

        Node previous = linkedList.head;
        Node current = linkedList.head.next;

        while (current != null) {
            if (current.value == value) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

}
