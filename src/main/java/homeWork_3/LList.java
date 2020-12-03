package homeWork_3;

import java.util.Objects;

public class LList {
    private Node root;

    //добавляем новый элемент в список
    public void add(Object item) {
        Node newItem = new Node(item);
        Node lastItem = findLast();
        if (lastItem != null)
            lastItem.next = newItem;
        else
            root = newItem;
    }

    //возвращаем из списка элнмент № id
    public Object get(int id) {
        if (id < 1) {
            return null;
        }
        Node item = root;
        while ((id > 1) && !Objects.isNull(item)) {
            id--;
            item = item.next;
        }
        return item;
    }

    //возвращаем размер списка
    public int size() {
        int size = 0;
        if (root == null)
            size = 0;
        else {
            size = 1;
            Node current = root;
            while (current.next != null) {
                size++;
                current = current.next;
            }
        }
        return size;
    }

    //возвращаем последний элемент списка
    Node findLast() {
        if (root == null)
            return null;
        else {
            Node current = root;
            while (current.next != null) {
                current = current.next;
            }
            return current;
        }
    }

    //вывод в консоль списка
    public void showList() {
        Node itemId = root;
        while (itemId.next != null) {
            System.out.print(itemId.data.toString() + " -> ");
            itemId = itemId.next;
        }
    }

}
