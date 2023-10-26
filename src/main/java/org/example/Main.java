package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(56);
        person1.setName("Иван");
        person1.setSurname("Ткаленко");

        Person person2 = new Person("Максим", "Иванов", 23);

        Person person3 = new Person("Олег", "Смирнов", 91);

        Person person4 = new Person("Арина", "Колесникова", 55);

        Person person5 = new Person("Маша", "Король", 7);

        person1.move(20);
        person2.talk("Hello everyone");

        ArrayList<Person> list = new ArrayList();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getSurname() + " " + list.get(i).getAge());
        }

        int max = 0;
        String smax = "";
        for (int i = 0; i < list.size(); i ++ ) {
            if (max < list.get(i).getAge()) {
                max = list.get(i).getAge();
                smax = list.get(i).getAge() + " " + list.get(i).getName() + " " + list.get(i).getSurname();
            }
        }
        System.out.println(smax);

        int min = list.get(0).getAge();
        String smin = "";
        for (int i = 0; i < list.size(); i ++ ) {
            if (min > list.get(i).getAge()) {
                min = list.get(i).getAge();
                smin = list.get(i).getAge() + " " + list.get(i).getName() + " " + list.get(i).getSurname();
            }
        }
        System.out.println(smin);


        for (int i = 0; i < list.size(); i ++ ) {
            if (list.get(i).getSurname().startsWith("К")) {
                System.out.println(list.get(i).getName() + " " + list.get(i).getSurname() + " " + list.get(i).getAge());
            }
        }



    }
}