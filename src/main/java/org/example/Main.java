package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark. *;



public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        Hero charles = new  Hero("Messi","Striker","Goalkeeper",25);
        Hero charles1 = new Hero("Ronaldo","Striker","Goalkeeper",25);
        Hero charles2 = new Hero("Mbappe","Striker","Goalkeeper",25);
        Hero charles3 = new Hero("Fabinho","Striker","Goalkeeper",25);
        Hero charles4 = new Hero("Suarez","Striker","Goalkeeper",25);
        Hero charles5 = new Hero("Torress","Striker","Goalkeeper",25);
        Hero charles6 = new Hero("Diaz","Striker","Goalkeeper",25);
        Hero charles7 = new Hero("VanDyk","Midfielder","Defender",25);

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

        liverpool.addHero(charles);
        liverpool.addHero(charles1);


        wolves.addHero(charles2);
        wolves.addHero(charles3);


        chelsea.addHero(charles4);
        chelsea.addHero(charles7);


        wigan.addHero(charles5);
        wigan.addHero(charles6);


        System.out.println(heroes);

        get("/",(request, response)->{
            Map<String, Object> templateData = new HashMap<>();
            request.session().attribute("allSquads", squads);

            templateData.put("squads", request.session().attribute("allSquads"));
            return new ModelAndView(templateData, "index.hbs");

        }, new HandlebarsTemplateEngine());

        get("/heroes",(request, response)->{
            Map<String, Object> templateData = new HashMap<>();
            request.session().attribute("allSquads", heroes);

            templateData.put("Heroes", request.session().attribute("allSquads"));
            return new ModelAndView(templateData, "players.hbs");

        }, new HandlebarsTemplateEngine());

        get("/heroes/new",(request, response)->{
            Map<String, Object> templateData = new HashMap<>();


            templateData.put("squads", request.session().attribute("allSquads"));
            return new ModelAndView(templateData, "squadForm.hbs");

        }, new HandlebarsTemplateEngine());

        post("/heroes/new",(request,response)->{
            Map<String, Object> templateData = new HashMap<>();
            request.session().attribute("allSquads", heroes);

            String heroName = request.queryParams("heroName");
            int heroAge = Integer.parseInt(request.queryParams("age"));
            String heroTeamName = request.queryParams("clubName");
            String heroStrengths = request.queryParams("strengths");
            String heroWeakness = request.queryParams("weakness");

            Hero newHero = new Hero(heroName,heroWeakness,heroStrengths,heroAge);
            newHero.setClubName(heroTeamName);

            heroApp.addHeroes(heroes,newHero);
            List<Hero> updatedList = heroApp.getAllHeroes();
            request.session().attribute("allSquads", updatedList);
            templateData.put("Heroes", request.session().attribute("allSquads"));
            return  new ModelAndView(templateData, "players.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/:id/update",(request, response)->{
            Map<String, Object> templateData = new HashMap<>();
            request.session().attribute("allSquads");
            int id = Integer.parseInt(request.params("id"));
            Hero editHero = heroApp.findById(id);
            request.session().attribute("allSquads", editHero);


            templateData.put("editHero", request.session().attribute("allSquads"));
            return new ModelAndView(templateData, "squadForm.hbs");

        }, new HandlebarsTemplateEngine());

//        post("/posts/:id/update", (request, response) -> {
//            Map<String, Object> model = new HashMap<>();
//            String newContent = req.queryParams("content");
//            int id = Integer.parseInt(request.params("id"));
//            Hero editHero = heroApp.findById(id);
//            editHero.update(); //don’t forget me
//            return new ModelAndView(model, "players.hbs");
//        }, new HandlebarsTemplateEngine());








    }
}