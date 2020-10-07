package com.kea;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Route> liste = new ArrayList<Route>();

        liste.add(new Route("Svendborg", "Ærøskøbing", 45, "75 min", 1));
        liste.add(new Route("Ærøskøbing","Svendborg",45,"75 min",2));
        liste.add(new Route("Fynshav", "Søby\t\t", 45, "55 min", 3));
        liste.add(new Route("Søby","Faaborg\t\t",45,"60 min",4));
        liste.add(new Route("Faaborg", "Søby\t\t", 45, "60 min", 5));
        liste.add(new Route("Søby","Fynshav\t\t",45,"60 min",6));

        for(int i=0;i<liste.size();i++)
        {
           System.out.println(""+liste.get(i));
        }

        System.out.println("\nVælg afgang:");

        Scanner scanner=new Scanner(System.in);
        int menu=scanner.nextInt();

        for (int i=0;i<liste.size();i++)
        {
            if(liste.get(i).getMenupunkpunkt()==menu)

                System.out.println(liste.get(i));
        }






    }
}
