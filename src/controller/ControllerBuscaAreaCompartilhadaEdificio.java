package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.TelaBuscaAreaCompartilhadaEdificio;

public class ControllerBuscaAreaCompartilhadaEdificio implements ActionListener {

    TelaBuscaAreaCompartilhadaEdificio telaBuscaAreaCompartilhadaEdificio;

    public ControllerBuscaAreaCompartilhadaEdificio(TelaBuscaAreaCompartilhadaEdificio telaBuscaAreaCompartilhadaEdificio) {
        this.telaBuscaAreaCompartilhadaEdificio = telaBuscaAreaCompartilhadaEdificio;
        this.telaBuscaAreaCompartilhadaEdificio.getjBtCarregar().addActionListener(this);
        this.telaBuscaAreaCompartilhadaEdificio.getjBtPesquisar().addActionListener(this);
        this.telaBuscaAreaCompartilhadaEdificio.getjBtSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaBuscaAreaCompartilhadaEdificio.getjBtCarregar()) {

        } else if (action.getSource() == this.telaBuscaAreaCompartilhadaEdificio.getjBtPesquisar()) {

            if (this.telaBuscaAreaCompartilhadaEdificio.getjComboFiltrar().getSelectedItem().toString().equals("Id")) {
                JOptionPane.showMessageDialog(null, "ID");
            }

        } else if (action.getSource() == this.telaBuscaAreaCompartilhadaEdificio.getjBtSair()) {
            this.telaBuscaAreaCompartilhadaEdificio.dispose();
        }
    }
}
