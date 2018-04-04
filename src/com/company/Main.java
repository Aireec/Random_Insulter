package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//Array of names
        String[] List = {"Joshua" , "Shane" , "Carl", "Levano", "Tammy"};
       //Array of adjectives
        String[] adj = {"Ugly", "foul", "putride", "stinky" , "big" };
        //Array of body parts
        String [] body = {"Feet", "heart", "spleen", "brain", "Skeleton"};
        //'random' object
        Random r = new Random();

//selects a random name from array and displays it
            System.out.println( List[r.nextInt(List.length)] + " " +  adj[r.nextInt(adj.length)] + " " + body[r.nextInt(body.length)]);

        }
    }

