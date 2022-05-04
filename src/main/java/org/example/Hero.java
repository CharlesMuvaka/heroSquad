package org.example;

public class Hero {

    private String heroName;
    private String weakness;
    private String strength;
    private String clubName;



    private int id;
    private int age;
    private String heroImage;

    private Squad squadTeam;

    public Hero(String heroName, String weakness, String strength, int age) {
        this.heroName = heroName;
        this.weakness = weakness;
        this.strength = strength;
        this.heroImage = "/images/logo.jpeg";
        this.age = age;
    }

    public String getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(String heroImage) {
        this.heroImage = heroImage;
    }

    public String getClubName() {
        clubName = squadTeam.getSquadName();
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public Squad getSquadTeam() {
        return squadTeam;
    }

    public void setSquadTeam(Squad squadTeam) {
        this.squadTeam = squadTeam;
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

    public void update(String name, String strength, String weakness , int age) {
        this.heroName = name;
        this.weakness = weakness;
        this.strength = strength;
        this.age = age;
    }
}
