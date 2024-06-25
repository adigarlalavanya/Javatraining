package com.hcltech.Assignmentsday5;

class Fish extends Animal implements Pet {
    private String Name;

    public Fish() {
        super(0);
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
        System.out.println(Name + " plays while  swimming.");
    }

    @Override
    public void eat() {
        System.out.println(Name + " eats algae, plants, worms and etc.");
    }

    @Override
    public void walk() {
        System.out.println(Name + " cannot walk as it has no legs but it can Swim.");
    }
}