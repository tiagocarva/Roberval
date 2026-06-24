package model;

public class MovimentoCaixa {

    private int id;
    private String dataEmissao;
    private String dataVencimento;
    private String dataPagamento;
    private float valorEmitido;
    private float multas;
    private float correcaoMonetaria;
    private float juros;
    private float valorPagRec;
    private String tipo;
    private boolean flagRateio;
    private String flagFormula;
    private String observacao;
    private String status;

    @Override
    public String toString() {
        return "MovimentoCaixa{" + "id=" + id + ", dataEmissao=" + dataEmissao + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + ", valorEmitido=" + valorEmitido + ", multas=" + multas + ", correcaoMonetaria=" + correcaoMonetaria + ", juros=" + juros + ", valorPagRec=" + valorPagRec + ", tipo=" + tipo + ", flagRateio=" + flagRateio + ", flagFormula=" + flagFormula + ", observacao=" + observacao + ", status=" + status + '}';
    }

    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, String dataEmissao, String dataVencimento, String dataPagamento,
            float valorEmitido, float multas, float correcaoMonetaria, float juros, float valorPagRec,
            String tipo, boolean flagRateio, String flagFormula, String observacao, String status) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valorEmitido = valorEmitido;
        this.multas = multas;
        this.correcaoMonetaria = correcaoMonetaria;
        this.juros = juros;
        this.valorPagRec = valorPagRec;
        this.tipo = tipo;
        this.flagRateio = flagRateio;
        this.flagFormula = flagFormula;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getMultas() {
        return multas;
    }

    public void setMultas(float multas) {
        this.multas = multas;
    }

    public float getCorrecaoMonetaria() {
        return correcaoMonetaria;
    }

    public void setCorrecaoMonetaria(float correcaoMonetaria) {
        this.correcaoMonetaria = correcaoMonetaria;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getValorPagRec() {
        return valorPagRec;
    }

    public void setValorPagRec(float valorPagRec) {
        this.valorPagRec = valorPagRec;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFlagRateio() {
        return flagRateio;
    }

    public void setFlagRateio(boolean flagRateio) {
        this.flagRateio = flagRateio;
    }

    public String getFlagFormula() {
        return flagFormula;
    }

    public void setFlagFormula(String flagFormula) {
        this.flagFormula = flagFormula;
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
