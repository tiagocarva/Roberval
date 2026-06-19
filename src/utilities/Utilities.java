package utilities;

import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilities {

    public static void AtivaDesativa(JPanel painelBotoes, boolean estadoBotao) {
        Component[] listaComponentes = painelBotoes.getComponents();
        for (Component componenteAtual : listaComponentes) {
            if (componenteAtual instanceof JButton) {
                if (((JButton) componenteAtual).getActionCommand() == "0") {
                    componenteAtual.setEnabled(estadoBotao);
                } else {
                    componenteAtual.setEnabled(!estadoBotao);
                }
            }
        }
    }

    public static void LimpaComponentes(JPanel painel, boolean estadoComponentes, ButtonGroup grupoRadio) {
        Component[] listaComponentes = painel.getComponents();
        
        if(grupoRadio != null){
            grupoRadio.clearSelection();
        }
        for (Component componenteAtual : listaComponentes) {
            if (componenteAtual instanceof JTextField) {
                ((JTextField) componenteAtual).setText("");
                componenteAtual.setEnabled(estadoComponentes);
            }else if(componenteAtual instanceof JFormattedTextField){
                ((JFormattedTextField) componenteAtual).setText("");
                componenteAtual.setEnabled(estadoComponentes);
            }else if (componenteAtual instanceof JComboBox){
                ((JComboBox) componenteAtual).setSelectedIndex(-1);
                componenteAtual.setEnabled(estadoComponentes);
            }else if(componenteAtual instanceof JRadioButton){
               componenteAtual.setEnabled(estadoComponentes);
               ((JRadioButton) componenteAtual).setSelected(false);
            }else if (componenteAtual instanceof JTextArea){
                ((JTextArea) componenteAtual).setText("");
                componenteAtual.setEnabled(estadoComponentes);
            }  
        }
    }
}