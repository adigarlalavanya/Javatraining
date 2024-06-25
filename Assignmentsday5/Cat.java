package com.hcltech.Assignmentsday5;

class Cat extends Animal implements Pet {
    private String Name;

    public Cat(String name) {
        super(4);
        this.Name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void play() {
        System.out.println(Name + " is playing with a ball.");
    }

    @Override
    public void eat() {
        System.out.println(Name + " eats fish.");
    }
}
