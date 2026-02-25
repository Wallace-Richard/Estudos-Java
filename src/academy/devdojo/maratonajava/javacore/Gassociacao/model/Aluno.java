package academy.devdojo.maratonajava.javacore.Gassociacao.model;

public class Aluno {
    private String aluno;
    private int idade;
    private Seminario seminario;

    public Aluno(String aluno, int idade) {
        this.aluno = aluno;
        this.idade = idade;
    }

    public Aluno(String aluno, int idade, Seminario seminario) {
        this.aluno = aluno;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
