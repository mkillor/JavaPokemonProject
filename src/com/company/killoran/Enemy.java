package com.company.killoran;

class Enemy {
    private String name;
    private Pokemon aPokemon;

    public Enemy(String name, Pokemon aPokemon) {
        this.name = name;
        this.aPokemon = aPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getaPokemon() {
        return aPokemon;
    }

    public void setaPokemon(Pokemon aPokemon) {
        this.aPokemon = aPokemon;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", aPokemon=" + aPokemon +
                '}';
    }
}
