package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaFornecedores;

public class ControllerBuscaFornecedores implements ActionListener {

    TelaBuscaFornecedores telaBuscaFornecedores;

    public ControllerBuscaFornecedores(TelaBuscaFornecedores telaBuscaFornecedores) {
        this.telaBuscaFornecedores = telaBuscaFornecedores;
        this.telaBuscaFornecedores.getjBtCarregar().addActionListener(this);
        this.telaBuscaFornecedores.getjBtPesquisar().addActionListener(this);
        this.telaBuscaFornecedores.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaFornecedores.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaFornecedores.getjBtPesquisar()) {

            if (this.telaBuscaFornecedores.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaFornecedores.getjComboFiltrar().getSelectedItem().toString().equals("Tipo de Pessoa")) {
                JOptionPane.showMessageDialog(null, "Tipo de Pessoa");
            } else if (this.telaBuscaFornecedores.getjComboFiltrar().getSelectedItem().toString().equals("CNPJ")) {
                JOptionPane.showMessageDialog(null, "CNPJ");
            } else if (this.telaBuscaFornecedores.getjComboFiltrar().getSelectedItem().toString().equals("CPF")) {
                JOptionPane.showMessageDialog(null, "CPF");
            } else if (this.telaBuscaFornecedores.getjComboFiltrar().getSelectedItem().toString().equals("Nome Fantasia")) {
                JOptionPane.showMessageDialog(null, "Nome Fantasia");
            }

        } else if (action.getSource() == this.telaBuscaFornecedores.getjBtSair()) {
            this.telaBuscaFornecedores.dispose();
        }
    }
}
