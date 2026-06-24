package model;

public class FuncaoMandato {

    private int id;
    private String funcao;
    private String dataInicio;
    private String dataFim;
    private String observacao;
    private String status;

    @Override
    public String toString() {
        return "FuncaoMandato{" + "id=" + id + ", funcao=" + funcao + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", observacao=" + observacao + ", status=" + status + '}';
    }

    public FuncaoMandato() {
    }

    public FuncaoMandato(int id, String funcao, String dataInicio, String dataFim,
            String observacao, String status) {
        this.id = id;
        this.funcao = funcao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
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
