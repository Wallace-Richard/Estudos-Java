package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Seleção Brasileira");
        Jogador jogador1 = new Jogador("Pelé", time);
        Jogador jogador2 = new Jogador("Romario", time);
        Jogador jogador3 = new Jogador("Cafu", time);
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        time.setJogadores(jogadores);

        time.imprimir();



    }
}
