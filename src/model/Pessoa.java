package model;

public abstract class Pessoa {

    private int id;
    private String nomeFantasia;
    private String razaoSocial;
    private String cpf;
    private String rg;
    private String cnpj;
    private String inscricaoFederal;
    private String inscricaoEstadual;
    private String fone1;
    private String fone2;
    private String email;
    private String dataNascimento;
    private String dataCadastro;
    private String estadoCivil;
    private String cep;
    private String logradouro;
    private String cidade;
    private String bairro;
    private String complemento;
    private String observacao;
    private String tipoPessoa;
    private String status;

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cpf=" + cpf + ", rg=" + rg + ", cnpj=" + cnpj + ", inscricaoFederal=" + inscricaoFederal + ", inscricaoEstadual=" + inscricaoEstadual + ", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + ", estadoCivil=" + estadoCivil + ", cep=" + cep + ", logradouro=" + logradouro + ", cidade=" + cidade + ", bairro=" + bairro + ", complemento=" + complemento + ", observacao=" + observacao + ", tipoPessoa=" + tipoPessoa + ", status=" + status + '}';
    }

    public Pessoa() {
    }

    public Pessoa(int id, String nomeFantasia, String razaoSocial, String cpf, String rg, String cnpj,
            String inscricaoFederal, String inscricaoEstadual, String fone1, String fone2, String email,
            String dataNascimento, String dataCadastro, String estadoCivil, String cep, String logradouro,
            String cidade, String bairro, String complemento, String observacao, String tipoPessoa, String status) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
        this.cnpj = cnpj;
        this.inscricaoFederal = inscricaoFederal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.observacao = observacao;
        this.tipoPessoa = tipoPessoa;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoFederal() {
        return inscricaoFederal;
    }

    public void setInscricaoFederal(String inscricaoFederal) {
        this.inscricaoFederal = inscricaoFederal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
