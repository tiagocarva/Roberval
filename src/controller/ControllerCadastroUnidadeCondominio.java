package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.TelaBuscaUnidadeCondominio;
import view.Cadastro.TelaCadastroUnidadeCondomino;

public class ControllerCadastroUnidadeCondominio implements ActionListener {

    TelaCadastroUnidadeCondomino telaCadastroUnidadeCondomino;

    public ControllerCadastroUnidadeCondominio(TelaCadastroUnidadeCondomino telaCadastroUnidadeCondomino) {
        this.telaCadastroUnidadeCondomino = telaCadastroUnidadeCondomino;

        this.telaCadastroUnidadeCondomino.getjButtonNovo().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonCancelar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonGravar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonBuscar().addActionListener(this);
        this.telaCadastroUnidadeCondomino.getjButtonSair().addActionListener(this);

        utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonNovo()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), false);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), true, null);

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonCancelar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonGravar()) {
            utilities.Utilities.AtivaDesativa(this.telaCadastroUnidadeCondomino.getjPanelbotoes(), true);
            utilities.Utilities.LimpaComponentes(this.telaCadastroUnidadeCondomino.getjPanelDados(), false, null);

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonBuscar()) {
            TelaBuscaUnidadeCondominio telaBuscaUnidadeCondominio = new TelaBuscaUnidadeCondominio(null, true);
            ControllerBuscaUnidadeCondominio controllerBuscaUnidadeCondominio = new ControllerBuscaUnidadeCondominio(telaBuscaUnidadeCondominio);
            telaBuscaUnidadeCondominio.setVisible(true);

        } else if (action.getSource() == this.telaCadastroUnidadeCondomino.getjButtonSair()) {
            this.telaCadastroUnidadeCondomino.dispose();
        }
    }
}
