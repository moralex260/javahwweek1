package linked.list;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    private int size;


    public void add(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }

        Node<T> tNode = new Node<>(null, last, value);
        last.next = tNode;
        last = tNode;
        size++;
    }

    public String toStringLinkedList() {
        Node<T> temp = first;
        StringBuilder b = new StringBuilder();
        b.append("[ ");
        while (temp.next != null) {
            b.append(String.valueOf(temp.value));
            temp = temp.next;
            b.append(" ");
        }
        b.append(String.valueOf(last.value));
        return b.append(" ]").toString();
    }

    private class Node<T> {

        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }

    // methods:
    //prepend(value):
    public void prepend(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        } else {
            Node<T> tNode = new Node<>(first, null, value);
            first = tNode;

            size++;

        }
    }
    //  add by index

    public void addByIndex(int size, T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }
        Node<T> temp = first;
        int i = 0;
        while (i < size - 1) {
            temp = temp.next;
            i++;
        }
        Node<T> after = temp.next;
        Node<T> tNode = new Node<>(null, null, value);
        tNode.next = after;
        tNode.previous = temp;
        temp.next = tNode;
        size++;
    }

    //remove:
    public void removeByIndex(int size) {
        Node<T> temp = first;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        Node<T> last = temp.next;
        Node<T> head = temp.previous;
        head.next = last;
        last.previous = head;
        size--;
    }

    //     remove by value:
    public void removeByValue(T value) {
        Node<T> temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(value)) {
                removeByIndex(i);
            }
            temp = temp.next;
        }
    }

    public void setByIndex(int index, T value) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public int getSize() {
        return size;
    }

    public T getByIndex(int index) {
        int i = 0;
        Node<T> temp = first;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.value;}




}

