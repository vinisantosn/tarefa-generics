package edu.ebac.generics;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Argo> lojasFiat = new ArrayList<>();
        List<Onix> lojasGM = new ArrayList<>();


        lojasFiat.add(new Argo("Sim","Drive",2023)
        );

        lojasGM.add(new Onix("LT",2023,"AT"));
        lojasGM.add(new Onix("LTZ",2023,"AT"));


        System.out.println(lojasFiat);
        System.out.println(lojasGM);

    }
}