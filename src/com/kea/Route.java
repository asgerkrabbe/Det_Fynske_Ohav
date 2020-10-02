package com.kea;

public class Route {
    private String By1;
    private String By2;
    private int Pris;
    private String Overfartstid;

    public int getMenupunkpunkt() {
        return Menupunkpunkt;
    }

    private int Menupunkpunkt;

    public Route(String afgang, String ankomst, int pris, String overfartstid, int menupunkpunkt) {
        Menupunkpunkt=menupunkpunkt;
        By1 = afgang;
        By2 = ankomst;
        Pris = pris;
        Overfartstid = overfartstid;
    }


    public String toString() {
        return Menupunkpunkt+". Afgang: "+By1+ " - "+By2+"\t Pris: "+Pris+ " Overfartstid: "+Overfartstid;
    }
}
