package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, int salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" + "linguagem='" + linguagem + '\'' + ", nome='" + nome + '\'' + ", salario=" + salario + '}';
    }
}
