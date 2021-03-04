package com.company.killoran;

public class Person {
    private String name;
    private int age;
    private Pokemon aPokemon;

    public Person(String name, int age, Pokemon aPokemon) {
        this.name = name;
        this.age = age;
        this.aPokemon = aPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pokemon getaPokemon() {
        return aPokemon;
    }

    public void setaPokemon(Pokemon aPokemon) {
        this.aPokemon = aPokemon;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aPokemon=" + aPokemon +
                '}';
    }
}
