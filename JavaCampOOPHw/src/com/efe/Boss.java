package com.efe;

public class Boss {

String name;

    public Boss(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Boss{" +
                ", name='" + name + '\'' +
                '}';
    }
}
