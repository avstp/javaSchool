package homeWork_3;

public class MainList {
    public static void main(String[] args) {
        //заполняем список list элементами типа String
        LList list = new LList();
        list.add("1_element");
        list.add("2_element");
        list.add("3_element");
        list.add("4_element");
        list.add("5_element");
        list.add("6_element");
        System.out.println(list.get(1));
        list.showList();
        System.out.println("\n"+"======================================================================");
        //заполняем список listUser элементами типа User
        LList listUser = new LList();
        listUser.add(new User("L_1", "p_1"));
        listUser.add(new User("L_2", "p_2"));
        listUser.add(new User("L_3", "p_3"));
        System.out.println(listUser.get(1));
        listUser.showList();
        System.out.println("\n"+"======================================================================");
        //заполняем список listInt элементами типа int
        LList listInt = new LList();
        int a = 5;
        listInt.add(a);
        listInt.add(6);
        listInt.add(7);
        System.out.println(listInt.get(1));
        listInt.showList();
        System.out.println("\n"+"======================================================================");
    }

}
