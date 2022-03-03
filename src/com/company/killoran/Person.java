package com.company.killoran;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private Pokemon aPokemon;
    private ArrayList<Pokemon> collectedPokemon = new ArrayList<>();


    public Person(String name, int age, Pokemon aPokemon) {
        this.name = name;
        this.age = age;
        this.aPokemon = aPokemon;
        collectedPokemon.add(aPokemon);//adds first pokemon to the collected list
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

    public ArrayList<Pokemon> getCollectedPokemon() {
        return collectedPokemon;
    }

    public void setCollectedPokemon(ArrayList<Pokemon> collectedPokemon) {
        this.collectedPokemon = collectedPokemon;
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
