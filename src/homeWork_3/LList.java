package homeWork_3;

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
    }
}

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
        Node itemId = root;
        if (id > 0) {
            for (int i = 0; i < id && i!= id-1; i++) {
                if (itemId.next == null) {
                    System.out.println("Количество элементов в списке меньше введеного значения " + id);
                    return null;
                } else {
                    itemId = itemId.next;
                }
            }
            return itemId.data;
        } else {
            System.out.println("Количество элементов в списке меньше введеного значения " + id);
            return null;
        }
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
