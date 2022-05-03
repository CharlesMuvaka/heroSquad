package org.example;

public class Hero {

    private String heroName;
    private String weakness;
    private String strength;
    private int id;
    private int age;

    public Hero(String heroName, String weakness, String strength, int id, int age) {
        this.heroName = heroName;
        this.weakness = weakness;
        this.strength = strength;
        this.id = id;
        this.age = age;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
