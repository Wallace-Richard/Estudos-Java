package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.model.Tv;


public class TelevisaoTest01 {
    public static void main(String[] args) {
        Tv televisao = new Tv("Samsung");
        Tv televisao1 = new Tv("LG");

        System.out.println("Televisão " + televisao.getMarca() + " " + televisao.ligar());
        System.out.println("Televisão " + televisao1.getMarca() + " " + televisao1.ligar());

    }
}

