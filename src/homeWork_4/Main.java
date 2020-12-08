package homeWork_4;

import java.util.*;

public class Main {
    //инициализация LinkedList объектами Person, n - количество добавляемых элементов
    public static List initializationRandomPerson(int n) {
        List<Person> personList = new LinkedList<>();
        String[] nameMas = {"Ivan", "Alexey", "Maria", "Stepan", "Olga", "Sasha", "Sveta", "Nina", "Tatiana", "Vova", "Daria"};
        String[] surnameMas = {"CHernykh", "Voron", "Veber", "Braun", "Evans", "Grant", "Teilor", "Stoun", "Norman", "Gordon", "Koval", "Ogonek", "Maier", "Verner"};
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            personList.add(new Person(nameMas[random.nextInt(nameMas.length)], surnameMas[random.nextInt(surnameMas.length)], random.nextInt(103) + 17));
        }
        return personList;
    }

    //3. Вывести список элементов в читабельном виде.
    public static <E> void showList(Collection<E> list) {
        int i = 1;
        for (E l : list) {
            System.out.println(i + ") " + l);
            i++;
        }
        System.out.println("==============================================================");
    }
    //Вывести карту в консоль
    public static<E, T> void showMap(Map<E, T>  map) {
        int i = 1;
        for (Map.Entry<E, T> m : map.entrySet()) {
            System.out.println(i + ".  " + m.getKey()+":  " + m.getValue());
            i++;
        }
        System.out.println("==============================================================");
    }
    public static<E> long hashCodeLIST(Collection<E> list){
        long sumHashCode = 0;
        for(E l: list){
           sumHashCode += l.hashCode();
        }
        return sumHashCode;
    }

    public static void main(String[] args) {
        // 1. Создать лист из своих объектов (10-15 элементов в списке). Добавить, удалить и т.д.
        List<Person> personList = initializationRandomPerson(10);
        personList.add(0, new Person("MARIA", "KUZNETSOVA", 28));
        personList.add(4, new Person("YANA", "KUZNETSOVA", 18));
        personList.add(new Person("IVAN", "IVANOV", 18));
        personList.set(1, new Person("M***", "K***", 17));
        personList.remove(10);
        personList.remove(new Person("IVAN", "IVANOV", 18));
        showList(personList);
        /*2. Добавить дубли в список (1 - несколько раз один и тот же объект,
         *2 - дубль должен быть новым объектом с теми же параметрами, что уже имеет один из существующих в списке)
         */
        Person person = new Person("IVAN", "IVANOV", 18);
        personList.add(person);
        personList.add(person);
        personList.add(person);
        personList.add(new Person("IVAN", "IVANOV", 18));
        personList.add(new Person("IVAN", "IVANOV", 18));
        personList.add(new Person("IVAN", "IVANOV", 18));
        showList(personList);

        //4. Создать неповторяющееся упорядоченное множество с использованием компаратора
        // и перенести значения из созданного листа.
        Set<Person> personSet = new TreeSet<>();
        personSet.addAll(personList);
        showList(personSet);

        //5. Обход дерева с помощью forEach и iterator (подсчет или конкатинация из объектов коллекции используя условие,
        // например "все начинаются с буквы", "больше какого-то значения")

        Iterator<Person> iterator = personSet.iterator();
        Person p, personK = new Person();
        boolean firstPersonK = false;
        while (iterator.hasNext()) {
            p = iterator.next();
            //если фамилия начинается с буквы K объединяем имена
            if (p.getSurname().startsWith("K")) {
                if (firstPersonK == false) {
                    personK = p;
                    firstPersonK = true;
                } else {
                    personK.connotation(p);
                }
                iterator.remove();
            }
        }
        personSet.add(personK);
        showList(personSet);

        //6. Удалить третий элемент из множества.
        personList.clear();
        personList.addAll(personSet);
        personList.remove(3);
        showList(personList);

        //7. Из существующей коллекции объектов создать ассоциативную карту, где ключ - объект, а значение - коллекция
        Map<Person, Collection> personMap = new HashMap<>();
        for(Person pp: personList){
            personMap.put(pp, personList);
        }
        showMap(personMap);

        //8. Из существующей карты создать другую, в которой ключ остается прежним, а значение - вычисленное значение
        // чего-либо из коллекции для ключа (по нескольким вариантам значений)
        Map<Person, Long> personHashMap = new HashMap<>();
        for (Map.Entry<Person, Collection> m : personMap.entrySet()) {
            //вычисленное значение чего-либо из коллекции - сумма hashCode-ов всей коллекции минус hashCode ключа
            personHashMap.put(m.getKey(), new Long(hashCodeLIST(m.getValue()) - m.getKey().hashCode()));
        }
        showMap(personHashMap);

    }

}
