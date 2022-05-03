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
}