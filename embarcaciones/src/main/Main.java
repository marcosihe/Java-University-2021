package main;

import embarcaciones.Embarcacion;
import embarcaciones.Velero;
import embarcaciones.Yate;
import tripulantes.Capitan;

public class Main {
    public static void main(String[] args) {
        Embarcacion yateUno = new Yate(5000, 2021, 120, 60);
        Embarcacion yateDos = new Yate(6500, 2022, 130, 85);
        Embarcacion veleroUno = new Velero(1750, 2010, 30, 6);
        Capitan capitanDeTucuman = new Capitan("Marcos", "Her", 1256);

        System.out.println(((Yate) yateUno).esMasLujoso((Yate) yateDos));
        System.out.println(((Velero) veleroUno).esGrande());


        yateDos.setCapitanAsociado(capitanDeTucuman);

        System.out.println(yateDos.getCapitanAsociado());
    }
}
