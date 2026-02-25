package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Seminario;

public class SistemaGerenciamentoExercicio {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras ");
        Aluno aluno1 = new Aluno("Luffy", 18);
        Aluno aluno2 = new Aluno("Sanji", 18);
        Aluno aluno3 = new Aluno("Naruto", 18);

        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno1, aluno2, aluno3};

        Seminario seminario = new Seminario("Onde achar o one piece", local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();


    }
}
