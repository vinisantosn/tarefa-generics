package edu.ebac.generics;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(new Argo("Sim","Drive",2023));
        carrosList.add(new Onix("LT",2023,"AT"));
        carrosList.add(new Onix("LTZ",2023,"AT"));

        System.out.println(carrosList);

    }
}