package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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
        System.out.println("\n\nMedia salarial dos tres funcionarios: " + mediaSalario());
    }

    private double mediaSalario() {
        for (double a : salarios)
        {
            media += a;
        }
        media /= salarios.length;
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
