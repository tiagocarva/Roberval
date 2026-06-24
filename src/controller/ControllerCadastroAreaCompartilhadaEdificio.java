package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.TelaBuscaAreaCompartilhadaEdificio;
import view.Cadastro.TelaCadastroAreaCompartilhadaEdificio;

public class ControllerCadastroAreaCompartilhadaEdificio implements ActionListener {

    TelaCadastroAreaCompartilhadaEdificio telaCadastroAreaCompartilhadaEdificio;

    public ControllerCadastroAreaCompartilhadaEdificio(TelaCadastroAreaCompartilhadaEdificio telaCadastroAreaCompartilhadaEdificio) {
        this.telaCadastroAreaCompartilhadaEdificio = telaCadastroAreaCompartilhadaEdificio;

        this.telaCadastroAreaCompartilhadaEdificio.getjButtonNovo().addActionListener(this);
        this.telaCadastroAreaCompartilhadaEdificio.getjButtonCancelar().addActionListener(this);
        this.telaCadastroAreaCompartilhadaEdificio.getjButtonGravar().addActionListener(this);
        this.telaCadastroAreaCompartilhadaEdificio.getjButtonBuscar().addActionListener(this);
        this.telaCadastroAreaCompartilhadaEdificio.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhadaEdificio.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroAreaCompartilhadaEdificio.getjButtonNovo()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhadaEdificio.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhadaEdificio.getjPanelDados(), true, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhadaEdificio.getjButtonCancelar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhadaEdificio.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhadaEdificio.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhadaEdificio.getjButtonGravar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhadaEdificio.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhadaEdificio.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhadaEdificio.getjButtonBuscar()) {
            TelaBuscaAreaCompartilhadaEdificio telaBuscaAreaCompartilhadaEdificio = new TelaBuscaAreaCompartilhadaEdificio(null, true);
            ControllerBuscaAreaCompartilhadaEdificio controllerBuscaAreaCompartilhadaEdificio = new ControllerBuscaAreaCompartilhadaEdificio(telaBuscaAreaCompartilhadaEdificio);
            telaBuscaAreaCompartilhadaEdificio.setVisible(true);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhadaEdificio.getjButtonSair()) {
            this.telaCadastroAreaCompartilhadaEdificio.dispose();
        }
    }
}
