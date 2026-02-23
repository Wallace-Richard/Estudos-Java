package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Funcionario;

public class FuncionarioTest01Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(45);
        funcionario.setSalarios(new double[]{3000.0, 3000.0, 3000.0});

        funcionario.imprimir();
        System.out.println();
    }
}
