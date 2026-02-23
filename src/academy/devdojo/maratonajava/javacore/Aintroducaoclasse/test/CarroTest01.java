package academy.devdojo.maratonajava.javacore.Aintroducaoclasse.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasse.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "A45";
        carro1.modelo = "Mercedes-Benz";
        carro1.ano = 2016;

        carro2.nome = "Polo";
        carro2.modelo = "Volkswagen";
        carro2.ano = 2025;

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\nCarro 2: ");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
