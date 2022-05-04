package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test

    public void checkHeroId(){
        Hero hero = new Hero("","","",25);
        HeroApp heroApp = new HeroApp();
        heroApp.addHeroes(new ArrayList<>(), hero);

        assertEquals(1, hero.getId());
    }

    @Test
    public void updateChangesHeroContent() throws Exception {
        Hero hero = new Hero("","","",25);

        hero.update("charles","playing","eating",30);

        assertEquals("playing", hero.getStrength());
    }




}