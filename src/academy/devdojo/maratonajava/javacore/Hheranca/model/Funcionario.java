package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Funcionario extends Pessoa {
    private int salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, int salario) {
        super(nome, cpf);
        this.salario = salario;
    }
}
