package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.print("Salarios: ");
        if (salarios == null)
        {
            return;
        }
        for (double salario : salarios)
        {
            System.out.print(salario + " ");
        }
    }

    public void mediaSalario(double[] salario) {
        double media = 0;
        for (double a : salario)
        {
            media += a;
        }
        media /= salario.length;
        System.out.println("\n\nMedia salarial dos tres funcionarios: " + media);
    }
}
