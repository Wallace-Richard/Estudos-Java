package academy.devdojo.maratonajava.javacore.Aintroducaoclasse.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasse.model.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println();

        estudante2.nome = "Sandy";
        estudante2.idade = 36;
        estudante2.sexo = 'M';
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
