package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaAreaCompartilhada;

public class ControllerBuscaAreaCompartilhada implements ActionListener {

    TelaBuscaAreaCompartilhada telaBuscaAreaCompartilhada;

    public ControllerBuscaAreaCompartilhada(TelaBuscaAreaCompartilhada telaBuscaAreaCompartilhada) {
        this.telaBuscaAreaCompartilhada = telaBuscaAreaCompartilhada;
        this.telaBuscaAreaCompartilhada.getjBtCarregar().addActionListener(this);
        this.telaBuscaAreaCompartilhada.getjBtPesquisar().addActionListener(this);
        this.telaBuscaAreaCompartilhada.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtPesquisar()) {

            if (this.telaBuscaAreaCompartilhada.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaAreaCompartilhada.getjComboFiltrar().getSelectedItem().toString().equals("Descrição")) {
                JOptionPane.showMessageDialog(null, "Descrição");
            }

        } else if (action.getSource() == this.telaBuscaAreaCompartilhada.getjBtSair()) {
            this.telaBuscaAreaCompartilhada.dispose();
        }
    }
}
