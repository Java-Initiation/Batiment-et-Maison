package com.company;

import com.company.models.Batiment;
import com.company.models.Maison;

public class Main {

    public static void main(String[] args) {

        Batiment batiment = new Batiment("3 rue Dupond");
        Maison maison = new Maison("4 rue Petit", 4);

        System.out.println(batiment);
        System.out.println(maison);

    }

}