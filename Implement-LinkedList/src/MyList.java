public class MyList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyList() {
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void add(int index, Object data) {
        if (index > numNodes)
            return;
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addLast(Object data) {
        if (numNodes == 0) {
            head = new Node(data);
            numNodes++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public int indexOf(E e) {
        Node temp = head;
        Node target = new Node(e);
        int index = 0;
        while (temp.next != null) {
            if (temp.getData() == target.getData()) {
                break;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public void remove(E e) {
        if (indexOf(e) == 0) {
            head = head.next;
            numNodes--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < indexOf(e) - 1 && temp.next.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            numNodes--;
            return;
        }
        Node temp = head;
        int currentIndex = 0;
        while (currentIndex < index - 1) {
            temp = temp.next;
            currentIndex++;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E e) {
        Node temp = head;
        Node target = new Node(e);
        boolean flag = false;
        while (temp != null) {
            if (temp.getData() == target.getData()) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }

    public Object getFirst() {
        return head.getData();
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public Object get(int index) {
        if (index == 0) {
            return head.getData();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            result.append(temp.getData()).append(", ");
            temp = temp.next;
        }
        if (result.length() > 2)
            result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }
}