package com.kea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Route> liste = new ArrayList<Route>();

        liste.add(new Route("Svendborg","Ærøskøbing",43,"75 min",1));
        liste.add(new Route("Fynshav","Søby",41,"55 min",2));
        liste.add(new Route("Faaborg","Søby",43,"60 min",3));

        for(int i=0;i<liste.size();i++)
        {
           System.out.println(""+liste.get(i));
        }

        System.out.println("Indtast nr:");
        Scanner scanner=new Scanner(System.in);
        int menu=scanner.nextInt();

        for (int i=0;i<liste.size();i++)
        {

            if(liste.get(i).getMenupunkpunkt()==menu)

                System.out.println(""+liste.get(i));


        }

    }

}
