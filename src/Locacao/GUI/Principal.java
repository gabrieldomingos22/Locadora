/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locacao.GUI;

import Locacao.Classes.Cliente;
import Locacao.Classes.Veiculo;
import Locacao.DAO.ClienteDAO;
import Locacao.DAO.ErpDAOException;
import Locacao.DAO.VeiculoDAO;
import javax.swing.JFrame;
import Locacao.GUI.InserirCliente;
import java.util.ArrayList;

/**
 *
 * @author 275700
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locacao/GUI/coollogo_com-3633989.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu10.setBackground(new java.awt.Color(0, 0, 0));
        jMenu10.setForeground(new java.awt.Color(255, 255, 255));
        jMenu10.setText("Registros");
        jMenu10.setMaximumSize(new java.awt.Dimension(65, 500));

        jMenu6.setText("Locar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu6);

        jMenu9.setText("Excluir");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu9);

        jMenu11.setText("Ver");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu11);

        jMenuBar1.add(jMenu10);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Veiculo");

        jMenu2.setText("Inserir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu2);

        jMenu5.setText("Alterar e Excluir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Cliente");

        jMenu7.setText("Inserir");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu7);

        jMenu8.setText("Alterar e Excluir");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu8);

        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Configuração");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // chama inserir
        JFrame Janela = new InserirCliente();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // chama exclusão
        JFrame Janela = new ExclusaoCliente();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // chama configuração
        JFrame Janela = new Configuracoes();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // inserir Veiculo
        JFrame Janela = new InserirVeiculo();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // excluir veiculo
        JFrame Janela = new ExclusaoVeiculo();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     
        
    }//GEN-LAST:event_formComponentShown

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
       JFrame Janela = new InserirRegistro();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        JFrame Janela = new ExclusaoRegistro();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
       JFrame Janela = new VerRegistro();
        Janela.setLocationRelativeTo(null); //Centraliza a Janela
        Janela.setVisible(true);
    }//GEN-LAST:event_jMenu11MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    private static ArrayList<Cliente> locacao = new ArrayList<Cliente>();
    private static ArrayList<Veiculo> locacao2 = new ArrayList<Veiculo>();
    int codigo = 0, codigo2 = 0;
    int altera = 0;
}
