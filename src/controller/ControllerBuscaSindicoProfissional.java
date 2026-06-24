package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaSindicoProfissional;

public class ControllerBuscaSindicoProfissional implements ActionListener {

    TelaBuscaSindicoProfissional telaBuscaSindicoProfissional;

    public ControllerBuscaSindicoProfissional(TelaBuscaSindicoProfissional telaBuscaSindicoProfissional) {
        this.telaBuscaSindicoProfissional = telaBuscaSindicoProfissional;
        this.telaBuscaSindicoProfissional.getjBtCarregar().addActionListener(this);
        this.telaBuscaSindicoProfissional.getjBtPesquisar().addActionListener(this);
        this.telaBuscaSindicoProfissional.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtPesquisar()) {

            if (this.telaBuscaSindicoProfissional.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaSindicoProfissional.getjComboFiltrar().getSelectedItem().toString().equals("CPF")) {
                JOptionPane.showMessageDialog(null, "CPF");
            } else if (this.telaBuscaSindicoProfissional.getjComboFiltrar().getSelectedItem().toString().equals("CNPJ")) {
                JOptionPane.showMessageDialog(null, "CNPJ");
            } else if (this.telaBuscaSindicoProfissional.getjComboFiltrar().getSelectedItem().toString().equals("Nome Fantasia")) {
                JOptionPane.showMessageDialog(null, "Nome Fantasia");
            }

        } else if (action.getSource() == this.telaBuscaSindicoProfissional.getjBtSair()) {
            this.telaBuscaSindicoProfissional.dispose();
        }
    }
}
