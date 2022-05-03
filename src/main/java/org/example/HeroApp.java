package org.example;

import java.util.ArrayList;
import java.util.List;

public class HeroApp {
    List<Hero> allHeroes = new ArrayList<>();

    public List<Hero> getAllHeroes() {
        return allHeroes;
    }

    public void setAllHeroes(List<Hero> allHeroes) {
        this.allHeroes = allHeroes;
    }

    public void addHeroes(List<Hero> list, Hero hero){
        if (allHeroes != null){
            allHeroes = list;
        }
        hero.setId(list.size());
        list.add(hero);
    }
}
