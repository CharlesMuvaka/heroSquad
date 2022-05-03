package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero charles = new  Hero("Charles","Striker","Goalkeeper",25);
        Hero charles1 = new Hero("Charles1","Striker","Goalkeeper",25);
        Hero charles2 = new Hero("Charles2","Striker","Goalkeeper",25);
        Hero charles3 = new Hero("Charles3","Striker","Goalkeeper",25);
        Hero charles4 = new Hero("Charles4","Striker","Goalkeeper",25);
        Hero charles5 = new Hero("Charles5","Striker","Goalkeeper",25);
        Hero charles6 = new Hero("Charles6","Striker","Goalkeeper",25);
        Hero charles7 = new Hero("Charles7","Midfielder","Defender",25);

        Squad liverpool = new Squad("liverpool","/images/liverpool.jpeg");
        Squad wolves = new Squad("wolves","/images/wolves.png");
        Squad chelsea = new Squad("chelsea","/images/chelsea.jpeg");
        Squad wigan = new Squad("wigan","/images/logo.jpeg");

        List<Hero> heroes = new ArrayList<>();
        List<Squad> squads = new ArrayList<>();

        HeroApp heroApp = new HeroApp();
        heroApp.addHeroes(heroes, charles);
        heroApp.addHeroes(heroes, charles1);
        heroApp.addHeroes(heroes, charles2);
        heroApp.addHeroes(heroes, charles3);
        heroApp.addHeroes(heroes, charles4);
        heroApp.addHeroes(heroes, charles5);
        heroApp.addHeroes(heroes, charles6);
        heroApp.addHeroes(heroes, charles7);

        SquadApp squadApp = new SquadApp();
        squadApp.addSquad(squads, liverpool);
        squadApp.addSquad(squads, chelsea);
        squadApp.addSquad(squads, wolves);
        squadApp.addSquad(squads, wigan);






    }
}