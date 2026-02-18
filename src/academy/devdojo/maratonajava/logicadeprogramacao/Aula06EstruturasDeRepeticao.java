package academy.devdojo.maratonajava.logicadeprogramacao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while
        int i = 0, count = 20;

        while (i < 10)
        {
            System.out.println(++i);

        }

        //for
        for (i = 0; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        //do while
        do
        {
            System.out.println("dentro do do while: " + count++);
        } while (count < 10);


        //break
        double valorTotal = 5000;

        for (int parcela = 1; parcela <= valorTotal; parcela++)
        {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000)
            {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

        //continue
        valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--)
        {
            double valorParcela = valorTotal / parcela;

            if (valorParcela <= 1000)
            {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            System.out.println("CODIGO CONSUMINDO MEMORIA!");
        }
    }
}
