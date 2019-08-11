/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locacao.GUI;

import Locacao.Classes.Registro;
import Locacao.DAO.ErpDAOException;
import Locacao.DAO.RegistroDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author gabri
 */
public class VerRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VerRegistro
     */
    public VerRegistro()  {
        initComponents();
        try {
            carregaTabelaRegistros();
        } catch (ErpDAOException ex) {
            Logger.getLogger(VerRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LCT = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(LCT);

        jButton1.setText("Sair");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

   private static void carregaRegistros() {
        try {
            RegistroDAO RDAO = new RegistroDAO();
            Registro = RDAO.listar();
        } catch (ErpDAOException ex) {
            System.out.println("problema");
        }
    }
   public void carregaTabelaRegistros() throws ErpDAOException {
        carregaRegistros();

        ValoresRegistros.removeAllElements();
        String aux = "";
        for (int i = 0; i < Registro.size(); i++) {

            String veiculo = "";                        
            aux = Registro.get(i).getModelo() + " - " + "Alugado" + " - " + Registro.get(i).getPlaca() + " - " + Registro.get(i).getNome() + " / Locado em: " + Registro.get(i).getDataInicio() + " / Vencimento em: " + Registro.get(i).getDataFim();
            
            ValoresRegistros.addElement(aux);
            LCT.removeAll();
            LCT.setModel(ValoresRegistros);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> LCT;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private static DefaultListModel ValoresRegistros = new DefaultListModel();
private static ArrayList<Registro> Registro = new ArrayList<Registro>();
}
