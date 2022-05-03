package org.example;

import java.util.ArrayList;
import java.util.List;

public class SquadApp {
    List<Squad> allSquads = new ArrayList<>();

    public List<Squad> getSquads(){
       return allSquads;
    }

    public void addSquad(List<Squad> list, Squad squad){
        if (allSquads != null){
            allSquads = list;
        }
        squad.setId(list.size());
        list.add(squad);
    }

    public void setSquads(List<Squad> squads) {
        this.allSquads = squads;
    }
}
