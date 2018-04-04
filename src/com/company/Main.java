package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//Array of names
        String[] List = {"Joshua" , "Shane" , "Carl", "Levano", "Tammy"};
//'random' object
        Random r = new Random();

//selects a random name from array and displays it
            System.out.println( List[r.nextInt(List.length)]);

        }
    }

