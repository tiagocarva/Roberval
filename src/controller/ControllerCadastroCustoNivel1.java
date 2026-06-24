package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.TelaBuscaCustoNivel1;
import view.Cadastro.TelaCadastroCustoNivel1;

public class ControllerCadastroCustoNivel1 implements ActionListener {

    TelaCadastroCustoNivel1 telaCadastroCustoNivel1;

    public ControllerCadastroCustoNivel1(TelaCadastroCustoNivel1 telaCadastroCustoNivel1) {
        this.telaCadastroCustoNivel1 = telaCadastroCustoNivel1;

        this.telaCadastroCustoNivel1.getjButtonNovo().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonCancelar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonGravar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonBuscar().addActionListener(this);
        this.telaCadastroCustoNivel1.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonNovo()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), true, null);

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonCancelar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonGravar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroCustoNivel1.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroCustoNivel1.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonBuscar()) {
            TelaBuscaCustoNivel1 telaBuscaCustoNivel1 = new TelaBuscaCustoNivel1(null, true);
            ControllerBuscaCustoNivel1 controllerBuscaCustoNivel1 = new ControllerBuscaCustoNivel1(telaBuscaCustoNivel1);
            telaBuscaCustoNivel1.setVisible(true);

        } else if (action.getSource() == this.telaCadastroCustoNivel1.getjButtonSair()) {
            this.telaCadastroCustoNivel1.dispose();
        }
    }
}
