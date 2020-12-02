package homeWork_4;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    @Override
    public String toString() {
        return surname +" "+ name + ", "+ age + "  ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    //сортировка сначала по Фамилии, затем по Имени и окончательно по возрасту
    public int compareTo(Person person) {
        int result = this.surname.compareTo(person.surname);
        if(result != 0){
            return result;
        }
        result = this.name.compareTo(person.name);
        if(result != 0){
            return result;
        }
        result = this.age - person.age;
        if(result != 0){
            return (int)result/Math.abs(result);
        }
        return 0;
    }
    //объединяем имя
    public void connotation(Person person){
       this.surname = this.surname + " + " + person.surname;
       this.name = this.name + " + " + person.name;
        this.age = this.age  + person.age;
    }
    public void setPerson(Person person){
        this.surname = person.surname;
        this.name = person.name;
        this.age = person.age;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
}
