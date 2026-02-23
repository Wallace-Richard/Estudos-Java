package academy.devdojo.maratonajava.Alogicadeprogramacao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //If, else if e else
        Double salarioAnual = 100000.0;
        Double valorImposto, salarioLiquido;
        String relatorio;

        if (salarioAnual <= 34712)
        {
            valorImposto = salarioAnual * 0.097;
            salarioAnual -= salarioAnual * 0.097;
            relatorio = "Você vai pagar 9.7% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        } else if (salarioAnual > 34713 && salarioAnual <= 68507)
        {
            valorImposto = salarioAnual * 0.3735;
            salarioAnual -= salarioAnual * 0.3735;
            relatorio = "Você vai pagar 37.35% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        } else
        {
            valorImposto = salarioAnual * 0.495;
            salarioAnual -= salarioAnual * 0.495;
            relatorio = "Você vai pagar 49.50% de imposto, o total de imposto cobrado foi de " + valorImposto + ", e seu salario liquido é de " + salarioAnual;
        }
        System.out.println(relatorio);


        //Switch
        byte dia = 5; // char, int, byte, short, enum e String

        switch (dia)
        {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
    }
}
