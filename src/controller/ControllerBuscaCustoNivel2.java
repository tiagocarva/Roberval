package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaCustoNivel2;

public class ControllerBuscaCustoNivel2 implements ActionListener {

    TelaBuscaCustoNivel2 telaBuscaCustoNivel2;

    public ControllerBuscaCustoNivel2(TelaBuscaCustoNivel2 telaBuscaCustoNivel2) {
        this.telaBuscaCustoNivel2 = telaBuscaCustoNivel2;
        this.telaBuscaCustoNivel2.getjBtCarregar().addActionListener(this);
        this.telaBuscaCustoNivel2.getjBtPesquisar().addActionListener(this);
        this.telaBuscaCustoNivel2.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaCustoNivel2.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaCustoNivel2.getjBtPesquisar()) {

            if (this.telaBuscaCustoNivel2.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            } else if (this.telaBuscaCustoNivel2.getjComboFiltrar().getSelectedItem().toString().equals("Descrição")) {
                JOptionPane.showMessageDialog(null, "Descrição");
            }

        } else if (action.getSource() == this.telaBuscaCustoNivel2.getjBtSair()) {
            this.telaBuscaCustoNivel2.dispose();
        }
    }
}
