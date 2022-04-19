import java.util.ArrayList;
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(33, 12);
        myList.add(1, -2);
        myList.add(69);
        myList.add(3, 6);
        myList.add(2, 4);
        myList.add(9,88);
        System.out.println(myList);

        System.out.println(myList.remove(2));
        System.out.println(myList);
        System.out.println(myList.remove(0));
        System.out.println(myList);

        System.out.println(myList.getSize());

        System.out.println(myList.contains(9));
        System.out.println(myList.indexOf(4));
        System.out.println(myList.indexOf(69));

        MyList<Integer> myNewArray = myList.clone();
        System.out.println(myList);
        System.out.println(myNewArray);

        myList.clear();
        System.out.println(myList);
    }
}
