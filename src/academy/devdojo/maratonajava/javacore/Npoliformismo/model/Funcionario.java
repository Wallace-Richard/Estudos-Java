package academy.devdojo.maratonajava.javacore.Npoliformismo.model;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private Cargo cargo;

    public Funcionario(String nome, String cpf, double salarioBase, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public abstract void calcularSalarioTotal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
