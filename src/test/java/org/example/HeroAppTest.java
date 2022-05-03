package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeroAppTest {

    @Test

    public void checkHeroId(){
        Hero hero = new Hero("","","",25);
        HeroApp heroApp = new HeroApp();
        heroApp.addHeroes(new ArrayList<>(), hero);

        assertEquals(1, hero.getId());
    }




}