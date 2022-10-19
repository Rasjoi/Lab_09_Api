package com.company;

import Classes.JSONGetter;
import Classes.SpaceCrafts;
import Classes.Spacecraft;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  throws IOException {

        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "http://stapi.co/api/v1/rest/spacecraft/search";
        jsonGetter.run();

        SpaceCrafts spaceCrafts = new ObjectMapper().readValue(jsonGetter.jsonIn,SpaceCrafts.class);


        System.out.println(spaceCrafts);


        System.out.println("\n-------------------\n");

        spaceCrafts.getSpacecrafts().sort(Spacecraft.byUIdAsc);
        System.out.println("After sorting by spacecraft uID ascending:\n" + spaceCrafts);

        spaceCrafts.getSpacecrafts().sort(Spacecraft.byUIdDesc);
        System.out.println("After sorting by spacecraft uID descending:\n" + spaceCrafts);

        spaceCrafts.getSpacecrafts().sort(Spacecraft.byNameAsc);
        System.out.println("After sorting by spacecraft name ascending:\n" + spaceCrafts);

        spaceCrafts.getSpacecrafts().sort(Spacecraft.byNameDesc);
        System.out.println("After sorting by spacecraft name descending:\n" + spaceCrafts);


    }
}
