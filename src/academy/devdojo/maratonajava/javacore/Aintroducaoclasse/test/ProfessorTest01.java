package academy.devdojo.maratonajava.javacore.Aintroducaoclasse.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasse.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();

        professor1.nome = "Mestre Kami";
        professor1.idade = 140;
        professor1.sexo = 'M';

        System.out.println(professor1.nome + " " + professor1.idade + " " + professor1.sexo);
    }
}
