package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaProprietario;

public class ControllerBuscaProprietario implements ActionListener {

    TelaBuscaProprietario telaBuscaProprietario;

    public ControllerBuscaProprietario(TelaBuscaProprietario telaBuscaProprietario) {
        this.telaBuscaProprietario = telaBuscaProprietario;
        this.telaBuscaProprietario.getjBtCarregar().addActionListener(this);
        this.telaBuscaProprietario.getjBtPesquisar().addActionListener(this);
        this.telaBuscaProprietario.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaProprietario.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaProprietario.getjBtPesquisar()) {

            if (this.telaBuscaProprietario.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaProprietario.getjComboFiltrar().getSelectedItem().toString().equals("Nome Fantasia")) {
                JOptionPane.showMessageDialog(null, "Nome Fantasia");
            } else if (this.telaBuscaProprietario.getjComboFiltrar().getSelectedItem().toString().equals("CPF")) {
                JOptionPane.showMessageDialog(null, "CPF");
            } else if (this.telaBuscaProprietario.getjComboFiltrar().getSelectedItem().toString().equals("CNPJ")) {
                JOptionPane.showMessageDialog(null, "CNPJ");
            }

        } else if (action.getSource() == this.telaBuscaProprietario.getjBtSair()) {
            this.telaBuscaProprietario.dispose();
        }
    }
}
