package Locacao.DAO;


import Locacao.Classes.Registro;
import Locacao.Classes.locacao;
import Locacao.Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class RegistroDAO {
    
    private Connection conn;

    public RegistroDAO() throws ErpDAOException {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            throw new ErpDAOException("Erro de conexão: " + ":\n" + e.getMessage());
        }
    }
    
    public ArrayList listar() throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "select locacao.ID_Locacao, locacao.ID_veiculo, veiculo.modelo, veiculo.placa, cliente.nome, locacao.dataInicio, locacao.dataFim from veiculo, cliente, locacao where veiculo.ID_Veiculo=locacao.ID_veiculo and cliente.ID_Cliente=locacao.ID_cliente;";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            ArrayList registro = new ArrayList();

            while (rs.next()) {
                int ID_Registro = rs.getInt("locacao.ID_Locacao");
                int ID_Veiculo = rs.getInt("locacao.ID_veiculo");
                String modelo = rs.getString("veiculo.modelo");
                String placa = rs.getString("veiculo.placa");
                String nome = rs.getString("cliente.nome");
                Date dataInicio = rs.getDate("locacao.dataInicio");
                Date dataFim = rs.getDate("locacao.dataFim");
           
                registro.add(new Registro(ID_Registro,ID_Veiculo,modelo,placa,nome,dataInicio,dataFim));

            }

            return registro;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao listar registros " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void inserir(locacao loca) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
       
        try {
            String SQL = "INSERT INTO locacao (ID_cliente, ID_veiculo, dataInicio, dataFim) VALUES ( ?,?,?,?)";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, loca.getID_cliente());
            ps.setInt(2, loca.getID_veiculo());
            java.util.Date dataJAVA = loca.getDataInicio();  // Data da classe Java Util;;
            if (dataJAVA != null) {
                java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
                ps.setDate(3, dataSQL);
            }
            else{//            java.util.Date dataJAVA = cliente.getDataNasc();  // Data da classe Java Util;;
            
                java.sql.Date dataSQL = null ;
                ps.setDate(3, dataSQL );
            }
            // ===================================================================================================
            java.util.Date dataJAVA2 = loca.getDataFim();  // Data da classe Java Util;;
            if (dataJAVA != null) {
                java.sql.Date dataSQL2 = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
                ps.setDate(4, dataSQL2);
            }
            else{//            java.util.Date dataJAVA = cliente.getDataNasc();  // Data da classe Java Util;;
            
                java.sql.Date dataSQL2 = null ;
                ps.setDate(4, dataSQL2 );
            }
            
           
            
            ps.executeUpdate();
            
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir uma novos registros " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void excluir(int codigo) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        
        try {
            
            String SQL = "DELETE FROM locacao WHERE ID_Locacao=?";
            connL = this.conn;
            
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
            
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao excluir registro " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    
    
    
    
}
