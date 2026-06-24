package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.TelaBuscaAreaCompartilhada;
import view.Cadastro.TelaCadastroAreaCompartilhada;

public class ControllerCadastroAreaCompartilhada implements ActionListener {

    TelaCadastroAreaCompartilhada telaCadastroAreaCompartilhada;

    public ControllerCadastroAreaCompartilhada(TelaCadastroAreaCompartilhada telaCadastroAreaCompartilhada) {
        this.telaCadastroAreaCompartilhada = telaCadastroAreaCompartilhada;

        this.telaCadastroAreaCompartilhada.getjButtonNovo().addActionListener(this);
        this.telaCadastroAreaCompartilhada.getjButtonCancelar().addActionListener(this);
        this.telaCadastroAreaCompartilhada.getjButtonGravar().addActionListener(this);
        this.telaCadastroAreaCompartilhada.getjButtonBuscar().addActionListener(this);
        this.telaCadastroAreaCompartilhada.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhada.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroAreaCompartilhada.getjButtonNovo()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhada.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhada.getjPanelDados(), true, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhada.getjButtonCancelar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhada.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhada.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhada.getjButtonGravar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroAreaCompartilhada.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroAreaCompartilhada.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhada.getjButtonBuscar()) {
            TelaBuscaAreaCompartilhada telaBuscaAreaCompartilhada = new TelaBuscaAreaCompartilhada(null, true);
            ControllerBuscaAreaCompartilhada controllerBuscaAreaCompartilhada = new ControllerBuscaAreaCompartilhada(telaBuscaAreaCompartilhada);
            telaBuscaAreaCompartilhada.setVisible(true);

        } else if (action.getSource() == this.telaCadastroAreaCompartilhada.getjButtonSair()) {
            this.telaCadastroAreaCompartilhada.dispose();
        }
    }
}
