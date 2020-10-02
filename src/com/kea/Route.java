package com.kea;

public class Route {
    private String By1;
    private String By2;
    private double Pris;
    private String Overfartstid;

    public int getMenupunkpunkt() {
        return Menupunkpunkt;
    }

    private int Menupunkpunkt;

    public Route(String by1, String by2, double pris, String overfartstid,int menupunkpunkt) {
        Menupunkpunkt=menupunkpunkt;
        By1 = by1;
        By2 = by2;
        Pris = pris;
        Overfartstid = overfartstid;
    }


    public String toString() {
        return ""+Menupunkpunkt+": By1: "+By1+ ", By2: "+By2+" Pris: "+Pris+ "overfartstid: "+Overfartstid;
    }
}
