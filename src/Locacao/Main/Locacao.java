package Locacao.Main;

import Locacao.GUI.Principal;
import javax.swing.JFrame;
import Locacao.DAO.ErpDAOException;

public class Locacao {

    public static void main(String[] args) throws ErpDAOException {
        JFrame JanelaPrincipal = new Principal();
        JanelaPrincipal.setLocationRelativeTo(null); //Centraliza a Janela
        JanelaPrincipal.setVisible(true);

    }
}
