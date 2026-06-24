package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.TelaBuscaProprietario;
import view.Cadastro.TelaCadastroProprietario;

public class ControllerCadastroProprietario implements ActionListener {

    TelaCadastroProprietario telaCadastroProprietario;

    public ControllerCadastroProprietario(TelaCadastroProprietario telaCadastroProprietario) {
        this.telaCadastroProprietario = telaCadastroProprietario;

        this.telaCadastroProprietario.getjButtonNovo().addActionListener(this);
        this.telaCadastroProprietario.getjButtonCancelar().addActionListener(this);
        this.telaCadastroProprietario.getjButtonGravar().addActionListener(this);
        this.telaCadastroProprietario.getjButtonBuscar().addActionListener(this);
        this.telaCadastroProprietario.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroProprietario.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroProprietario.getjButtonNovo()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroProprietario.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroProprietario.getjPanelDados(), true, null);

        } else if (action.getSource() == this.telaCadastroProprietario.getjButtonCancelar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroProprietario.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroProprietario.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroProprietario.getjButtonGravar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroProprietario.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroProprietario.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroProprietario.getjButtonBuscar()) {
            TelaBuscaProprietario telaBuscaProprietario = new TelaBuscaProprietario(null, true);
            ControllerBuscaProprietario controllerBuscaProprietario = new ControllerBuscaProprietario(telaBuscaProprietario);
            telaBuscaProprietario.setVisible(true);

        } else if (action.getSource() == this.telaCadastroProprietario.getjButtonSair()) {
            this.telaCadastroProprietario.dispose();
        }
    }
}
