package com.company.killoran;

enum Type {FIRE, WATER, GRASS}


public class Pokemon  {
    private String name;
    private Type aType;
    private int health = 100;

    private double fireResistance = 0;
    private double waterResistance = 0;
    private double grassResistance = 0;

    public Pokemon(String name, Type aType) {
        this.name = name;
        this.aType = aType;

        if(aType == Type.WATER){
            fireResistance = -.5;
            grassResistance = +.5;
        }

        if(aType == Type.FIRE){
            grassResistance = +.5;
            waterResistance = -.5;
        }

        if(aType == Type.GRASS){
            waterResistance = +.5;
            fireResistance = -.5;
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
