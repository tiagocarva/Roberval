package model;

public class Condominio {

    private int id;
    private int mesReferencia;
    private int anoReferencia;
    private String dataEmissao;
    private String dataVencimento;
    private float juros;
    private float multas;
    private float correcao;
    private float valorNominal;
    private float valorPago;
    private String observacao;
    private String status;

    @Override
    public String toString() {
        return "Condominio{" + "id=" + id + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia + ", dataEmissao=" + dataEmissao + ", dataVencimento=" + dataVencimento + ", juros=" + juros + ", multas=" + multas + ", correcao=" + correcao + ", valorNominal=" + valorNominal + ", valorPago=" + valorPago + ", observacao=" + observacao + ", status=" + status + '}';
    }

    public Condominio() {
    }

    public Condominio(int id, int mesReferencia, int anoReferencia, String dataEmissao, String dataVencimento,
            float juros, float multas, float correcao, float valorNominal, float valorPago,
            String observacao, String status) {
        this.id = id;
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.juros = juros;
        this.multas = multas;
        this.correcao = correcao;
        this.valorNominal = valorNominal;
        this.valorPago = valorPago;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(int mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public int getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        this.anoReferencia = anoReferencia;
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

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getMultas() {
        return multas;
    }

    public void setMultas(float multas) {
        this.multas = multas;
    }

    public float getCorrecao() {
        return correcao;
    }

    public void setCorrecao(float correcao) {
        this.correcao = correcao;
    }

    public float getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(float valorNominal) {
        this.valorNominal = valorNominal;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
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
