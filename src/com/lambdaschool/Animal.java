package com.lambdaschool;

public abstract class Animal {
    static int maxId = 0;
    int idNumber;

    String name;
    int yearNamed;

    public Animal(String name, int yearNamed) {
        idNumber = maxId++;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();

}
