public class Tarefa {
    private String descricao;
    //private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        //this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\t" + "[\n" +
                "\t" + "\t" + "Classe: " + this.getClass().getName() + "\n" +
                "\t" + "\t" + "Descricao = " + this.descricao + "\n" +
                "\t" + "\t" + "DashCode = " + Integer.toHexString(this.hashCode()) + "\n" +
                "\t" + "]" +
                "\n";
    }
}
