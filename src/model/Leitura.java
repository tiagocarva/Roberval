package model;

public class Leitura {

    private int id;
    private String dataLeitura;
    private int mesReferencia;
    private int anoReferencia;
    private float medicaoAnterior;
    private float medicaoAtual;
    private String tipo;
    private String observacao;
    private String status;

    @Override
    public String toString() {
        return "Leitura{" + "id=" + id + ", dataLeitura=" + dataLeitura + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia + ", medicaoAnterior=" + medicaoAnterior + ", medicaoAtual=" + medicaoAtual + ", tipo=" + tipo + ", observacao=" + observacao + ", status=" + status + '}';
    }

    public Leitura() {
    }

    public Leitura(int id, String dataLeitura, int mesReferencia, int anoReferencia,
            float medicaoAnterior, float medicaoAtual, String tipo, String observacao, String status) {
        this.id = id;
        this.dataLeitura = dataLeitura;
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.medicaoAnterior = medicaoAnterior;
        this.medicaoAtual = medicaoAtual;
        this.tipo = tipo;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
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

    public float getMedicaoAnterior() {
        return medicaoAnterior;
    }

    public void setMedicaoAnterior(float medicaoAnterior) {
        this.medicaoAnterior = medicaoAnterior;
    }

    public float getMedicaoAtual() {
        return medicaoAtual;
    }

    public void setMedicaoAtual(float medicaoAtual) {
        this.medicaoAtual = medicaoAtual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
