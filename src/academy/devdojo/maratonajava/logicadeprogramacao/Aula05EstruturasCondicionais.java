package academy.devdojo.maratonajava.logicadeprogramacao;

public class Aula05EstruturasCondicionais
{
    public static void main(String[] args)
    {
        Double salarioAnual = 100000.0;
        Double valorImposto, salarioLiquido;
        String relatorio;

        if (salarioAnual <= 34712)
        {
            valorImposto = salarioAnual * 0.097;
            salarioAnual -= salarioAnual * 0.097;
            relatorio = "Você vai pagar 9.7% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        }
        else if (salarioAnual > 34713 && salarioAnual <= 68507)
        {
            valorImposto = salarioAnual * 0.3735;
            salarioAnual -= salarioAnual * 0.3735;
            relatorio = "Você vai pagar 37.35% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        }
        else
        {
            valorImposto = salarioAnual * 0.495;
            salarioAnual -= salarioAnual * 0.495;
            relatorio = "Você vai pagar 49.50% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        }
        System.out.println(relatorio);
    }
}
