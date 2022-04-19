public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myLinkedList = new MyList<>();
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.add(2,3);
        System.out.println(myLinkedList);
        myLinkedList.addLast(7);
        System.out.println(myLinkedList);
        myLinkedList.addLast(8);
        myLinkedList.addLast(9);
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);

        System.out.println(myLinkedList);
        System.out.println("6 is at: " + myLinkedList.indexOf(6));
        myLinkedList.remove(11);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.removeAtIndex(0);
        System.out.println(myLinkedList);
        myLinkedList.removeAtIndex(7);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(7));
        System.out.println(myLinkedList.contains(69));

        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

        myLinkedList.clear();
        System.out.println(myLinkedList);
    }
}
