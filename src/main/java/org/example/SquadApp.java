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
        list.add(squad);
        squad.setId(list.size());

    }

    public void setSquads(List<Squad> squads) {
        this.allSquads = squads;
    }

    public  Squad findById(int squadId) {
        return  allSquads.get(squadId);
    }

    public void clearAllSquads(){
        allSquads.clear();
    }

    public void deleteSquad(int squadId) {
        allSquads.remove(squadId);
    }
}
