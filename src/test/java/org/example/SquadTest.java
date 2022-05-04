package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @Test
   public void getId_returnIdOfTheSquad() {

        Squad squad = new Squad("","");
        SquadApp squadApp = new SquadApp();
        squadApp.addSquad(new ArrayList<>(),squad);


        assertEquals(1,squad.getId());
    }

    @Test
    public void checkHeroesInATeam() {

        Squad squad = new Squad("","");
        SquadApp squadApp = new SquadApp();
        squadApp.addSquad(new ArrayList<>(),squad);
        Hero hero = new Hero("1","","",25);
        Hero hero2 = new Hero("","","",25);
        squad.addHero(hero);
        squad.addHero(hero2);

        assertEquals(2,squad.getSquadHeroes().size());
    }
}