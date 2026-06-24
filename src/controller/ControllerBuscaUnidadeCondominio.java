package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaUnidadeCondominio;

public class ControllerBuscaUnidadeCondominio implements ActionListener {

    TelaBuscaUnidadeCondominio telaBuscaUnidadeCondominio;

    public ControllerBuscaUnidadeCondominio(TelaBuscaUnidadeCondominio telaBuscaUnidadeCondominio) {
        this.telaBuscaUnidadeCondominio = telaBuscaUnidadeCondominio;
        this.telaBuscaUnidadeCondominio.getjBtCarregar().addActionListener(this);
        this.telaBuscaUnidadeCondominio.getjBtPesquisar().addActionListener(this);
        this.telaBuscaUnidadeCondominio.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaUnidadeCondominio.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaUnidadeCondominio.getjBtPesquisar()) {

            if (this.telaBuscaUnidadeCondominio.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaUnidadeCondominio.getjComboFiltrar().getSelectedItem().toString().equals("Status")) {
                JOptionPane.showMessageDialog(null, "Status");
            }

        } else if (action.getSource() == this.telaBuscaUnidadeCondominio.getjBtSair()) {
            this.telaBuscaUnidadeCondominio.dispose();
        }
    }
}
