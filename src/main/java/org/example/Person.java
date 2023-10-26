package org.example;

public class Person {
    private String name;
    private String surname;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public void move(int countSteps) {
        System.out.println(name + " сделал " + countSteps + " шагов");
    }

    public void talk(String s) {
        System.out.println(name + " говорит: " + s);
    }


}
