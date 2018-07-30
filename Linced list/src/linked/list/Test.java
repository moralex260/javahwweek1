package linked.list;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(20);
        myLinkedList.add(50);
        myLinkedList.add(80);
        myLinkedList.prepend(111);
        System.out.println(myLinkedList.toStringLinkedList());
        myLinkedList.addByIndex(1,333);
        System.out.println(myLinkedList.toStringLinkedList());
      myLinkedList.removeByIndex(1);
        System.out.println(myLinkedList.toStringLinkedList());
        myLinkedList.removeByValue(20);
        System.out.println(myLinkedList.toStringLinkedList());
        myLinkedList.setByIndex(2,60);
        System.out.println(myLinkedList.toStringLinkedList());
        myLinkedList.getByIndex(2);
        System.out.println(myLinkedList.getByIndex(0));

    }
}
