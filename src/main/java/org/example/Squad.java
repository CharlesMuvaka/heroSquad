package org.example;


import java.util.HashSet;
import java.util.Set;

public class Squad {
    private String squadName;
    private String squadImage;

    private Set<String> squadHeroes = new HashSet<>();

    private int id;

    public Squad(String name, String image){
        this.squadName = name;
        this.squadImage = image;
    }

    public void addHero(Hero hero){
        this.squadHeroes.add(hero.getHeroName());
        hero.setSquadTeam(this);
    }

    public Set<String> getSquadHeroes() {
        return squadHeroes;
    }

    public void setSquadHeroes(Set<String> squadHeroes) {
        this.squadHeroes = squadHeroes;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getSquadImage() {
        return squadImage;
    }

    public void setSquadImage(String squadImage) {
        this.squadImage = squadImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
