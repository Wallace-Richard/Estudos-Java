package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.model.Prioridade;

public class SistemaDeChamados {
    public static void main(String[] args) {

        System.out.println(Prioridade.buscaPorCodigo(2));
        System.out.println(Prioridade.buscaPorNome("URGENTE"));
    }
}
