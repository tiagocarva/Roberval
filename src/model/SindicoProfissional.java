package model;

public class SindicoProfissional extends Pessoa {

    private String cra;

    @Override
    public String toString() {
        return "SindicoProfissional{" + "cra=" + cra + '}';
    }

    public SindicoProfissional() {
    }

    public SindicoProfissional(int id, String nomeFantasia, String razaoSocial, String cpf, String rg, String cnpj,
            String inscricaoFederal, String inscricaoEstadual, String fone1, String fone2, String email,
            String dataNascimento, String dataCadastro, String estadoCivil, String cep, String logradouro,
            String cidade, String bairro, String complemento, String observacao, String tipoPessoa,
            String status, String cra) {
        super(id, nomeFantasia, razaoSocial, cpf, rg, cnpj, inscricaoFederal, inscricaoEstadual,
                fone1, fone2, email, dataNascimento, dataCadastro, estadoCivil, cep, logradouro,
                cidade, bairro, complemento, observacao, tipoPessoa, status);
        this.cra = cra;
    }

    public String getCra() {
        return cra;
    }

    public void setCra(String cra) {
        this.cra = cra;
    }

}
