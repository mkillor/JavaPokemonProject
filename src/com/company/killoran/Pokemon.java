package com.company.killoran;

import java.util.ArrayList;

enum Type {FIRE, WATER, GRASS, BASIC}

public class Pokemon  {
    private String name;
    private Type aType;
    private int health;


    private double fireResistance = 1.00;
    private double waterResistance = 1.00;
    private double grassResistance = 1.00;

    //damage delivered = damage * resistance

    public Pokemon(String name, Type aType, int health) {
        this.name = name;
        this.aType = aType;
        this.health = health;



        if(aType == Type.WATER){
            fireResistance = .7;
            grassResistance = 1.3;
        }

        if(aType == Type.FIRE){
            grassResistance = 1.3;
            waterResistance = .7;
        }

        if(aType == Type.GRASS){
            waterResistance = 1.3;
            fireResistance = .7;
        }
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", aType=" + aType +
                ", health=" + health +
                ", fireResistance=" + fireResistance +
                ", waterResistance=" + waterResistance +
                ", grassResistance=" + grassResistance +
                '}';
    }
}
