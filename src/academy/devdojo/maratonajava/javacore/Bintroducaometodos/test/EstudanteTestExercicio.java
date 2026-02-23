package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Funcionario;

public class EstudanteTestExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 45;
        funcionario.salarios = new double[]{3000.0, 3000.0, 3000.0};

        funcionario.imprimir();

        funcionario.mediaSalario(funcionario.salarios);
    }
}
