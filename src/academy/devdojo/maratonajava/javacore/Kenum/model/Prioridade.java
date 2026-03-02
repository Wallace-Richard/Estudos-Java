package academy.devdojo.maratonajava.javacore.Kenum.model;

public enum Prioridade {
    ALTA(1, "Urgente"),
    MEDIA(2, "Normal"),
    BAIXA(3, "Pode esperar");

   private int codigo;
   private String status;

    Prioridade(int codigo, String situacao) {
        this.codigo = codigo;
        this.status = situacao;
    }

    public static Prioridade buscaPorCodigo(int cod){
        for (Prioridade situacao : values())
        {
            if (situacao.getCodigo() == cod)
            {
                return situacao;
            }
        }
        return null;
    }

    public static Prioridade buscaPorNome(String nome){
        for (Prioridade situacao : values())
        {
            if (situacao.getStatus().equalsIgnoreCase(nome));
            return situacao;
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }
}
