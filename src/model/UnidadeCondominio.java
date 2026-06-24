package model;

public class UnidadeCondominio {

    private int id;
    private String dataAquisicao;
    private String dataVenda;
    private String observacao;
    private String status;

    @Override
    public String toString() {
        return "UnidadeCondominio{" + "id=" + id + ", dataAquisicao=" + dataAquisicao + ", dataVenda=" + dataVenda + ", observacao=" + observacao + ", status=" + status + '}';
    }

    public UnidadeCondominio() {
    }

    public UnidadeCondominio(int id, String dataAquisicao, String dataVenda, String observacao, String status) {
        this.id = id;
        this.dataAquisicao = dataAquisicao;
        this.dataVenda = dataVenda;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
