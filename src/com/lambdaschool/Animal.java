package com.lambdaschool;

public abstract class Animal {
    static int maxId = 0;
    int idNumber;

    String name;
    int yearNamed;

    public Animal(String name, int yearNamed) {
        idNumber = maxId++;
        this.idNumber = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearNamed() {
        return yearNamed;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }
}
